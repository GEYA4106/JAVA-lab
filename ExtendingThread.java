class GoodMorning extends Thread{
    public void run(){
        try{
            for(int i=1;i<=3;i++){
                System.out.println("Good Morning");
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Interrupted");
        }
    }
}
class Hello extends Thread{
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
class Welcome extends Thread{
    public void run(){
        try {
            for(int i=1;i<=3;i++){
                System.out.println("Welcome");
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            System.out.println("Welcome interrupted");
        }
    }
}
public class ExtendingThread{
    public static void main(String[] args) {
        GoodMorning t1 = new GoodMorning();
        Hello t2 = new Hello();
        Welcome t3 = new Welcome();
        t1.start();
        t2.start();
        t3.start();
    }
}