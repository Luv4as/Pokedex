package com.pokedex.pokedex.model.pkm;

import java.util.List;

public class PokedexPokemon {
    private Pokemon basePokemon;
    private boolean isFavorite;
    private List<String> reactions;

    public PokedexPokemon(Pokemon basePokemon, boolean isFavorite, List<String> reactions) {
        this.basePokemon = basePokemon;
        this.isFavorite = isFavorite;
        this.reactions = reactions;
    }

    public Pokemon getBasePokemon() {
        return basePokemon;
    }

    public void setBasePokemon(Pokemon basePokemon) {
        this.basePokemon = basePokemon;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public List<String> getReactions() {
        return reactions;
    }

    public void setReactions(List<String> reactions) {
        this.reactions = reactions;
    }
}
