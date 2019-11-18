public class Zero_Gravity extends Device{
    public Zero_Gravity(String name){
        super(name);
        System.out.println("девайс "+name+" создан");
    }

    void nothing(){
        System.out.print("сама собой включила "+this.getName()+",");
    }

    void nothing_2(){
        System.out.print("так как благодаря наличию "+this.getName()+" \n");
    }

}
