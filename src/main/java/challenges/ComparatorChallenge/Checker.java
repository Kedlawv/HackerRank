package challenges.ComparatorChallenge;

import java.util.Comparator;

public class Checker implements Comparator<Player> {

    @Override
    public int compare(Player p1, Player p2) {

        if(p1.score == p2.score){
            return p1.name.compareTo(p2.name);
        }else{
            return p1.score > p2.score ? -1 : 1;
        }
    }
}
