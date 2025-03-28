package lambdas;

public class Threads {

	public static void main(String[] args) {
		
		Runnable t1 = new Trabalho1();
		Runnable t2 = new Runnable() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Tarefa #2");
					try {
						Thread.sleep(100);
					} catch (Exception e) {

					}
				}
			}
		};
		
		Runnable t3 = Threads::t3; 
		
		Thread trab1 = new Thread(t1);
		Thread trab2 = new Thread(t2);
		Thread trab3 = new Thread(t3);
		
		trab1.start();
		trab2.start();
		trab3.start();
	}
	
	static void t3() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Tarefa #3");
			try {
				Thread.sleep(100);
			} catch (Exception e) {

			}
		}
	}
}
