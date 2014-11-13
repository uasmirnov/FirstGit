
public class Main {
	
	private static int number;
	

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new WorkerThread());
		Thread t2 = new Thread(new WorkerThread());
		Thread t3 = new Thread(new WorkerThread());
		Thread t4 = new Thread(new WorkerThread());
		Thread t5 = new Thread(new WorkerThread());
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(number);
		
	}
	
	public static synchronized void increceNumber(){
		number++;
	}
}
