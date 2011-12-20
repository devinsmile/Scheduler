import java.util.Calendar;

public class ConvertData implements Runnable{
	public void run() {
		System.out.println(Calendar.getInstance().getTime());
		System.out.println("Converting data");
	}
}
