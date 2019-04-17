import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToChar {
    StringExercises test = new StringExercises();
    @Test
    public void String1A1B1C(){
        assertEquals("1A1B1C", test.converter("ABC") );
    }
    @Test
    public void StringError(){
        assertEquals("error", test.converter("1Abca21"));
    }
    @Test
    public void String1A2B3C1D(){
        assertEquals("1A2B3C1D", test.converter("ABBCCCD"));
    }
    @Test
    public void String1A4B10C3D1E(){
        assertEquals("1A4B10C3D1E", test.converter("ABBBBCCCCCCCCCCDDDE"));
    }

}