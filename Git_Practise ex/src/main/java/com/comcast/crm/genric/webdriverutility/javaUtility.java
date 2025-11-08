package com.comcast.crm.genric.webdriverutility;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class javaUtility {
	
	public SimpleDateFormat sdf;
	
	public int getRandomNumber() {
		Random random=new Random();
		int randomNumber=random.nextInt(10000);
		return randomNumber;
	}
	
	public String getSystemDateYYYYDDMM()
	{
		Date dateobj=new Date();
		 sdf=new SimpleDateFormat("yyyy-MM-dd");
		String date=sdf.format(dateobj);
		return date;
		
	}
	
	public String getRequiredDateYYYYDDMM(int days) {
		
			
			Calendar cal = sdf.getCalendar();
			cal.add(Calendar.DAY_OF_MONTH,days);
			String endDate = sdf.format(cal.getTime());
			return endDate;
		
	}
	
	public String getCurrentDateYYYYDDMM()
	{
		LocalDate today=LocalDate.now();
		return today.toString();
	}
	
	public String getRequiredDateYYYYDDMM()
	{
		LocalDate today=LocalDate.now();
		String reqdate = today.plusDays(getRandomNumber()).toString();
		return reqdate;
	}
	
	

}
