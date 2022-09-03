package model.pkm;

import java.util.List;

public class PokedexPokemon {
    private Pokemon basePokemon;
    private int idPokedex;
    private boolean isFavorite;
    private List<String> reactions;

    public PokedexPokemon(Pokemon basePokemon, int idPokedex, boolean isFavorite, List<String> reactions) {
        this.basePokemon = basePokemon;
        this.idPokedex = idPokedex;
        this.isFavorite = isFavorite;
        this.reactions = reactions;
    }

    public Pokemon getBasePokemon() {
        return basePokemon;
    }

    public void setBasePokemon(Pokemon basePokemon) {
        this.basePokemon = basePokemon;
    }

    public int getIdPokedex() {
        return idPokedex;
    }

    public void setIdPokedex(int idPokedex) {
        this.idPokedex = idPokedex;
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
