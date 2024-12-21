package vezbe3;

import java.io.IOException;

public class GlavnaV3 {
    public static void main(String[] args) throws IOException {
        Galerija g = new Galerija("res/Umetnici.txt","res/Dela.txt");
        System.out.println(g.najstarijeDelo().getIme());
        g.prosecnaVrednost();
    }
}
