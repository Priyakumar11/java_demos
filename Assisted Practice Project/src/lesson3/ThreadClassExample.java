package lesson3;

public class ThreadClassExample extends Thread {
	public void run()
 	{
  		System.out.println("Thread started running");
}
 	public static void main( String args[] )
 	{
  		ThreadClassExample mt = new  ThreadClassExample();
  		mt.start();
 	}
}
