package Hash;

public class HashSimples {
    private Objeto valores[];

    public HashSimples() {
        valores = new Objeto[100];
    }

    public void put(Objeto objeto) {
        int posicao = (objeto.getKey()%101)%valores.length;
        if (valores[posicao] == null) {
            valores[posicao] = objeto;
            System.out.println("Inseriu");
        }
    }

    public Objeto get(int key) {
        int posicao = (key%101)%valores.length;
        return valores[posicao];
        
    }

    public void delete(int key){
        int posicao = (key%101)%valores.length; 
         if(valores[posicao]==null){
             System.out.println("Valor não achado");
         }else{
             valores[posicao]=null;
             System.out.println("Valor Removido");
         }
    }

}
