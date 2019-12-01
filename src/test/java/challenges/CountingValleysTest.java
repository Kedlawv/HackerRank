package challenges;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CountingValleysTest {


    CountingValleys cv;


    @BeforeAll
    public void getSockMerchant() {
        cv = new CountingValleys();
    }

    @Test
    void countingValleysSolutionTest1() {
        String hike = "DDUUDDUDUUUD";
        int numValleys = cv.countingValleysSolution(hike.length(), hike);
        assertEquals(2, numValleys);
    }

    @Test
    void countingValleysSolutionTest2() {
        String hike = "UDDDUDUU";
        int numValleys = cv.countingValleysSolution(hike.length(), hike);
        assertEquals(1, numValleys);
    }

    @Test
    void graphElevationChange(){
        String hike = "DDDUUUUDDUUUUUDDDDDDUDUU";
        cv.countingValleysGraph(hike.length(),hike);
    }
}
