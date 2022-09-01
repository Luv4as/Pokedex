import java.util.List;

public class ProfilePokemonTrainer extends PokemonTrainer {
    private List<CapturedPokemon> pokemonsOnPC;
    private List<PokemonItem> itensOnBackpack;
    private List<PokemonMovement> movementsInBackpack;
    private List<GymBadge> badges;

    ProfilePokemonTrainer(int idTrainerCard, String nickname, List<CapturedPokemon> pokemonsOnPC, List<PokemonItem> itensOnBackpack, List<PokemonMovement> movementsInBackpack, List<GymBadge> badges) {
        super(idTrainerCard, nickname);
        this.pokemonsOnPC = pokemonsOnPC;
        this.itensOnBackpack = itensOnBackpack;
        this.movementsInBackpack = movementsInBackpack;
        this.badges = badges;
    }

    public List<CapturedPokemon> getPokemonsOnPC() {
        return pokemonsOnPC;
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
}
