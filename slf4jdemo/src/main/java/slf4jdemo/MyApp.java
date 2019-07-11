package slf4jdemo;
import org.slf4j.*;
public class MyApp {

	private static Logger logger = LoggerFactory.getLogger(MyApp.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logger.info("Hello everybody");
		int res = add(10,20);
		System.out.println("result: "+res);

	}
	public static int add(int a, int b) {
		return a+b;
	}

}
