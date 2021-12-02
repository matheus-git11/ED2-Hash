package Main;

import Hash.HashSimples;
import Hash.Objeto;
import java.util.Scanner;

public class TesteSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashSimples hash = new HashSimples();
        int alt, key, resp;
        String value;

        do {
            System.out.println("Voce deseja inserir um objeto(1) , busca-lo?(2) ou Remove-lo?(3)");
            alt = input.nextInt();
            switch (alt) {

                case 1:
                    System.out.println(
                            "Primeiro voce irá inserir a chave(Int) para rastreio do seu objeto e depois o nome que deseja inserir(String) no caso da inserção");
                    System.out.println("Por favor informe a chave");
                    key = input.nextInt();
                    input.nextLine();
                    System.out.println("Agora informe um texto que deseja armazenar");
                    value = input.nextLine();
                    Objeto obj = new Objeto(key, value);
                    hash.put(obj);
                    break;

                case 2:
                    System.out.println("Informe a numeração de rastreio do seu objeto");
                    key = input.nextInt();
                    Objeto find = hash.get(key);
                    if (find == null) {
                        System.out.println("Objeto não encontrado");
                    } else {
                        System.out.println("Objeto encontrado => " + find.getValue());
                    }
                    break;

                case 3:
                    System.out.println("Informe a numeração de rastreio para remoção do objeto");
                    key = input.nextInt();
                    hash.delete(key);
                    break;
                default:
                    System.out.println("Comando não reconhecido , você deve inserir 1 para inserir ou 2 para busca");
                    break;
            }

            System.out.println("Deseja continuar? ");
            System.out.println("Insira 0 para encerrar ou qualquer outro numero para continuar");
            resp = input.nextInt();

        } while (resp != 0);

        input.close();
    }
}
