package question5;
import java.lang.*;  
public class ThreadPriorityExample1  extends Thread  {

	public void run()   {
		// TODO Auto-generated constructor stub
		System.out.println(" priority are");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating thread.
		ThreadPriorityExample1 th = new ThreadPriorityExample1 ();  
		ThreadPriorityExample1  th2 = new ThreadPriorityExample1 (); 
		
		th.setPriority(6);  
		th2.setPriority(3);
		System.out.println("Priority of the thread th is " + th.getPriority());
		System.out.println("Priority of the thread th2 is : " + th2.getPriority()); 
		
		
		System.out.println("Currently Executing The Thread is " + Thread.currentThread().getName());  
		  
		System.out.println("Priority of the main thread is " + Thread.currentThread().getPriority());
		
		Thread.currentThread().setPriority(10);  // setting new priority to main thread
		  
		System.out.println("Priority of the main thread is now  : " + Thread.currentThread().getPriority());  
	}
}
		


