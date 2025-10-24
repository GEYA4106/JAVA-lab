interface Animal{
    void sound();
    void eat();
}
class Dog implements Animal{
    public void sound(){
        System.out.println("Dog Barks");
    }
    public void eat(){
        System.out.println("Dog eats food");
    }
}
public class Interface{
    public static void main(String[] args){
        Animal obj = new Dog();
        obj.sound();
        obj.eat();
    }
}