package simpleFactory;

public class ChartFactory {

	public static Chart getChart(String name){
		
		Chart chart = null;
		if(name.equalsIgnoreCase("his")){
			chart = new HistogramChart();
			System.out.println("��ʼ����״ͼ");
		}else if(name.equalsIgnoreCase("pie")){
			chart = new PieChart();
			System.out.println("��ʼ����״ͼ");
		}else if(name.equalsIgnoreCase("line")){
			chart = new LineChart();
			System.out.println("��ʼ������ͼ");
		}
		return chart;
	}

}
