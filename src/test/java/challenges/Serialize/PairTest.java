package challenges.Serialize;

import org.junit.jupiter.api.Test;

import javax.imageio.stream.FileImageOutputStream;
import java.io.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class PairTest {

    @Test
    public void writeData() throws IOException{
        final FileOutputStream fos = new FileOutputStream(
                new File("src\\main\\resources\\writeDataTest.txt"));
        final ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeInt(101);
        oos.writeBoolean(false);
        oos.writeUTF("Just a String");
        final Pair pair = new Pair(42, "Forty two");
        oos.writeObject(pair);

        oos.flush();
        oos.close();
        fos.close();
    }

    @Test
    public void readData() throws IOException, ClassNotFoundException {
        final FileInputStream fis = new FileInputStream(
                "src\\main\\resources\\writeDataTest.txt");
        final ObjectInputStream ois = new ObjectInputStream(fis);

        // the data needs to be read in the same order it was added
        // if the class Pair is not on the class path JVM will not be able to deserialize the object
        // Pair class also needs to implement a marker Interface <Serializable>
        final int number = ois.readInt();
        final boolean bool = ois.readBoolean();
        final String string = ois.readUTF();
        final Pair pair = (Pair) ois.readObject();

        assertEquals(101, number);
        assertFalse(bool);
        assertEquals("Just a String", string);
        assertEquals(42, pair.getNumber());
        assertEquals("Forty two", pair.getName());
    }


}
