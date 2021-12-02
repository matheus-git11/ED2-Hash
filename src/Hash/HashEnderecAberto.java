package Hash;

public class HashEnderecAberto {
    private Objeto valores[];

    public HashEnderecAberto() {
        valores = new Objeto[100];
    }

    public void put(Objeto objeto) {
        int posicao = (objeto.getKey() % 101) % valores.length;
        if (valores[posicao] == null) {
            valores[posicao] = objeto;
            System.out.println("Inseriu");
            return;
        } else {
            for (int i = posicao + 1; i <= valores.length; i++) {
                if (valores[i] == null) {
                    valores[i] = objeto;
                    return;
                }
            }
        }
        System.out.println("Nao foi possivel inserir");
    }

    public Objeto get(int key) {
        int posicao = (key % 101) % valores.length;
        if (valores[posicao] != null) {
            if (valores[posicao].getKey() == key) {
                Objeto retorno = valores[posicao];
                return retorno;
            } else {
                for (int i = posicao + 1; i <= valores.length; i++) {
                    if (valores[i].getKey() == key) {
                        Objeto retorno = valores[i];
                        return retorno;
                    }else if(valores[i]==null){
                        System.out.println("Valor nao encontrado");
                        return null;
                    }
                }
            }
        } 
        return null;
    }

}
