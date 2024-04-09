public class Decoder {
    private String plaintext, cypher;

    Decoder(){}
    public Decoder(String cypher) {
        this.cypher = cypher;
    }

    public void setCypher(String cypher) {
        this.cypher = cypher;    }

    public String getPlaintext() {
        atkodoti();
        return plaintext;
    }
    public void atkodoti(){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 2; i < cypher.length()-2;i+=2){
            stringBuilder.append(cypher.charAt(i));
        }
        plaintext = stringBuilder.toString();
    }

}
