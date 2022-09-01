public class PokemonTrainer {
    private int idTrainerCard;
    private String nickname;
    private String urlImage;

    PokemonTrainer(int idTrainerCard, String nickname) {
        this.idTrainerCard = idTrainerCard;
        this.nickname = nickname;
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
