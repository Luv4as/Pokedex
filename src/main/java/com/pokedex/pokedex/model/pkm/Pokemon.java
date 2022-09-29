package com.pokedex.pokedex.model.pkm;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Pokemon {
    @SerializedName("id")
    private int id;
    @SerializedName("name")
    private String name;
    @SerializedName("sprite")
    private String sprite;
    @SerializedName("types")
    private List<PokemonTypeApi> type;
    @SerializedName("moves")
    private List<PokemonMovementApi> allMovements;
    private List<Pokemon> evolutions;

    public Pokemon(int id, String name, String sprite, List<PokemonTypeApi> type, List<PokemonMovementApi> allMovements, List<Pokemon> evolutions){
        this.id = id;
        this.name = name;
        this.sprite = sprite;
        this.type = type;
        this.allMovements = allMovements;
        this.evolutions = evolutions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSprite() {
        return sprite;
    }

    public void setSprite(String sprite) {
        this.sprite = sprite;
    }

    public List<PokemonTypeApi> getType() {
        return type;
    }

    public void addType(PokemonTypeApi type) {
        this.type.add(type);
    }

    public List<PokemonMovementApi> getAllMovements() {
        return allMovements;
    }

    public void setAllMovements(List<PokemonMovementApi> allMovements) {
        this.allMovements = allMovements;
    }

    public List<Pokemon> getEvolutions() {
        return evolutions;
    }

    public void setEvolutions(List<Pokemon> evolutions) {
        this.evolutions = evolutions;
    }
}

