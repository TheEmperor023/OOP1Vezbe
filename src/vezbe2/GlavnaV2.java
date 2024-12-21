package vezbe2;

import java.io.IOException;

public class GlavnaV2 {
    public static void main(String[] args) throws IOException {
        SkolaJezika skola = new SkolaJezika("res/kursevi.txt");
        System.out.println(skola.najnaprednijiJezik());
        skola.unaprediGrupu("kineski", "osnovni");
        System.out.println(skola);
    }

}
