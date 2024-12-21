package vezbe3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Galerija {

    private Umetnik[] umetnici;

    public Galerija(String fajlU, String fajlD) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fajlU));
        int n = Integer.parseInt(br.readLine().trim());
        umetnici = new Umetnik[n];
        for (int i = 0; i < n; i++) {
            String[] tokens = br.readLine().trim().split(",");
            if(tokens.length == 1){
                umetnici[i] = new Slikar(tokens[0].trim());
            }else {
                umetnici[i] = new Umetnik(tokens[0].trim(), Integer.parseInt(tokens[1].trim()));
            }
        }

        br.close();
        br = new BufferedReader(new FileReader(fajlD));
        n = Integer.parseInt(br.readLine().trim());
        for (int i = 0; i < n; i++) {
            String ime = br.readLine().trim();
            String nazivD = br.readLine().trim();
            int god = Integer.parseInt(br.readLine().trim());
            double cena = Double.parseDouble(br.readLine().trim());
            for (int j = 0; j < umetnici.length; j++) {
                if (umetnici[j].getIme().equals(ime)){
                    umetnici[j].izlozi(new UmetnickoDelo(nazivD,god,cena));
                }
            }
        }
        br.close();
    }

    public Slikar najstarijeDelo(){
        Slikar s = null;
        UmetnickoDelo najstarije = null;
        for (int i = 0; i < umetnici.length; i++) {
            if (umetnici[i] instanceof Slikar){
                UmetnickoDelo najstarijeDeloUmetnika = nadjiNajstarijeDelo(umetnici[i]);
                if(najstarije == null || najstarijeDeloUmetnika.getGodinaNastanka() < najstarije.getGodinaNastanka()){
                    najstarije = najstarijeDeloUmetnika;
                    s = (Slikar) umetnici[i];
                }
            }
        }
        return s;
    }

    private UmetnickoDelo nadjiNajstarijeDelo(Umetnik umetnik) {
        UmetnickoDelo najstarije = null;
        for (int i = 0; i < umetnik.getBrojDela(); i++) {
            if (najstarije == null || umetnik.getDela()[i].getGodinaNastanka() < najstarije.getGodinaNastanka()) {
                najstarije = umetnik.getDela()[i];
            }
        }
        return najstarije;
    }

    public void prosecnaVrednost(){
        double vrednost = 0;
        int broj = 0;
        for (int i = 0; i < umetnici.length; i++) {
            vrednost += umetnici[i].vrednost();
            broj += umetnici[i].getBrojDela();
        }
        System.out.println("Proscna vrednost dela u galeriji: "+ (vrednost / broj));
    }
}
