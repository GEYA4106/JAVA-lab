class Animal{
    void sound(){
        System.out.println("Animal makes sounds");
    }
}
class Dog extends Animal{
    void barks(){
        System.out.println("Dog barks");
    }
}
class Puppy extends Dog{
    void weeps(){
        System.out.println("Puppy weeps");
    }
}
public class MulilevelInheritance{
    public static void main(String [] args){
        Puppy p = new Puppy();
        p.sound();
        p.barks();
        p.weeps();
    }
}