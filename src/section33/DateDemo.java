package section33;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//We have predefined Date class present in java.util package by which we can get current date[system date]
		Date d  = new Date();
		System.out.println(d.toString());
		
		//We have predefined SimpleDateFormat class present in java.text package for defining format as per requirement.
		//Serach simpledateformat for other combinations
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
		System.out.println(sdf.format(d));
		

		SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(sd.format(d));
		

	}

}
