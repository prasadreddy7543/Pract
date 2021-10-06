package Selenium.Pract;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
@Test
public class App 
{
	

	Logger lgg = LogManager.getLogger(App.class);

    public  void klll() {
    
    
    
        System.out.println( "Hello World!" );
        lgg.info("this is an message");
        lgg.warn("thi is an warmning");
    }
}
