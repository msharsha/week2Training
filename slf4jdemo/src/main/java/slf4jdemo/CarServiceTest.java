package slf4jdemo;

import org.junit.Test;

public class CarServiceTest {
	
	@Test
	public void test() {
		CarService service = new CarService();
		service.process("Servicing my car in progress");
	}
}
