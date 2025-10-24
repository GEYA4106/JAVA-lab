class MyException extends Exception{
    MyException(String message){
        super(message);
    }
}
public class UserDefined{
    public static void main(String [] args){
        try {
            int age=13;
            if (age<18){
                throw new MyException("Age must be above 18!");
            }
            System.out.println("Eligible to vote");
        } catch (Exception e) {
            System.out.println("Exception caught:"+e);
        }
    }
}