// Implementation of a synchronized buffer
public class SynchronizedBuffer implements Bufferable {


	private int value = 0;

	public synchronized int setValue(int value) throws InterruptedException {

		Thread.sleep(1000);

		while (this.value != 0) {
			wait();
		}
		this.value = value;
		notify();
		return this.value;	
	}

	public synchronized int getValue() throws InterruptedException {

		Thread.sleep(2000);

		while (this.value == 0) {
			wait();
		}
		int res = this.value;
		this.value = 0;
		notify();
		return res;
	}

}
