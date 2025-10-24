class MyThread extends Thread{
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println(getName()+":"+i);
        }
    }
}
public class AliveJoin{
    public static void main(String []args)throws Exception {
        MyThread t1 = new MyThread();
        t1.start();
        System.out.println("Is it Alive?"+t1.isAlive());
        t1.join();
        System.out.println("Is it alive after joining"+t1.isAlive());
        System.out.println("Main Thread Finished");
    }
}