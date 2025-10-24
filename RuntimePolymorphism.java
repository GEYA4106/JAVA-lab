class Animal{
    void sound(){
        System.out.println("Animals make sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dogs bark");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Cats meow");
    }
}
public class RuntimePolymorphism{
    public static void main(String[] args){
        Animal a;
        a=new Dog();
        a.sound();
        a=new Cat();
        a.sound();
    }
}