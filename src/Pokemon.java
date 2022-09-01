import java.util.List;

public class Pokemon {
    private int idPokedex;
    private int idParty;
    private String name;
    private String description;
    private List<PokemonType> type;
    private List<PokemonGames> availableInGames;
    private List<PokemonMovement> allMovements;
    private List<Pokemon> evolutions;
    private int evolutionLevel;
    private boolean isFavorite;
    private List<String> reactions;

    public int getIdPOkedex() {
        return idPokedex;
    }

    public void setIdPOkedex(int idPOkedex) {
        this.idPokedex = idPOkedex;
    }

    public int getIdParty() {
        return idParty;
    }

    public void setIdParty(int idParty) {
        this.idParty = idParty;
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
