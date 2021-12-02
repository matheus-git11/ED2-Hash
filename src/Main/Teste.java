package Main;

import Hash.HashSimples;
import Hash.Objeto;

public class Teste {
    public static void main(String[] args) {
	 HashSimples hash = new HashSimples();
        Objeto a;

        a = new Objeto(1,"Math");

     
       System.out.println("Registro --"+ a.getKey() + "-" + a.getValue()+ "--"+ a.hashCode());
       hash.put(a);
    }
}
 