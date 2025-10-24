public class MultipleCatches{
    public static void main(String [] args){
        try {
            int a=10;
            int b=0;
            int result=a/b;
            int arr[]={1,2,3,4};
            System.out.println(arr[5]);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception caught"+e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Exception caught:"+e);
        }catch(Exception e){
            System.out.println("General Exception caught:"+e);
        }
        System.out.println("Program Continues");
    }
}