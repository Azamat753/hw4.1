public class Main {

	public static void main(String[] args) {
		System.out.println("Старт " + Thread.currentThread().getName());

		try {
			for (int i = 1; i < 6; i++) {
				Runner r1 = new Runner("Runner" + i);
				{
					r1.start();
					r1.join();

				}
			}
		} catch (InterruptedException ie) {
		}
		System.out.println("Финиш " + Thread.currentThread().getName());
	}
}