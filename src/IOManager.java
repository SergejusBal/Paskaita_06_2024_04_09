import java.util.Scanner;

public class IOManager {
    private String inputMessage;
    private int action;
    Scanner scanner = new Scanner(System.in);

    public String getInputMessage() {
        return inputMessage;
    }
    public int getAction() {
        return action;
    }

    public void arKoduoti(){
        String ivestaVerte = "";
        while(true){
            System.out.println("Iveskite 1 jei koduoti arba 2 jei nekoduoti");
            ivestaVerte = scanner.nextLine();
            if      (ivestaVerte.equals("1")) { action = 1; break;}
            else if (ivestaVerte.equals("2")) { action = 2; break;}
            System.out.println();
        }
    }
    public void ivestiTeksta(){
        System.out.println("Iveskite teksta:");
        inputMessage = scanner.nextLine();
    }

    public void pranesimas(){
        if(action == 1) System.out.println(new Encoder(inputMessage).getCypter());
        if(action == 2) System.out.println(new Decoder(inputMessage).getPlaintext());
    }

    public boolean atsakymas() {
        while(true) {
            System.out.println("Iveskite (T/N)?");
            String scVerte = scanner.nextLine();
            if(scVerte.toUpperCase().equals("T")) return true;
            else if (scVerte.toUpperCase().equals("N")) return false;
        }
    }

}
