package simpleFactory;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Chart chart = null;
		chart = ChartFactory.getChart("his");
		chart.display();
		
	}

}
