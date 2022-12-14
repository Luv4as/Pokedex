package com.pokedex.pokedex.model.pkm;

import java.time.LocalDate;
import java.util.List;

public class PokemonBattle {
    private int idBattle;
    private LocalDate battleDate;
    private boolean wonBattle;
    private List<CapturedPokemon> homePokemons;
    private List<CapturedPokemon> visitorPokemons;

    PokemonBattle(int idBattle, LocalDate battleDate, boolean wonBattle, List<CapturedPokemon> homePokemons, List<CapturedPokemon> visitorPokemons) {
        this.idBattle = idBattle;
        this.battleDate = battleDate;
        this.wonBattle = wonBattle;
        this.homePokemons = homePokemons;
        this.visitorPokemons = visitorPokemons;
    }

    public int getIdBattle() {
        return idBattle;
    }

    public void setIdBattle(int idBattle) {
        this.idBattle = idBattle;
    }

    public LocalDate getBattleDate() {
        return battleDate;
    }

    public void setBattleDate(LocalDate battleDate) {
        this.battleDate = battleDate;
    }

    public boolean isWonBattle() {
        return wonBattle;
    }

    public void setWonBattle(boolean wonBattle) {
        this.wonBattle = wonBattle;
    }

    public List<CapturedPokemon> getHomePokemons() {
        return homePokemons;
    }

    public void setHomePokemons(List<CapturedPokemon> homePokemons) {
        this.homePokemons = homePokemons;
    }

    public List<CapturedPokemon> getVisitorPokemons() {
        return visitorPokemons;
    }

    public void setVisitorPokemons(List<CapturedPokemon> visitorPokemons) {
        this.visitorPokemons = visitorPokemons;
    }
}
