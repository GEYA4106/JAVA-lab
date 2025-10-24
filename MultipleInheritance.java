interface A{
    int x=70;
    public void showA();
}
interface B{
    int y=50;
    public void showB();
}
class C implements A,B{
    public void showA(){
        System.out.println("Value of x="+x);
    }
    public void showB(){
        System.out.println("Value of y="+y);
    }
}
public class MultipleInheritance{
    public static void main(String []args){
        C obj=new C();
        obj.showA();
        obj.showB();
    }
}