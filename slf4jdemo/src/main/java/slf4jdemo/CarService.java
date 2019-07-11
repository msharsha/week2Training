package slf4jdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarService {
	
	private Logger log = LoggerFactory.getLogger(CarService.class);
	public void process(String msg) {
		if(log.isDebugEnabled()) {
			log.debug("Processing Car : "+ msg); //3 objects will be created soo.
		}
		log.debug("Processing Car in smart way : {}", msg);
		log.info("Processing Car in smart way : {}", msg);
		log.error("Processing Car in smart way : {}", msg);
		//	System.out.println("processed car");
	}         
}
