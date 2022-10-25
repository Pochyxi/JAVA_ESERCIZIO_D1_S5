package classes;

import com.example.java_esercizio_d1_s5.JavaEsercizioD1S5Application;
import com.example.java_esercizio_d1_s5.beans.Consumation;
import com.example.java_esercizio_d1_s5.beans.Ordinazione;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.springframework.test.util.AssertionErrors.assertEquals;

public class OrdinazioneTest {
    List<Consumation> consumations = JavaEsercizioD1S5Application.conf1();
    Ordinazione ordinazione = new Ordinazione( consumations );


    @Test
    public void testOrdinazione() {
        assertEquals( "Dovrebbe ritornare 10", ordinazione.calcolaTotaleOrdine() , 11.0 );
    }


}
