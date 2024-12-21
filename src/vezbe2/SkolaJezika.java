package vezbe2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class SkolaJezika {
    private Kurs[] kursevi;

    public SkolaJezika(String file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        int n = Integer.parseInt(br.readLine().trim());
        kursevi = new Kurs[n];
        for (int i = 0; i < n; i++) {
            String[] tokens = br.readLine().split(",");
            kursevi[i] = new Kurs(tokens[0].trim(), tokens[1].trim(), Integer.parseInt(tokens[2].trim()));
        }
        br.close();
    }

    public String najnaprednijiJezik(){
        Kurs najnapredniji = kursevi[0];
        for (int i = 1; i < kursevi.length; i++) {
            if(kursevi[i].getNivo().equalsIgnoreCase("napredni") && kursevi[i].getBrojPolaznika() > najnapredniji.getBrojPolaznika()){
                najnapredniji = kursevi[i];
            }
        }
        return najnapredniji.getJezik();
    }

    public void unaprediGrupu(String jezik, String nivo){
        if(nivo.equalsIgnoreCase("napredni")) {
            System.out.println("Nije moguce unapredniti napredni kurs");
        }
        int noAdvCourses = 0;
        boolean changed = false;
        for (int i = 0; i < kursevi.length; i++) {
            if(kursevi[i].getJezik().equalsIgnoreCase(jezik) && kursevi[i].getNivo().equalsIgnoreCase(sledeciNivo(nivo))){
                noAdvCourses++;
            }
            if (kursevi[i].getJezik().equalsIgnoreCase(jezik) && kursevi[i].getNivo().equalsIgnoreCase(nivo)){
                kursevi[i].setNivo(sledeciNivo(kursevi[i].getNivo()));
                changed = true;
            }

        }
        if(!changed){
            System.out.println("Zadati kurs ne postoji");
        }
        if(noAdvCourses > 0){
            System.out.println("Posoji vise grupa istog nivoa, spojiti grupe!");
        }
    }

    private String sledeciNivo(String nivo){
        if (nivo.equalsIgnoreCase("osnovni")){
            return "srednji";
        }
        if(nivo.equalsIgnoreCase("srednji")) {
            return "napredni";
        }
        return "";
    }

    @Override
    public String toString() {
        String toRet = "";
        for (int i = 0; i < kursevi.length; i++) {
            toRet += kursevi[i] + "\n";
        }
        return toRet;
    }
}
