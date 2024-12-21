package vezbe5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class GlavnaV5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new FileReader("res/Voce.txt"));
        int n = Integer.parseInt(br.readLine().trim());
        Voce[] zaDodavanje = new Voce[n];
        for (int i = 0; i < n; i++) {
            String[] tokens = br.readLine().trim().split(",");
            switch (tokens[0]){
                case "Jabuka":
                    zaDodavanje[i] = new Jabuka(tokens[0], Double.parseDouble(tokens[1].trim()), tokens[2].trim().equals("da") ? true : false);
                    break;
                case "Ananas":
                    zaDodavanje[i] = new Ananas(tokens[0], Double.parseDouble(tokens[1].trim()));
                    break;
                default:
                    zaDodavanje[i] = new Voce(tokens[0], Double.parseDouble(tokens[1].trim()));
                    break;
            }
        }
        Arrays.sort(zaDodavanje);
        Sokovnik s = new Sokovnik(1, zaDodavanje);
        System.out.println("U sokovnik je ubaceno "+ s.brojKomada() + " voca");
        s.cedi();
    }
}
