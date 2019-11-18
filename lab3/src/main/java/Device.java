abstract class Device implements IDevice{
    protected final String Name;

    Device(String name) {
        Name = name;
    }
    @Override
    public String getName(){
        return Name;
    }

    void addProperty(Properties property){
        System.out.println("объекту " + this.getName() + " добавлено свойство " + property.getName());
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
        return this.Name + " создан\n";
    }

}
