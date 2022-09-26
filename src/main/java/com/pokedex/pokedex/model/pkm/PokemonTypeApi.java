package com.pokedex.pokedex.model.pkm;

public class PokemonTypeApi {
    private int slot;
    private PokemonType type;

    public PokemonTypeApi(int slot, PokemonType type) {
        this.slot = slot;
        this.type = type;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public PokemonType getType() {
        return type;
    }

    public void setType(PokemonType type) {
        this.type = type;
    }
}
