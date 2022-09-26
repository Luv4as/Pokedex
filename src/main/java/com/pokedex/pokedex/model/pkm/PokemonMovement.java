package com.pokedex.pokedex.model.pkm;

import com.google.gson.annotations.SerializedName;
import com.pokedex.pokedex.api.ApiClient;
import com.pokedex.pokedex.api.ApiInterface;

public class PokemonMovement {
    private String name;
    @SerializedName("type")
    private PokemonType type;
    @SerializedName("pp")
    private int pp;
    @SerializedName("power")
    private int power;
    @SerializedName("accuracy")
    private int accuracy;

    public PokemonMovement(String name) {
        this.name = name;

        ApiInterface api = ApiClient.getClient().create(ApiInterface.class);
        try {
            PokemonMovement response = api.getMoveDetails(this.name).execute().body();
            System.out.println(response.getType());
            this.type = response.getType();
            this.pp = response.getPp();
            this.power = response.getPower();
            this.accuracy = response.getAccuracy();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PokemonType getType() {
        return type;
    }

    public void setType(PokemonType type) {
        this.type = type;
    }

    public int getPp() {
        return pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

}
