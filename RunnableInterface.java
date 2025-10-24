class GoodMorning implements Runnable{
    public void run(){
        try {
            for(int i=1;i<=3;i++){
                System.out.println("Good Morning");
                Thread.sleep(1000);
            }            
        } catch (InterruptedException e) {
            System.out.println("Good Morning Interrupted");
        }
    }
}
class Hello implements Runnable{
    public void run(){
        try {
            for(int i=1;i<=3;i++){
                System.out.println("Hello");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e){
            System.out.println("Hello interrupted");
        }
    }
}
class Welcome implements Runnable{
    public void run(){
        try {
            for(int i=1;i<=3;i++){
                System.out.println("Welcome");
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            System.out.println("Welcome Interrupted");
        }
    }
}
public class RunnableInterface{
    public static void main(String [] args){
        GoodMorning gm = new GoodMorning();
        Hello h = new Hello();
        Welcome w = new Welcome();
        Thread t1 = new Thread(gm);
        Thread t2 = new Thread(h);
        Thread t3 = new Thread(w);
        t1.start();
        t2.start();
        t3.start();
    }
}