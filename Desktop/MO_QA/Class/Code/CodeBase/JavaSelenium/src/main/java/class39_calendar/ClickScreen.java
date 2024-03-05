package class39_calendar;

import java.awt.AWTException;
import java.awt.GraphicsEnvironment;
import java.awt.Robot;
import java.awt.event.MouseEvent;

public class ClickScreen {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		//GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[1];
		
		Thread.sleep(10000);
		
		Robot r=new Robot();
		
		for(int i=0;i<100;i++)
		{
		
			r.mousePress(MouseEvent.BUTTON1_DOWN_MASK); 
			
			r.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
			
			Thread.sleep(2000);
		
		}
	}

}
