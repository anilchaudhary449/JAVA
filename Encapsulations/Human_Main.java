package Encapsulations;
class Human{
 private int age;
  private String name; 
  
  public void setAge(int age){
    this.age=age;
  }
  public int getAge(){
    return age;
  }
  public void setName(String name){ // here, "Anil" assigned to n then to name
    this.name=name;
  }
  public String getName(){
    return name;
  }
}
public class Human_Main {
    public static void main(String[] args) {
    Human obj=new Human();
    obj.setAge(23);
    obj.setName("Anil");;

    System.out.println(obj.getAge()+":"+obj.getName());
}
}