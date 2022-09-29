package com.pokedex.pokedex.data;

import com.pokedex.pokedex.api.ApiClient;
import com.pokedex.pokedex.api.ApiInterface;
import com.pokedex.pokedex.firebase.DatabaseInstance;
import com.pokedex.pokedex.model.pkm.Pokemon;
import com.pokedex.pokedex.picasso.SpriteResponse;
import com.squareup.picasso.Picasso;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.ArrayList;
import java.util.List;

public class PokemonData {
    private List<Pokemon> pokemonList = new ArrayList<Pokemon>();
    private static PokemonData instance;

    public static PokemonData getInstance() {
        if(instance == null) {
            instance = new PokemonData();
        }
        return instance;
    }

    public PokemonData() {
        this.getAllPokemons();
    }

    public void getAllPokemons() {
        if(pokemonList.isEmpty()) {
            try {
                GetPokemonOnDatabase();
            } catch (Exception err) {
                SetPokemonOnDatabase();
            }
//            System.out.println(getPokemonInList(24).getName());
        }
    }

    public void GetPokemonOnDatabase() {
        for (int i = 1; i <= 151; i++) {
            System.out.println(i);
            DatabaseInstance.GetPokemon("pokemons", i, "name");
            DatabaseInstance.GetPokemon("pokemons", i, "sprite");
            DatabaseInstance.GetPokemon("pokemons", i, "type");
        }
    }

    public void SetPokemonOnDatabase() {
        ApiInterface api = ApiClient.getClient().create(ApiInterface.class);

        for (int i = 1; i <= 151; i++) {
            System.out.println(i);
            try {
                Pokemon pk = api.getPokemon(i).execute().body();
                pk.setSprite(String.format("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/dream-world/%d.svg", pk.getId()));

                boolean canGetMovementDetail = true;
                int countMovementDetail = 0;

                while (canGetMovementDetail) {
                    try {
//                        pk.getAllMovements().get(countMovementDetail).setMove(api.getMoveDetails(pk.getAllMovements().get(countMovementDetail).getMove().getName()).execute().body());
                        System.out.println(countMovementDetail);
                        countMovementDetail += 1;
                    } catch(Exception error) {
                        canGetMovementDetail = false;
                    }
                }
                DatabaseInstance.Set(String.format("pokemons/%d", i), pk);
                addPokemonInList(pk);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }

    public Pokemon getPokemonInList(int index) {
        return pokemonList.get(index);
    }

    public Pokemon getPokemonInListById(int id) {
        for (int i = 0; i < pokemonList.size(); i++) {
            if(getPokemonInList(i).getId() == id) {
                return getPokemonInList(i);
            }
        }
        return null;
    }

    public void addPokemonInList(Pokemon pokemon) {
        this.pokemonList.add(pokemon);
    }
}
