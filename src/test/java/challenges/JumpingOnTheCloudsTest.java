package challenges;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class JumpingOnTheCloudsTest {

    JumpingOnTheClouds jc;

    @BeforeAll
    public void getJC(){
        jc = new JumpingOnTheClouds();
    }



    @Test
    void cloudJumpTest1() {
        int[] clouds = {0, 0, 1, 0, 0, 1, 0};
        int expectedJumps = 4;

        int actualJumps = jc.cloudJump(clouds);

        assertEquals(expectedJumps,actualJumps);
    }
}