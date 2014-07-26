
public class Lab4 {
	public static void main(String[] args) {
	    Stock stock = new Stock("ESI", "ITT Technical Institute.");
	    stock.setPreviousClosingPrice(60);

	    // Set current price
	    stock.setCurrentPrice(65);

	    // Display stock info
	    System.out.println("Previous Closing Price: " +
	      stock.getPreviousClosingPrice());
	    System.out.println("Current Price: " +
	      stock.getCurrentPrice());
	    System.out.println("Price Change: " +
	      stock.changePercent());
	  }
}
