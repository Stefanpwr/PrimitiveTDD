import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FiboSuma {
    Examples test = new Examples();
    @Test
    public void fibo_normal2_less(){
        assertEquals(-1, test.fibonaci_normal(-10));
    }
    @Test
    public void fibo_normal2_zero(){
        assertEquals(0, test.fibonaci_normal2(0));
    }
    @Test
    public void fibo_normal2_one(){
        assertEquals(1,test.fibonaci_normal2(1));
    }
    @Test
    public void fibo_normal2_two(){
        assertEquals(2,test.fibonaci_normal2(2));
    }
    @Test
    public void fibo_normal2_twenty_one(){
        assertEquals(12,test.fibonaci_normal2(5));
    }
    @Test
    public void fibo_normal2_three(){
        assertEquals(4,test.fibonaci_normal2(3));
    }
}