package com.pokedex.pokedex.model.trainer;

import com.pokedex.pokedex.model.pkm.CapturedPokemon;
import com.pokedex.pokedex.model.pkm.PokemonItem;
import com.pokedex.pokedex.model.pkm.PokemonMovement;

import java.util.List;

public class PokemonTrainer {
    private String idTrainerCard;
    private String nickname;
    private String urlImage;
    private List<CapturedPokemon> pokemonsOnPC;
    private List<Boolean> badges;
    private int nPokCapt;
    private int nBatFeitas;
    private int nVit;
    private int nDer;
    private int nFugas;

    public PokemonTrainer(int nPokCapt, int nBatFeitas, int nVit, int nDer, int nFugas, String idTrainerCard, String nickname, String urlImage, List<CapturedPokemon> pokemonsOnPC, List<Boolean> badges) {
        this.nPokCapt = nPokCapt;
        this.nBatFeitas = nBatFeitas;
        this.nVit = nVit;
        this.nDer = nDer;
        this.nFugas = nFugas;
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

    public String getIdTrainerCard() {
        return idTrainerCard;
    }

    public void setIdTrainerCard(String idTrainerCard) {
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

    public void setPokemonsOnPC(List<CapturedPokemon> pokemonsOnPC) {
        this.pokemonsOnPC = pokemonsOnPC;
    }

    public int getnPokCapt() {
        return nPokCapt;
    }

    public void setnPokCapt(int nPokCapt) {
        this.nPokCapt = nPokCapt;
    }

    public int getnBatFeitas() {
        return nBatFeitas;
    }

    public void setnBatFeitas(int nBatFeitas) {
        this.nBatFeitas = nBatFeitas;
    }

    public int getnVit() {
        return nVit;
    }

    public void setnVit(int nVit) {
        this.nVit = nVit;
    }

    public int getnDer() {
        return nDer;
    }

    public void setnDer(int nDer) {
        this.nDer = nDer;
    }

    public int getnFugas() {
        return nFugas;
    }

    public void setnFugas(int nFugas) {
        this.nFugas = nFugas;
    }
}