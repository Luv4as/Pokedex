package com.pokedex.pokedex.api;

import com.pokedex.pokedex.model.pkm.Pokemon;
import com.pokedex.pokedex.model.pkm.PokemonMovement;
import com.pokedex.pokedex.picasso.SpriteResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterface {

    @GET("api/v2/pokemon/{id}")
    Call<Pokemon> getPokemon(@Path("id") int id);

    @GET("api/v2/move/{name}")
    Call<PokemonMovement> getMoveDetails(@Path("name") String name);

    @GET("{resource_uri}")
    Call<SpriteResponse> getSprite(@Path("resource_uri") String resourceUri);
}
