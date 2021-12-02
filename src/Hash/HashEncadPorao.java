package Hash;

public class HashEncadPorao {
    private ObjetoPorao valores[];
    int fin;

    public HashEncadPorao() {
        valores = new ObjetoPorao[110]; // 10 de porão
        int fin = valores.length;
    }

    public void put(Objeto objeto) {
        int posicao = (objeto.getKey() % 101) % valores.length; // fazendo o calculo como se houvessem 100 posições no
                                                                // array
         if(valores[posicao]==null){
             valores[posicao]= new ObjetoPorao();
             valores[posicao].setObjeto(objeto);
            valores[posicao].setFlag(-1); // -1 para mostrar que ja está ocupado
            System.out.println("Objeto Inserido");
            return;
         }

        if (valores[posicao].getObjeto().getValue() == objeto.getValue()) { // repetido
            System.out.println("Ja inserido");
            return;
        }
        if (valores[posicao].getFlag() == -2) { // se o flag for igual a -2 ele estará vazio
            valores[posicao].setObjeto(objeto);
            valores[posicao].setFlag(-1); // -1 para mostrar que ja está ocupado
            System.out.println("Objeto Inserido");
            return;

        } else if (valores[posicao].getFlag() == -1) {

            if (valores[posicao].getObjeto().getValue() == objeto.getValue()) { // repetido
                System.out.println("Ja inserido");
                return;
            }
        
       
            for (int i = fin; i >= 0; i--) { 

                if (valores[i].getObjeto().getValue() == objeto.getValue()) { // repetido
                    System.out.println("Ja inserido");
                    return;
                }
               
                if (valores[i].getFlag() == -2) { // se for o ultimo vai ter que ter endereçamento de fora do porão
                    if (i == valores.length) {
                        valores[posicao].setFlag(i);
                        valores[i].setObjeto(objeto);
                        valores[i].setFlag(-1);
                        System.out.println("Objeto inserido");
                        fin= fin--;
                        return;
                    } else { // se ja estiver fora do ultimo do porão seu enderecamento
                                                             // fara referencia ao anterior
                        valores[i++].setFlag(i);
                        valores[i].setFlag(-1);
                        valores[i].setObjeto(objeto);
                        System.out.println("Ja inserido");
                        return;

                    }
                }
            }
            System.out.println("Objeto não inserido ");
            return;
        }
    }

    public Objeto get(int key) {
         int posicao = (key%101)%100;

         if(valores[posicao]==null){
         
            return null; 
         }
      
         if(valores[posicao].getFlag()==-2){ // se for -2 ja nao a o objeto
            System.out.println("Objeto não achado");
            return null;
         }else{
           if(valores[posicao].getFlag()==-1){ // se for -1 vamos comparar se o objeto que esta dentro é o requisistado atraves da chave
              if(valores[posicao].getObjeto().getKey()==key){
                  return valores[posicao].getObjeto();
              }else{
                  for(int i = valores[posicao].getFlag();i<=0;i--){
                    if(valores[i].getObjeto().getKey()==key){
                        return valores[posicao].getObjeto();
                    }  
                  }
                }
              }
           }
                System.out.println("Nao achado");           
                return null;

         }

    }


