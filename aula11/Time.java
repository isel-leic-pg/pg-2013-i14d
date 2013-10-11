import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time{

	static long timeAtMidnight(String today) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d = sdf.parse(today);
		return d.getTime();
	}
	
	public static void main(String [] args) throws ParseException{
		long endTime = System.currentTimeMillis();
		long startTime = timeAtMidnight("11/10/2013");
		long interval = endTime - startTime;
		
		int hora = (int) interval/3600000;
		int a = (int) interval%3600000;
		
		int min = a/60000;
		int b = a%60000;
		
		int secs = b/1000;
		int milis = b%1000;
		
		System.out.printf("%d:%d:%d.%d\n", hora, min, secs, milis);
	}

}