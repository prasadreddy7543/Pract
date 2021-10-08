package logtest;




import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
@Test
public class Workbook {
Logger log = LogManager.getLogger(Workbook.class);

	public void lggg () {
		DOMConfigurator.configure("log4j.xml");
		System.out.println("\n hello world\n");
		log.info("this is an message information");
		log.error("this is an error");
		log.warn("this is warn");
		log.fatal("this is fatal");
	
	System.out.println("\ncompleted");}
	
	
	
}
