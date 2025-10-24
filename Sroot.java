import java.util.Scanner;
class Sroot{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values of a,b,c");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double discriminant=b*b-(4*a*c);
        double root1=(-b+Math.sqrt(discriminant))/2*a;
        double root2=(-b-Math.sqrt(discriminant))/2*a;
        if(discriminant==0){
            double root=(b/2*a);
            System.out.println("roots are real and equal");
            System.out.println("Root="+root);
        }
        else if(discriminant>0){
            System.out.println("roots are real and distinct");
            System.out.println("root1="+root1);
            System.out.println("root2="+root2);
        }
        else{
            System.out.println("roots are imaginary");
        }


    }
}