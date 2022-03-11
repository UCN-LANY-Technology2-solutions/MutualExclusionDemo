
public class Program {

	public static void main(String[] args) {

		Bufferable sharedStorage = (Bufferable) new SynchronizedWaitingNotifyBuffer();
		
		Producer producer = new Producer(sharedStorage);
		Consumer consumer = new Consumer(sharedStorage);
		
		producer.start();
		consumer.start();
	}

}
