package Hash;

import java.util.LinkedList;

public class HashEncadSeparado {

    LinkedList<Objeto>[] espaco = new LinkedList[100];

    public HashEncadSeparado() {

    }

    public void put(Objeto objeto) {
        int posicao = (objeto.getKey() % 101) % espaco.length;
        if (espaco[posicao] == null) {
            espaco[posicao] = new LinkedList<Objeto>();
            System.out.println("Objeto inserido");
            espaco[posicao].addLast(objeto);

        } else {
            if (espaco[posicao].contains(objeto)) {
                System.out.println("Ja adicionado");
            } else {
                espaco[posicao].addLast(objeto);
            }

        }
    }

    public Objeto get(int key) {
        int posicao = (key % 101) % espaco.length;
       
        if (espaco[posicao] == null) {
            System.out.println("Objeto não encontrado");
            return null;
        } else {
            int tamanho = espaco[posicao].size();
            for (int i = 0; i <= tamanho; i++) {
                if (espaco[posicao].get(i).getKey() == key) {
                    return espaco[posicao].get(i);
                }
            }
            System.out.println("nao achado");
            return null;

        }
    }
}