// Implementation of an unsynchronized buffer
public class UnsynchronizedBuffer implements Bufferable {

	private int value = 0;
	
	@Override
	public int setValue(int value) throws InterruptedException {
		Thread.sleep(1000);
		if (this.value == 0) {
			this.value = value;
			return this.value;
		}
		System.out.print("Buffer full! - ");
		return 0;
	}

	@Override
	public int getValue() throws InterruptedException {
		Thread.sleep(2000);
		int res = this.value;
		this.value = 0;
		if(res == 0)
			System.out.print("Buffer empty - ");
		return res;
	}

}
