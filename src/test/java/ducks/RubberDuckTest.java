import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RubberDuckTest {
    @Test void RubberDuckTestQuack() {

        // instance of object to be tested
        Duck classUnderTest = new RubberDuck();

        // save current System.out to later revert back to it
        PrintStream sysOut = System.out;

        // create ByteArrayOutputStream as alternative output stream
        ByteArrayOutputStream sysOutAlt = new ByteArrayOutputStream();
        
        // change System.out to point out new alternative stream
        System.setOut(new PrintStream(sysOutAlt));

        // class prints to System.out, which is now caught by sysOutAlt
        classUnderTest.performQuack();

        // reset System.out to the original stream it's intended to be
        System.setOut(sysOut);

        // Our sysOutAlt has the content from the print statement
        String output = new String(sysOutAlt.toByteArray());

        // check that output equals/contains quack
        assertTrue(output.contentEquals("Squeak\n"));
    }
}


