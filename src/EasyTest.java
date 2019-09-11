import static org.junit.Assert.*;
import org.junit.Test;
public class EasyTest {

    @org.junit.Test
    public void testisOk() {
        assertFalse(Easy.isOk("asdnjkfkd"));
        assertTrue(Easy.isOk("sdfga"));

    }


    @org.junit.Test
    public void testForm() {
        String [] input = {"as","dgdhhh"};
        String [] output = {"as"};
        String [] input1 = {"ssss","dgdhhh"};
        String [] output2 = {};
        assertArrayEquals(Easy.form(input),output);
        assertArrayEquals(Easy.form(input1),output2);



    }

   /* @org.junit.Test
    public void testMain() {
    }*/
}