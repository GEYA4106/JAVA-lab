class MyDaemon extends Thread{
	public void run(){
		while (true) {
			System.out.println("Daemon thread running");
		}
	}
}
public class DaemonThread{
	public static void main(String [] args){
		MyDaemon d = new MyDaemon();
		d.setDaemon(true);
		d.start();
		System.out.println("Main Thread Ended");
	}
}