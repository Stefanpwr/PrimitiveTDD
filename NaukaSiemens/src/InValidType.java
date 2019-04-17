import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InValidType {
    GenericErrors test = new GenericErrors();


    @Test
    public void WeDontWantNumbers(){
        String message = null;
        try{
            test.getArg(0);
        }
        catch(Exception e){
            message = e.getMessage();
        }
        assertEquals("Wynocha", message);
    }
    @Test
    public void everythingIsOk()throws Exception{
        try {
            assertEquals("A", test.getArg(1));
        }catch(Exception e){
            throw new Exception("Błąd");
        }
    }

}