package Hash;

public class Objeto {
  private  int key;
 private String value;

 public Objeto(){

 }

 public Objeto(int key, String value){
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
 public int hashCode(){
     return key % 100;
 }
}