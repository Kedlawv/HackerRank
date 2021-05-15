package challenges.Serialize;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    public void transientTest() {
        User desUser = null;

        try (
                FileOutputStream fos = new FileOutputStream(
                        new File("src\\main\\resources\\transientTest.txt"));
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                FileInputStream fis = new FileInputStream(
                        ("src\\main\\resources\\transientTest.txt"));
                ObjectInputStream ois = new ObjectInputStream(fis);) {


            User user = new User("Kedlaw", "secret");
            oos.writeObject(user);
            desUser = (User) ois.readObject();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        assertEquals("Kedlaw", desUser.getUsername());
        assertNull(desUser.getPassword());

    }
}
