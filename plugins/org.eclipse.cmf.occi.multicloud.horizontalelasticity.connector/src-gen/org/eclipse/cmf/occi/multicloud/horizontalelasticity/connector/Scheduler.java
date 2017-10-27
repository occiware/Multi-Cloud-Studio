package org.eclipse.cmf.occi.multicloud.horizontalelasticity.connector;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Date;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;;

public class Scheduler extends TimerTask {
	
    public void run()
    {
        System.out.println("test test test test");
    }

	public static void main(String[] args) throws Exception {
	    //the Date and time at which you want to execute
		////Scheduler inst = new Scheduler();
	    DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    Date date = dateFormatter.parse("2017-08-10 16:30:20");

	    //Now create the time and schedule it
	    Timer timer = new Timer();

	    //Use this if you want to execute it once
	    //timer.schedule(new Scheduler(), date);
	    Scheduler st = new Scheduler(); // Instantiate SheduledTask class
	    timer.schedule(st, date); //TimeUnit.HOURS.toMillis(8)
	    //timer.schedule(st, date,1000); // repeat each second 

	}

}
