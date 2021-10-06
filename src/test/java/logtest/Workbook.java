package logtest;




import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
@Test
public class Workbook {
Logger log = LogManager.getLogger(Workbook.class);
	public void lggg () {
		System.out.println("\n hello world\n");
		log.info("this is an information");
		log.error("this is an error");
		log.warn("this is warn");
		log.fatal("this is fatal");
	
	System.out.println("\ncompleted");}
	
	
	
}
