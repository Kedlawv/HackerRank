package challenges.Serialize;

import java.io.Serializable;

public class Pair implements Serializable {

    private final int number;
    private final String name;

    public Pair(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber(){
        return this.number;
    }

    public String getName(){
        return this.name;
    }
}
