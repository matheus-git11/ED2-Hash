package Hash;

public class ObjetoPorao {
    private Objeto objeto;
    private int flag;

     public ObjetoPorao(){
       this.objeto=null;
       flag = -2;
     }
    public Objeto getObjeto() {
        return objeto;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public void setObjeto(Objeto objeto) {
        this.objeto = objeto;
    }

}
