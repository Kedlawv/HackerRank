package challenges.Serialize;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TeamTest {

    @Test
    public void toJsonTest() throws IOException {
        Player player1 = new Player("John 'Crazy' Muffin","Attacker");
        Player player2 = new Player("Bruce 'Mighty' Anvil", "Coach");

        Team team = new Team();
        team.setPlayers(Arrays.asList(player1,player2));

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File("src\\main\\resources\\jsonTeam.json"),team);


    }

}
