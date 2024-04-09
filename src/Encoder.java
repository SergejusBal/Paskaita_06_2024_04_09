import java.util.Random;

public class Encoder {
    private String plainText, cypter;

    Encoder(){}
    Encoder(String plainText){
        this.plainText = plainText;
    }
    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }
    public String getCypter() {
        kodoti();
        return cypter;
    }
    private char randomChar(){
        Random random = new Random();
        return (char) random.nextInt(0,128);
    }
    private void kodoti(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(randomChar());
        stringBuilder.append(randomChar());
        for(int i = 0; i < plainText.length();i++){
            stringBuilder.append(plainText.charAt(i));
            stringBuilder.append(randomChar());
        }
        stringBuilder.append(randomChar());
        cypter = stringBuilder.toString();
    }


}
