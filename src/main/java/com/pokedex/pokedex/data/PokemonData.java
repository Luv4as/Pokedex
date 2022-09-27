package com.pokedex.pokedex.data;

import com.pokedex.pokedex.api.ApiClient;
import com.pokedex.pokedex.api.ApiInterface;
import com.pokedex.pokedex.model.pkm.Pokemon;
import com.pokedex.pokedex.model.pkm.PokemonMovement;

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
        this.pokemonList = getAllPokemons();
    }

    public List<Pokemon> getAllPokemons() {
        if(pokemonList.isEmpty()) {
            List<Pokemon> pokemons = new ArrayList<Pokemon>();
            ApiInterface api = ApiClient.getClient().create(ApiInterface.class);

            for (int i = 1; i <= 3; i++) {
                System.out.println(i);
                try {
                    Pokemon pk = api.getPokemon(i).execute().body();

                    boolean canGetMovementDetail = true;
                    int countMovementDetail = 0;

                    while (canGetMovementDetail) {
                        try {
                            pk.getAllMovements().get(countMovementDetail).setMove(api.getMoveDetails(pk.getAllMovements().get(countMovementDetail).getMove().getName()).execute().body());
                            System.out.println(countMovementDetail);
                            countMovementDetail += 1;
                        } catch(Exception error) {
                            canGetMovementDetail = false;
                        }
                    }
                    pokemons.add(pk);
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }

            return pokemons;
        }

        return null;
    }

    public PokemonMovement getPokemonMovementDetail(String name) {
        ApiInterface api = ApiClient.getClient().create(ApiInterface.class);
        try {
            PokemonMovement move = api.getMoveDetails(name).execute().body();
            return move;
        } catch (Exception ex) {
            System.out.println(ex);

        }
        return null;
    }

        public Pokemon getPokemonInList(int index) {
        return pokemonList.get(index);
    }
}
