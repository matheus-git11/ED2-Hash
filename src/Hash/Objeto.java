package Hash;

public class Objeto implements Comparable<Objeto> {
    private int key;
    private String value;

    public Objeto() {

    }

    public Objeto(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setKey(int key) {
        this.key = key;
    }

    @Override
    public int compareTo(Objeto o) {
        if(this.key == o.getKey()){
            return 0;
        }else if(this.key > o.getKey()){
            return 1;
        }else{
            return -1;
        }
     
    }

}
