public class Main {
    public static void main(String[] args){
        Ponchik ponchik = new Ponchik("Пончик");
        ponchik.addSkill(new Skill("Нажать кнопку"));

        Reader readers = new Reader("Читатели");
        readers.addSkill(new Skill("Сообразить"));

        Konstruktor konstruktor = new Konstruktor("Конструктор");
        konstruktor.addSkill(new Skill("Предусмотреть"));

        Villager villager = new Villager("Обитателей");
        villager.addSkill(new Skill("Проснуться"));
        villager.addSkill(new Skill("Выглянуть в окно"));
        villager.addSkill(new Skill("Удивиться"));
        villager.addSkill(new Skill("Увидеть"));

        Machine machine = new Machine("Электронная управляющая машина");
        machine.addProperty(new Properties("Нажать на кнопку"));

        Zero_Gravity zero = new Zero_Gravity("Прибор невесомости");
        zero.addProperty(new Properties("Ничего не весить"));

        Engine engine = new Engine("Реактивный двигатель");
        engine.addProperty(new Properties("Испускать газ"));

        Other other = new Other("всё остальное оборудование");;

        Rocket rocket = new Rocket("Ракета");

        System.out.println("Начало\n");

        readers.Consider();
        ponchik.PressButton();
        machine.PowerButtonOn();
        konstruktor.provide();
        zero.nothing();
        engine.Gas();
        System.out.println(other.getName()+", ");
        rocket.GoTo();
        villager.WakeUp();
        villager.LookUp();
        villager.Surprised();
        villager.LookAt(Type.SLOW, Type.FLUENTLY);
        rocket.Trace(Type.QUIETLY);
        engine.Per();
        engine.GoGas();
        rocket.ReactPower();
        zero.nothing_2();
        rocket.None_Mass();


    }
}




