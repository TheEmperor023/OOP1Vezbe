package vezbe3;

public class Umetnik {
    private String ime;
    private UmetnickoDelo[] dela;
    private int brojDela;

    public Umetnik(String ime, int maxDela) {
        this.ime = ime;
        this.dela = new UmetnickoDelo[maxDela];
        this.brojDela = 0;
    }

    public String getIme() {
        return ime;
    }

    public UmetnickoDelo[] getDela() {
        return dela;
    }

    public int getBrojDela() {
        return brojDela;
    }

    public boolean izlozi(UmetnickoDelo delo){
        if(brojDela < this.dela.length){
            this.dela[brojDela] = delo;
            brojDela++;
            return true;
        }else {
            return false;
        }
    }

    public double vrednost(){
        double toRet = 0;
        for (int i = 0; i < brojDela; i++){
            toRet+= dela[i].getCena();
        }
        return toRet;
    }
}
