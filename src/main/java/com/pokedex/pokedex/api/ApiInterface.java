package com.pokedex.pokedex.api;

import com.pokedex.pokedex.model.pkm.Pokemon;
import com.pokedex.pokedex.model.pkm.PokemonMovement;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterface {

    @GET("api/v2/pokemon/{id}")
    Call<Pokemon> getPokemon(@Path("id") int id);

    @GET("api/v2/move/{name}")
    Call<PokemonMovement> getMoveDetails(@Path("name") String name);
}
