package challenges.ComparatorChallenge;

import java.util.Objects;

public class Player {
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return score == player.score &&
                Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }
}
