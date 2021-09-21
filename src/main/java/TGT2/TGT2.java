package TGT2;

/**
 *
 * @author 31983685, 41925297, 31991165
 */

public class TGT2 {
    public String digitaAno(int ano) {
        String txt;
        if (ano >= 1900 && ano <= 2020) {
            txt = "Data válida";
        } else {
            txt = "Data inválida";
        }
        return txt;
    }

    public String notaBimestral(int nota) {
        String txt;
        if (nota >= 0 && nota <= 10) {
            txt = "Nota válida";
        } else {
            txt = "Nota inválida";
        }
        return txt;
    }

    public String renovacaoCNH(int idade) {
        String txt;
        if (idade < 50) {
            txt = "Renovação a cada 10 anos";
        } else if (idade >= 50 && idade < 70) {
            txt = "Renovação a cada 5 anos";
        } else {
            txt = "Renovação a cada 3 anos";
        }
        return txt;
    }
    
}
