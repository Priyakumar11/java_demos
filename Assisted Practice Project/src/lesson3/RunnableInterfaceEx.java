package lesson3;

public class RunnableInterfaceEx implements Runnable {
	public void run(){
	      System.out.println("Thread is running from Runnable Intrface");
	   }
	   public static void main(String args[]){
	      RunnableInterfaceEx runnable=new RunnableInterfaceEx();
	      Thread t1 =new Thread(runnable);
	      t1.start();
	   }

}
