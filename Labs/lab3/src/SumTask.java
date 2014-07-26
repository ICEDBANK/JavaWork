
public class SumTask implements Runnable {
	int sum;


	public SumTask(int s) {
		sum = s;
	}


	public void run() {

		System.out.println("Sum is " + sum);

	}

}
