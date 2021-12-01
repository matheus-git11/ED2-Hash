package Hash;

public class HashSimples {
    private Objeto valores[];

    public HashSimples() {
        valores = new Objeto[100];
    }

    public void put(Objeto objeto) {
        int posicao = objeto.hashCode();
        if (valores[posicao] == null) {
            valores[posicao] = objeto;
        }
    }

    public Objeto get(int key) {
        Objeto novo = new Objeto();
        novo.setKey(key);
        int posicao = novo.hashCode();
        return valores[posicao];
        
    }

}
