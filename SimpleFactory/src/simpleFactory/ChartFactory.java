package simpleFactory;

public class ChartFactory {

	public static Chart getChart(String name){
		
		Chart chart = null;
		if(name.equalsIgnoreCase("his")){
			chart = new HistogramChart();
			System.out.println("初始化柱状图");
		}else if(name.equalsIgnoreCase("pie")){
			chart = new PieChart();
			System.out.println("初始化饼状图");
		}else if(name.equalsIgnoreCase("line")){
			chart = new LineChart();
			System.out.println("初始化线形图");
		}
		return chart;
	}

}
