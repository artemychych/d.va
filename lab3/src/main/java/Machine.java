public class Machine extends Device{
    public Machine(String name){
        super(name);
        System.out.println("девайс " + name + " создан");
    }
    void PowerButtonOn(){
        System.out.print("которая включала электронную управляющую машину. \nA "+getName()+" как это и было ");
    }


}
