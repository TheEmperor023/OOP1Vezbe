package vezbe4;

import javax.imageio.IIOException;
import java.io.IOException;

public class GlavnaV4 {
    public static void main(String[] args) throws IOException {
        Poliklinika poliklinika = new Poliklinika();
        System.out.println(poliklinika);
        System.out.println(poliklinika.najmanjaPlata());
        System.out.println(poliklinika.saNajstarijim());
    }
}
