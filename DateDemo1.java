import java.util.Date;
public class DateDemo1{
	static long millis=System.currentTimeMillis();
	public static void main(String[] args){
		Date date=new Date(millis);
		System.out.println(date);
		}
	}
