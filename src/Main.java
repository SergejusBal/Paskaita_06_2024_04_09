import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //////////////////////////////////////////////////////////////////////////////////
        // Užduotis Bibliotetka 1

        System.out.println();
        System.out.println("Užduotis Užduotis Bibliotetka 1");
        System.out.println();

        Autorius autorius1 = new Autorius("Vardenis1", "Pavardenis1", new Date(1952,12,02));
        Autorius autorius2 = new Autorius("Vardenis2", "Pavardenis2", new Date(1982,11,01));
        Autorius autorius3 = new Autorius("Vardenis3", "Pavardenis3", new Date(1912,01,11));

        Knyga knyga1 = new Knyga("Čia knygos pavadinimas 1", autorius1, new Date(1987,02,14));
        Knyga knyga2 = new Knyga("Čia knygos pavadinimas 2", autorius1, new Date(2000,3,15));
        Knyga knyga3 = new Knyga("Čia knygos pavadinimas 3", autorius1, new Date(2022,8,16));
        Knyga knyga4 = new Knyga("Čia knygos pavadinimas 4", autorius2, new Date(2014,1,17));
        Knyga knyga5 = new Knyga("Čia knygos pavadinimas 5", autorius2, new Date(1987,12,18));
        Knyga knyga6 = new Knyga("Čia knygos pavadinimas 6", autorius2, new Date(2011,2,19));
        Knyga knyga7 = new Knyga("Čia knygos pavadinimas 7", autorius3, new Date(1987,12,24));
        Knyga knyga8 = new Knyga("Čia knygos pavadinimas 8", autorius3, new Date(1987,2,14));
        Knyga knyga9 = new Knyga("Čia knygos pavadinimas 9", autorius3, new Date(2010,2,4));

        Biblioteka biblioteka = new Biblioteka();
        biblioteka.addKnyga(knyga1);
        biblioteka.addKnyga(knyga2);
        biblioteka.addKnyga(knyga3);
        biblioteka.addKnyga(knyga4);
        biblioteka.addKnyga(knyga5);
        biblioteka.addKnyga(knyga6);
        biblioteka.addKnyga(knyga7);
        biblioteka.addKnyga(knyga8);
        biblioteka.addKnyga(knyga9);

        System.out.println(biblioteka);

        File file = new File("C:/Users/Sergejus/IdeaProjects/Paskaita_06_2024_04_09/src/knygos.txt");
        rasyti(file,biblioteka.toString());
       // istrinti(file);



        //////////////////////////////////////////////////////////////////////////////////
        // Užduotis Enigma 1

        System.out.println();
        System.out.println("Užduotis Enigma");
        System.out.println();

        String OriginalusTekstas = "labas";

        Encoder encoder = new Encoder(OriginalusTekstas);
        String koduoti = encoder.getCypter();
        System.out.println("Uzkoduota:");
        System.out.println(koduoti);

        //////////////////////////////////////////////////////////////////////////////////
        // Užduotis Enigma 2

        Decoder decoder = new Decoder(koduoti);
        String Iskoduoti = decoder.getPlaintext();
        System.out.println("Atkoduota:");
        System.out.println(Iskoduoti);








    }
    public static void rasyti(File file, String tekstas){
        try {
            FileWriter writer = new FileWriter(file,true);
            writer.append(tekstas);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void kopijoti(File file,File file1){

        StringBuilder stringBuilder = new StringBuilder();
        try {
            FileReader fileReader = new FileReader(file);
            int i;
            while ((i = fileReader.read()) != -1) {
                stringBuilder.append((char) i);
            }
            FileWriter writer = new FileWriter(file1,true);
            writer.append(stringBuilder.toString());
            writer.close();
            fileReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static ArrayList<String> perskaityti(File file){
        ArrayList<String> tekstas = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        try {
            FileReader fileReader = new FileReader(file);
            int i;
            while ((i = fileReader.read()) != -1) {
                stringBuilder.append((char) i);
                if(i=='\n'){
                    tekstas.add(stringBuilder.toString());
                    stringBuilder.setLength(0);
                }
            }
            fileReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return tekstas;
    }
    public static void istrinti(File file){
        try {
            Files.deleteIfExists(Paths.get(file.getPath()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}