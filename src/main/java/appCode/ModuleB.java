package appCode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ModuleB {
	
	// Creating a logger
	private static Logger logger = LogManager.getLogger();
	
	public static void main(String[] args) {
		logger.info("Calling main method of Module A");
		ModuleA.main(new String[] {});
	}

}
