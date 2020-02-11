package challenges.generics;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GenericPrinterTest {

    @Test
    public void printArrayTest() {
        //Arrange
        String[] sArr = {"one", "two", "three"};
        Integer[] iArr = {1, 2, 3};
        String expected = "one\r\ntwo\r\nthree\r\n1\r\n2\r\n3\r\n";

        //Act
        //Capture sout
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buffer));

        GenericPrinter.printArray(sArr);
        GenericPrinter.printArray(iArr);

        //reset sout
        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));

        String actual = buffer.toString();

        //Assert
        assertEquals(expected, actual);
    }
}