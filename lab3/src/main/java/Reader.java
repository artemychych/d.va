public class Reader extends Human{
    public Reader(String name){
        super(name);
        System.out.println("объект "+ name + " создан");
    }

    void Consider(){
        System.out.print("Некоторые самые догадливые, наверное, "+this.getName()+" сразу сообразили, что ");
    }

}
