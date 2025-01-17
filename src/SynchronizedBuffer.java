// Implementation of a synchronized buffer
public class SynchronizedBuffer implements Bufferable {


	private int value = 0;

	public synchronized int setValue(int value) throws InterruptedException {
		Thread.sleep(100);
		if (this.value == 0) {
			this.value = value;
			return this.value;
		}
		return 0;	
	}

	public synchronized int getValue() throws InterruptedException {
		Thread.sleep(200);
		int res = this.value;
		this.value = 0;
		if(res == 0)
			System.out.print("Buffer empty - ");
		return res;
	}

}
