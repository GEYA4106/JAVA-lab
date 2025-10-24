class MathsOperation{
    void add(int a,int b){
        System.out.println("Sum of two integers:"+(a+b));
    }
    void add(int a,int b,int c){
        System.out.println("Sum of hree integers:"+(a+b+c));
    }
    void add(double a,double b){
        System.out.println("Sum of two doubles:"+(a+b));
    }
}
public class MethodOverloading{
    public static void main(String[] args) {
        MathsOperation obj = new MathsOperation();
        obj.add(5,2);
        obj.add(4,2,1);
        obj.add(5.2,2.1);
    }
}