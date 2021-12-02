package Main;

import java.util.Scanner;

import Hash.HashEnderecAberto;
import Hash.Objeto;

public class TesteEndAberto {
    public static void main(String[] args) {
        HashEnderecAberto hash = new HashEnderecAberto();
        Scanner input = new Scanner(System.in);
        int resp, key, alt;
        String value;
        System.out.println("Bem vindo ao programa do Hash enderecamento aberto");

        do {
            System.out.println("Voce deseja inserir um objeto(1) ou busca-lo?(2)");
            alt = input.nextInt();
            switch (alt) {

                case 1:
                    System.out.println( "Primeiro voce irá inserir a chave(Int) para rastreio do seu objeto e depois o nome que deseja inserir(String) no caso da inserção");
                    System.out.println("Por favor informe a chave");
                    key = input.nextInt(); input.nextLine();
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