package vezbe4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class Poliklinika {
    private Lekar[] lekari;

    public Poliklinika() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("res/Lekari.txt"));
        int n = Integer.parseInt(br.readLine());
        lekari = new Lekar[n];
        for (int i = 0; i < n ; i++) {
            String ime = br.readLine().trim();
            String prezime = br.readLine().trim();
            String specijalnost = br.readLine().trim();
            if (specijalnost.equalsIgnoreCase("pedijatar")){
                lekari[i] = new Pedijatar(ime, prezime);
            }else if(specijalnost.equalsIgnoreCase("pulmolog")){
                lekari[i] = new Pulmolog(ime, prezime);
            }
        }
        br.close();
        Random r = new Random();
        br = new BufferedReader(new FileReader("res/Pacijenti.txt"));
        n = Integer.parseInt(br.readLine().trim());
        for (int i = 0; i < n; i++) {
            String ime = br.readLine().trim();
            String prezime = br.readLine().trim();
            int god = Integer.parseInt(br.readLine());
            lekari[r.nextInt(lekari.length)].prihvati(new Pacijent(ime, prezime, god));
        }
        br.close();
    }

    public Pulmolog najmanjaPlata(){
        Pulmolog toRet = null;
        for (int i = 0; i < lekari.length; i++) {
            if (lekari[i] instanceof Pulmolog){
                if (toRet == null || lekari[i].plata() < toRet.plata()){
                    toRet = (Pulmolog) lekari[i];
                }
            }
        }
        return toRet;
    }

    public Pedijatar saNajstarijim(){
        Pedijatar toRet = null;
        double maxProsekGodina = 0;
        for (int i = 0; i < lekari.length; i++) {
            if (lekari[i] instanceof Pedijatar){
                double trenProsek = 0;
                for (int j = 0; j < lekari[i].getBrPacijenata(); j++) {
                    trenProsek += lekari[i].getPacijenti()[j].getGodine();
                }
                trenProsek /= lekari[i].getBrPacijenata();
                if(toRet == null || trenProsek > maxProsekGodina){
                    maxProsekGodina = trenProsek;
                    toRet = (Pedijatar) lekari[i];
                }
            }
        }
        return toRet;
    }

    @Override
    public String toString() {
        return "Poliklinika{" +
                "lekari=" + Arrays.toString(lekari) +
                '}';
    }
}
