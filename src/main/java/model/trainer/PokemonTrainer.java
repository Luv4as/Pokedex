package model.trainer;

import model.pkm.CapturedPokemon;
import model.pkm.PokemonItem;
import model.pkm.PokemonMovement;

import java.util.List;

public class PokemonTrainer {
    private int idTrainerCard;
    private String nickname;
    private String urlImage;
    private List<CapturedPokemon> pokemonsOnPC;
    private List<PokemonItem> itensOnBackpack;
    private List<PokemonMovement> movementsInBackpack;
    private List<GymBadge> badges;
    public List<CapturedPokemon> getPokemonsOnPC() {
        return pokemonsOnPC;
    }

    public PokemonTrainer(int idTrainerCard, String nickname, String urlImage, List<CapturedPokemon> pokemonsOnPC, List<PokemonItem> itensOnBackpack, List<PokemonMovement> movementsInBackpack, List<GymBadge> badges) {
        this.idTrainerCard = idTrainerCard;
        this.nickname = nickname;
        this.urlImage = urlImage;
        this.pokemonsOnPC = pokemonsOnPC;
        this.itensOnBackpack = itensOnBackpack;
        this.movementsInBackpack = movementsInBackpack;
        this.badges = badges;
    }

    public void addPokemonsOnPC(CapturedPokemon pokemon) {
        this.pokemonsOnPC.add(pokemon);
    }

    public List<PokemonItem> getItensOnBackpack() {
        return itensOnBackpack;
    }

    public void addItensOnBackpack(PokemonItem item) {
        this.itensOnBackpack.add(item);
    }

    public List<PokemonMovement> getMovementsInBackpack() {
        return movementsInBackpack;
    }

    public void addMovementsInBackpack(PokemonMovement movement) {
        this.movementsInBackpack.add(movement);
    }

    public List<GymBadge> getBadges() {
        return badges;
    }

    public void addBadges(GymBadge badge) {
        this.badges.add(badge);
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
}
