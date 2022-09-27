package com.pokedex.pokedex.model.trainer;

import com.pokedex.pokedex.model.pkm.CapturedPokemon;
import com.pokedex.pokedex.model.pkm.PokemonItem;
import com.pokedex.pokedex.model.pkm.PokemonMovement;

import java.util.List;

public class PokemonTrainer {
    private int idTrainerCard;
    private String nickname;
    private String urlImage;
    private List<CapturedPokemon> pokemonsOnPC;
    private List<Boolean> badges;

    public PokemonTrainer(int idTrainerCard, String nickname, String urlImage, List<CapturedPokemon> pokemonsOnPC, List<Boolean> badges) {
        this.idTrainerCard = idTrainerCard;
        this.nickname = nickname;
        this.urlImage = urlImage;
        this.pokemonsOnPC = pokemonsOnPC;
        this.badges = badges;
    }

    public List<CapturedPokemon> getPokemonsOnPC() {
        return pokemonsOnPC;
    }

    public void addPokemonsOnPC(CapturedPokemon pokemon) {
        this.pokemonsOnPC.add(pokemon);
    }

    public int getIdTrainerCard() {
        return idTrainerCard;
    }

    public void setIdTrainerCard(int idTrainerCard) {
        this.idTrainerCard = idTrainerCard;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public List<Boolean> getBadges() {
        return badges;
    }

    public void setBadges(List<Boolean> badges) {
        this.badges = badges;
    }
}
