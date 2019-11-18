public class Villager extends Human{
    public Villager(String name){
        super(name);
        System.out.println("объект " + name + " создан");
    }

    void WakeUp(){
        System.out.print("Если бы кто-нибудь из "+this.getName()+" Космического городка в эту минуту проснулся\n и ");
    }

    void LookUp(){
        System.out.print("выглянул в окно, ");
    }

    void Surprised(){
        System.out.print("то был бы крайне удивлен,");
    }

    void LookAt(Type type, Type _type){
        System.out.print("увидев, как ракета "+type+" отделилась от земли и "+_type+" поднялась в воздух. ");
    }
}
