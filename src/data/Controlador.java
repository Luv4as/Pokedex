package data;

import model.pkm.Pokemon;
import model.trainer.PokemonTrainer;
import java.util.List;

public class Controlador {
    IRepositorioGenerico<Pokemon> repPokemon;
    IRepositorioGenerico<PokemonTrainer> repPokemonTrainers;
    
    public Controlador(){
        this.repPokemon = new RepositorioGenerico<>();
        this. repPokemonTrainers = new RepositorioGenerico<>();
    }

    public IRepositorioGenerico<Pokemon> getRepPokemon() {
        return repPokemon;
    }
    public void setRepPokemon(IRepositorioGenerico<Pokemon> repPokemon) {
        this.repPokemon = repPokemon;
    }

    public IRepositorioGenerico<PokemonTrainer> getRepPokemonTrainers() {
        return repPokemonTrainers;
    }
    public void setRepPokemonTrainers(IRepositorioGenerico<PokemonTrainer> repPokemonTrainers) {
        this.repPokemonTrainers = repPokemonTrainers;
    }

    List<Pokemon> devolveListaComTodosOsPokemons() {
        return repPokemon.listar();
    }

    List<PokemonTrainer> devolveListaComTodosOsTreinadores() {
        return repPokemonTrainers.listar();
    }

}
