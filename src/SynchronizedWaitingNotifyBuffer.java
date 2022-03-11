// Implementation of a synchronized buffer
public class SynchronizedWaitingNotifyBuffer implements Bufferable {


	private int value = 0;

	public synchronized int setValue(int value) throws InterruptedException {

		Thread.sleep(100);

		while (this.value != 0) {
			wait();
		}
		this.value = value;
		notify();
		return this.value;	
	}

	public synchronized int getValue() throws InterruptedException {

		Thread.sleep(200);

		while (this.value == 0) {
			wait();
		}
		int res = this.value;
		this.value = 0;
		notify();
		return res;
	}

}
