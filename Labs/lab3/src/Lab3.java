import java.util.concurrent.*;
public class Lab3 {

	public synchronized static void main(String[] args){
		ExecutorService executor = Executors.newFixedThreadPool(1000);
		for (int i = 0; i < 1000; i++){
			executor.execute(new SumTask(i));
			
		}
		executor.shutdown();
	}

}