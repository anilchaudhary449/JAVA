class Mobile{
    String brand;
    int price;
    static String name;

    static{
        name="Phone";
        System.out.println("in static block");
    }

    public Mobile(){
        brand="";
        price=200;
        System.out.println("in constructor");
    }
    public void show()
    {
        System.out.println(brand+":"+price+":"+name);
    }
}
public class StaticBlock{

    public static void main(String[] args) throws ClassNotFoundException {

       // Class.forName(className:"Mobile";)
        Mobile obj1= new Mobile();
        obj1.brand="Apple";
        obj1.price=1500;
        Mobile.name="SmartPhone";
        
        @SuppressWarnings("unused")
        Mobile obj2=new Mobile();
    }
}

