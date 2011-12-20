import java.util.Calendar;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ScheduleJob {

	private final static short SCHEDUCLE_HOUR = 9;
	private final static short SCHEDULE_MINUTE = 47;
	private final static short SCHEDULE_SECOND = 0;
	

	public ScheduleJob() {
		init();
	}

	private void init() {
		
		ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);   
		
		// to run the job at 1:00 am
		Calendar date = Calendar.getInstance();
		date.set(Calendar.HOUR_OF_DAY, SCHEDUCLE_HOUR);
		date.set(Calendar.MINUTE, SCHEDULE_MINUTE);
		date.set(Calendar.SECOND, SCHEDULE_SECOND);
		date.set(Calendar.MILLISECOND, 0);
		
		if (Calendar.getInstance().after(date)) {
			date.add(Calendar.DATE, 1);
		}
		
		long period = 1000 * 60 * 60 * 24;
		long delay = date.getTimeInMillis() - Calendar.getInstance().getTimeInMillis() ;
		System.out.println(delay);        
		scheduledThreadPoolExecutor.scheduleAtFixedRate(new ConvertData(),delay, period, TimeUnit.MILLISECONDS);
	}

}
	 

