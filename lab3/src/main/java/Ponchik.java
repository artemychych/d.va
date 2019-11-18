public class Ponchik extends Human {
    public Ponchik(String name){
        super(name);
        System.out.println("объект " + name + " создан");
    }

    void PressButton(){
        System.out.print(this.getName()+" нажал как раз ту кнопку, ");
    }
}
