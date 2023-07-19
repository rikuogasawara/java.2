class Counter {
	private final Lock lock = new ReentrantLock();
	private long count = 0;

	public void add(long i) {
		try {
			lock.lock();
//				System.out.println("足し算をします threadName = " + Thread.currentThread().getName());
			count += i;
		} finally {
			lock.unlock();
		}
	}

	public void mul(long i) {
		try {
			lock.lock();
//				System.out.println("かけ算をします threadName = " + Thread.currentThread().getName());
			count *= i;
		} finally {
			lock.unlock();
		}
	}
}