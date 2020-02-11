package challenges.data_structures;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class PairTest {

    @Test
    public void HashSetTest() {
        List<Pair> pairList = new ArrayList<>(Arrays.asList(
                new Pair("john", "tom"),
                new Pair("john", "mary"),
                new Pair("john", "tom"),
                new Pair("marry", "anna"),
                new Pair("marry", "anna")
        ));

        Set<Pair> pairSet = new HashSet<>(pairList);

        assertEquals(3, pairSet.size());
    }

    @Test
    public void HashSetTestArrayNotUnique() {
        List<String[]> arrayList = new ArrayList<>();
        arrayList.add(new String[]{"john", "tom"});
        arrayList.add(new String[]{"john", "mary"});
        arrayList.add(new String[]{"john", "tom"});
        arrayList.add(new String[]{"marry", "anna"});
        arrayList.add(new String[]{"marry", "anna"});


        Set<String[]> pairSet = new HashSet<>(arrayList);

        assertNotEquals(3, pairSet.size());
    }


}