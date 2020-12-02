import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyStringTest {

    @Test
    public void testEqualsFalseSameLength() {
        //Setup
        MyString myString = new MyString("a");

        //Execute
        boolean stringEquals = myString.equals("b");

        //Verify
        assertFalse(stringEquals);
    }

    @Test
    public void testEqualsTrueSameObject() {
        //Setup
        MyString myString = new MyString("a");

        //Execute
        boolean stringEquals = myString.equals(myString);

        //Verify
        assertTrue(stringEquals);
    }

    @Test
    public void testEqualsFalseNoInstanceOfMyString() {
        //Setup
        MyString myString = new MyString("a");

        //Execute
        boolean stringEquals = myString.equals(1);

        //Verify
        assertFalse(stringEquals);
    }

    @Test
    public void testEqualsTrueSame() {
        //Setup
        MyString myString = new MyString("aa");
        MyString myString2 = new MyString("aa");

        //Execute
        boolean stringEquals = myString.equals(myString2);

        //Verify
        assertTrue(stringEquals);
    }

    @Test
    public void testEqualsFalseDifferentLength() {
        //Setup
        MyString myString = new MyString("a");

        //Execute
        boolean stringEquals = myString.equals("aa");

        //Verify
        assertFalse(stringEquals);
    }
}