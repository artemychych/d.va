abstract class Human implements IHuman{
    private final String Name;

    Human(String name) {
        Name = name;
    }

    @Override
    public String getName(){
        return Name;
    }

    void addSkill(Skill skill){
        System.out.println("объекту " + this.getName() + " добавлено умение " + skill.getName());
    }


    @Override
    public int hashCode(){
        return super.hashCode()+this.Name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode() ? true : false;
    }

    @Override
    public String toString() {
        return "человек по имени " + this.Name + " создан\n";
    }
}