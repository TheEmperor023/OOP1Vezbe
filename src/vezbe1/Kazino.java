package vezbe1;

public class Kazino {
    private Kladionicar[] igraci;

    public Kazino(Kladionicar[] igraci) {
        super();
        this.igraci = igraci;
    }

    @Override
    public String toString() {
        String toRet = "";
        for(int i = 0; i < igraci.length; i++) {
            toRet += igraci[i].toString();
        }
        return toRet;
    }

    public String najprofitnijaIgra() {
        int brAjns = 0;
        int brPoker = 0;
        int brRulet = 0;
        for(int i = 0; i < igraci.length; i++) {
            if(igraci[i].getStanjeNaRacunu() < 0) {
                if(igraci[i].getIgra().toLowerCase().equals("poker")) {
                    brPoker++;
                }
                if(igraci[i].getIgra().toLowerCase().equals("ajns")) {
                    brAjns++;
                }
                if(igraci[i].getIgra().toLowerCase().equals("rulet")) {
                    brRulet++;
                }
            }
        }
        if (brAjns >= brPoker && brAjns >= brRulet) {
            return "ajnc";
        }
        if (brPoker >= brAjns && brPoker >= brRulet) {
            return "poker";
        }
        return "rulet";
    }

}
