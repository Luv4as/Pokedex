package com.pokedex.pokedex.model.pkm;

import com.pokedex.pokedex.enums.PokemonGames;
import com.pokedex.pokedex.enums.PokemonType;

import java.util.List;

public class Pokemon {
    private String name;
    private String description;
    private List<PokemonType> type;
    private List<PokemonGames> availableInGames;
    private List<PokemonMovement> allMovements;
    private List<Pokemon> evolutions;
    private int evolutionLevel;

    public Pokemon(String name, String description, List<PokemonType> type, List<PokemonGames> availableInGames, List<PokemonMovement> allMovements, List<Pokemon> evolutions, int evolutionLevel) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.availableInGames = availableInGames;
        this.allMovements = allMovements;
        this.evolutions = evolutions;
        this.evolutionLevel = evolutionLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<PokemonType> getType() {
        return type;
    }

    public void setType(List<PokemonType> type) {
        this.type = type;
    }

    public List<PokemonGames> getAvailableInGames() {
        return availableInGames;
    }

    public void setAvailableInGames(List<PokemonGames> availableInGames) {
        this.availableInGames = availableInGames;
    }

    public List<PokemonMovement> getAllMovements() {
        return allMovements;
    }

    public void setAllMovements(List<PokemonMovement> allMovements) {
        this.allMovements = allMovements;
    }

    public List<Pokemon> getEvolutions() {
        return evolutions;
    }

    public void setEvolutions(List<Pokemon> evolutions) {
        this.evolutions = evolutions;
    }

    public int getEvolutionLevel() {
        return evolutionLevel;
    }

    public void setEvolutionLevel(int evolutionLevel) {
        this.evolutionLevel = evolutionLevel;
    }
}
