package com.pokedex.pokedex.model.pkm;

import com.pokedex.pokedex.enums.PokemonGames;

import java.time.LocalDate;
import java.util.List;

public class CapturedPokemon {
    private Pokemon basePokemon;
    private LocalDate captureDate;
    private PokemonItem item;
    private int level;
    private List<PokemonMovement> learnedMovements;
    private List<PokemonGames> capturedInGames;

    CapturedPokemon(Pokemon basePokemon, LocalDate captureDate, PokemonItem item, int level, List<PokemonMovement> learnedMovements, List<PokemonGames> capturedInGames) {
        this.basePokemon = basePokemon;
        this.captureDate = captureDate;
        this.item = item;
        this.level = level;
        this.learnedMovements = learnedMovements;
        this.capturedInGames = capturedInGames;
    }

    public Pokemon getBasePokemon() {
        return basePokemon;
    }

    public void setBasePokemon(Pokemon basePokemon) {
        this.basePokemon = basePokemon;
    }

    public LocalDate getCaptureDate() {
        return captureDate;
    }

    public void setCaptureDate(LocalDate captureDate) {
        this.captureDate = captureDate;
    }

    public PokemonItem getItem() {
        return item;
    }

    public void setItem(PokemonItem item) {
        this.item = item;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public List<PokemonMovement> getLearnedMovements() {
        return learnedMovements;
    }

    public void setLearnedMovements(List<PokemonMovement> learnedMovements) {
        this.learnedMovements = learnedMovements;
    }

    public List<PokemonGames> getCapturedInGames() {
        return capturedInGames;
    }

    public void setCapturedInGames(List<PokemonGames> capturedInGames) {
        this.capturedInGames = capturedInGames;
    }
}
