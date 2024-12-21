package vezbe3;

public class Slikar extends Umetnik{
    public Slikar(String ime) {
        super(ime, 5);
    }

    @Override
    public double vrednost(){
        double toRet = 0;
        for (int i = 0; i < super.getBrojDela(); i++) {
            UmetnickoDelo d = super.getDela()[i];
            toRet += racunajCenu(d.getCena(),d.getGodinaNastanka());
        }
        return toRet;
    }

    private double racunajCenu(double cena, int godine){
        double toRet = cena;
//        for (int i = 0; i < 2024 - godine; i++) {
//            toRet += toRet * 0.15;
//        }
        toRet *=  Math.pow(1.15, 2024 - godine);
        return toRet;
    }

}
