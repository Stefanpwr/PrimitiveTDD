import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FiboTestNoRecursive {
    Examples test = new Examples();
    @Test
    public void fibo_normal_less(){
        assertEquals(-1, test.fibonaci_normal(-10));
    }
    @Test
    public void fibo_normal_zero(){
        assertEquals(0, test.fibonaci_normal(0));
    }
    @Test
    public void fibo_normal_one(){
        assertEquals(1,test.fibonaci_normal(1));
    }
    @Test
    public void fibo_normal_two(){
        assertEquals(1,test.fibonaci_normal(2));
    }
    @Test
    public void fibo_normal_twenty_one(){
        assertEquals(21,test.fibonaci_normal(8));
    }
    @Test
    public void fibo_normal_three(){
        assertEquals(2,test.fibonaci_normal(3));
    }
}