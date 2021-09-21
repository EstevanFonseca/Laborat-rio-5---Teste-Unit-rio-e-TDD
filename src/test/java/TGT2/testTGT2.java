package TGT2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testTGT2 {
    TGT2 tgt2;

    public testTGT2() {
        tgt2 = new TGT2();
    }

    @Test
    public void digitaAno(){
        System.out.println("TestDigitaAno");
        assertEquals("Data inválida", tgt2.digitaAno(1879));
        assertEquals("Data válida", tgt2.digitaAno(1999));
        assertEquals("Data inválida", tgt2.digitaAno(2021));
        assertEquals("Data inválida", tgt2.digitaAno(1899));
        assertEquals("Data válida", tgt2.digitaAno(1900));
        assertEquals("Data válida", tgt2.digitaAno(2020));
        assertEquals("Data inválida", tgt2.digitaAno(2021));
    }

    @Test
    public void notaBimestral(){
        System.out.println("TestnotaBimestral");
        assertEquals("Nota inválida", tgt2.notaBimestral(-1));
        assertEquals("Nota válida", tgt2.notaBimestral(7));
        assertEquals("Nota inválida", tgt2.notaBimestral(11));
        assertEquals("Nota válida", tgt2.notaBimestral(0));
        assertEquals("Nota válida", tgt2.notaBimestral(10));
        assertEquals("Nota inválida", tgt2.notaBimestral(11));
    }

    @Test
    public void renovacaoCNH(){
        System.out.println("TestrenovacaoCNH");
        assertEquals("Renovação a cada 10 anos", tgt2.renovacaoCNH(48));
        assertEquals("Renovação a cada 5 anos", tgt2.renovacaoCNH(60));
        assertEquals("Renovação a cada 3 anos", tgt2.renovacaoCNH(71));
        assertEquals("Renovação a cada 10 anos", tgt2.renovacaoCNH(49));
        assertEquals("Renovação a cada 5 anos", tgt2.renovacaoCNH(50));
        assertEquals("Renovação a cada 5 anos", tgt2.renovacaoCNH(51));
        assertEquals("Renovação a cada 5 anos", tgt2.renovacaoCNH(69));
        assertEquals("Renovação a cada 3 anos", tgt2.renovacaoCNH(70));
        assertEquals("Renovação a cada 3 anos", tgt2.renovacaoCNH(71));
    }

}
