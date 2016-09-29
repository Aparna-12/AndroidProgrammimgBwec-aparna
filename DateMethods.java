import java.util.*;
import java.text.*;
public class DateMethods{
	public static void main(String[] args){
	Date date=new Date();
	SimpleDateFormat ft=new SimpleDateFormat("MMM dd, yyyy hh:mm:ss a");
	System.out.println("Current Date" +ft.format(date));
	}
	}
