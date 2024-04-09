import java.util.ArrayList;

public class Biblioteka {
    private ArrayList<Knyga> knyguSarasas = new ArrayList<Knyga>();

    public Biblioteka() {

    }
    public Biblioteka(ArrayList<Knyga> knyguSarasas) {
        this.knyguSarasas = knyguSarasas;
    }

    public ArrayList<Knyga> getKnyguSarasas() {
        return knyguSarasas;
    }

    public void addKnyga(Knyga knyga){
        knyguSarasas.add(knyga);
    }

    @Override
    public String toString() {
        String grazu = "";
        for (Knyga k : knyguSarasas) {
            grazu += "Pavadinimas: " + k.getPavadinimas() + "  Autorius :" + k.getAutorius().getVardas() + " " +k.getAutorius().getPavarde() + "  Leidimo metai: " + k.getIsleidimoMetai().getYear() + "\n";
        }
        return grazu;
    }
}
