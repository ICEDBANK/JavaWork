import java.util.concurrent.*;
public class Thread2 {
private Integer sum = new Integer(0);
public synchronized static void main(String[] args){
	
	Thread2 test = new Thread2();
	System.out.println("What is sum? " + test.sum);
}
public void Threads(){
	ExecutorService executor = Executors.newFixedThreadPool(1000);
	executor.execute(new SumTask());
	executor.shutdown();
	while(!executor.isTerminated()){
		
	}
	}
//with synchronization

public int getsum(){
	return sum;
}

public void setsum(){
	
}
class SumTask implements Runnable{
	public void run(){
		sum += 1;
	}
}
}
