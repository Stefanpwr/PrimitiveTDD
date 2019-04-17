import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExamplesTest {
    Examples test = new Examples();

    @Test
    public void fibonacci_recursive_less(){
        assertEquals(-1,test.fibonnaci_recursive(-50));
    }
    @Test
    public void fibonacci_recursive_zero(){
        assertEquals(0,test.fibonnaci_recursive(0));
    }
    @Test
    public void fibonacci_recursive_1(){
        assertEquals(1,test.fibonnaci_recursive(1));
    }
    @Test
    public void fibonacci_recursive_twentyone(){
        assertEquals(21, test.fibonnaci_recursive(8));
    }
    @Test
    public void fibonacci_recursive_one(){
        assertEquals(1,test.fibonnaci_recursive(2));
    }



}