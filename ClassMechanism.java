class Calculator{
    void add(int a,int b){
        System.out.println("Sum of two integers:"+(a+b));
    }
}
public class ClassMechanism{
    public static void main(String [] args){
        Calculator c = new Calculator();
        c.add(10,4);
    }
}