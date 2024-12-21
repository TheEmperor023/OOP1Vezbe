package vezbe1;

public class Glavna {
    public static void main(String[] args) {
        Kazino kazino = new Kazino(
                new Kladionicar[] { new Kladionicar("Pera", "poker", 15000), new Kladionicar("Mika", "ajns", 17000),
                        new Kladionicar("Zika", "rulet", -1500), new Kladionicar("Bora", "ajns", -11000),
                        new Kladionicar("Dora", "rulet", 5000), new Kladionicar("Zora", "ajns", -3000),
                        new Kladionicar("Lara", "poker", 22000), new Kladionicar("Mara", "poker", -7000) });
        System.out.println(kazino);
        System.out.println("Najprofitnija igra trenutno je " + kazino.najprofitnijaIgra() + ".");

    }
}
