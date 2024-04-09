import java.util.Date;

public class Knyga {
    private String pavadinimas;
    private Date isleidimoMetai;
    private Autorius autorius;

    Knyga(String pavadinimas, Autorius autorius, Date isleidimoMetai) {
        this.pavadinimas = pavadinimas;
        this.autorius = autorius;
        this.isleidimoMetai = isleidimoMetai;
    }

    public Date getIsleidimoMetai() {
        return isleidimoMetai;
    }

    public Autorius getAutorius() {
        return autorius;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }
}
