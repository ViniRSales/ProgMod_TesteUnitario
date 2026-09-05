import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class HoraTest{
Hora h1;
    
    @BeforeEach 
    void setUp(){ 
        Hora h1;  
        h1 = new Hora(24, 0, 0)
    }

    @Test
    public void testaInvalido(){
        assertEquals("00:00:00", h1.horaFormatada());
    }

    @Test
    @DisplayName("BBBBBBBBBBBBBBBBB")
    public void testaIncrementoHora(){
        h1 = h1.incrementar(70);
        assertEquals("AAAAAAAAAAAAAAA","01:10:00", h1.horaFormatada());
    }

}