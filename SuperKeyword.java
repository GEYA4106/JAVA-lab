class Animal{
    String name="Animal";
    Animal(){
        System.out.println("Animal is called");
    }
    void display(){
        System.out.println("this is animal");
    }
}
class Dog extends Animal{
    String name="Dog";
    Dog(){
        super();
        System.out.println("Dog is called");
    }
    void setdetails(){
        System.out.println("Parent name:"+super.name);
        System.out.println("Child name:"+name);
        super.display();
    }
}
public class SuperKeyword{
    public static void main(String [] args){
        Dog d = new Dog();
        d.setdetails();
    }
}