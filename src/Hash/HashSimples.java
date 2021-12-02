package Hash;

public class HashSimples {
    private Objeto valores[];

    public HashSimples() {
        valores = new Objeto[100];
    }

    public void put(Objeto objeto) {
        int posicao = (objeto.getKey()%101)%100;
        if (valores[posicao] == null) {
            valores[posicao] = objeto;
            System.out.println("Inseriu");
        }
    }

    public Objeto get(int key) {
        Objeto novo = new Objeto();
        novo.setKey(key);
        int posicao = (novo.getKey()%101)%100;
        return valores[posicao];
        
    }

}
