//Refatorei o método de adição criando uma Array List.

import java.util.ArrayList;

public class Main {
    static String exames = "";
    public static void main(String args[]) {
        ArrayList<String> adicionarExame = new ArrayList<>();

        adicionarExame.add("TSH");
        adicionarExame.add("T4L");
        adicionarExame.add("HEMOG");
        adicionarExame.add("COL");
        adicionarExame.add("HEM");
        adicionarExame.add("TRIG");
        adicionarExame.add("G");
        adicionarExame.add("GGT");

        for (int i=0; i<adicionarExame.size();i++){
            System.out.println(adicionarExame.get(i));
        }

    }
    private static String adicionarExame(String exm) {
        String tmp = exm;
        if (null != exm && exm.length() < 6) {
            for (int i = exm.length(); i < 6; i++) {
                tmp += " ";
            }
        }
        if (exames.indexOf(tmp) < 0) {
            String tmp2 = tmp;
            if (null != tmp && tmp.length() < 6) {
                for (int i = tmp.length(); i < 6; i++) {
                    tmp2 += " ";
                }
            }
            exames += tmp2;
        }
        return exames;
    }
}