public class Konstruktor extends Human{
    public Konstruktor(String name){
        super(name);
        System.out.println("объект " + name + " создан");
    }

    void provide(){
        System.out.print("предусмотрено "+getName()+"ами, ");
    }
}
