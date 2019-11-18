public class Engine extends Device{
    public Engine(String name){
        super(name);
        System.out.println("девайс "+name+" создан");
    }

    void Gas() {
        System.out.print(" "+getName()+ " и " );
    }

    void Per() {
        System.out.print("Из нижнего сопла "+this.getName());
    }

    void GoGas() {
        System.out.print("\n с легким шипением вырывалась тонкая струя нагретых газов. ");
    }
}
