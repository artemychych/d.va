public class Rocket extends Device{
    public Rocket(String name){
        super(name);
        System.out.println(name + " создана");

    }

    void GoTo(){
        System.out.print("благодаря чему "+this.getName()+" отправилась в космический полет в тот момент, когда этого никто не ожидал. ");
    }

    void Trace(Type type){
        System.out.print("Это произошло почти "+type+". ");
    }

    void ReactPower(){
        System.out.print("Реактивной силы от этой струи было достаточно, чтобы сообщить "+this.getName()+" поступательное движение, ");
    }

    void None_Mass(){
        System.out.print("сама "+this.getName()+" ровным счетом ничего не весила.");
    }

}
