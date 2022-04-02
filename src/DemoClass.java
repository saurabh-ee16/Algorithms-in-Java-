
public class DemoClass {

	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {

				System.out.println("Hello, This is first Thread=" + Thread.currentThread().toString());
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}

		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				
				System.out.println("waiting for t1 to end....");
				
				try {
					t1.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("Hello, This is second thread=" + Thread.currentThread().toString());
				

			}

		});

		t1.start();
		t2.start();
	}

}
