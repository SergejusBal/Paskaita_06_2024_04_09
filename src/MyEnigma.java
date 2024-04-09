public class MyEnigma {
    public static void main(String[] args) {


        IOManager ioManager = new IOManager();

        while(true){
            ioManager.arKoduoti();
            ioManager.ivestiTeksta();
            ioManager.pranesimas();
            System.out.println("Ar norite kartuoti?");
            if(!ioManager.atsakymas()) break;
        }

    }

}
