package org.c;

import java.awt.Image;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExecutionClass extends MethodClass{
	
	
	@BeforeMethod
	private void start(ITestResult t) {
		System.out.println("\n"+t.getMethod().getMethodName()+"\n=====================\n");

	}
	
	String className = "";
	@Test(priority = 1, enabled = true)
	public void Title() {
		className = className();
	}
	
	
	
	@Test(priority = 2, enabled = true)
	private void Description() {
		if (StringUtils.containsIgnoreCase(className, "Yoga")) {
			System.out.println("\nLeave your organizational tasks to Omnify. \nEnjoy a complete software solution to "
					+ "manage your yoga business. \nFrom booking to online scheduling, and payment processing to "
					+ "staff management, \neliminate all operational hassles and focus on what you do best.\n");
		}
		
	}
	
	@Test(priority = 3, enabled = true)
	private void ClassColor() {
		classColor();

	}
	
	@Test(priority = 3, enabled = true)
	private void Image() {
		addImage();

	}
	
	String location = "";
	@Test(priority = 4, enabled = true)
	private void ClassDetails() {
		
		location = location();
		trainer(location);
		serviceType();
		
	}
	
	@Test(priority = 5, enabled = true)
	private void ClassSchedule() {
		daysOfWeek();
		
	}
	String startDate = "";
	@Test(priority = 6, enabled = true)
	private void StartDateAndTime() {
		startDate = date();
		time();
		
	}
	
	@Test(priority = 7, enabled = true)
	private void EndDateAndTime() {
		date();
		time();
		
	}
	
	@Test(priority = 8)
	private void BookingWindow() {
		String bookingDateStart = bookingDates(-20);
		String bookingDateEnd = bookingDates(5);
		String currentDate = currentDate();
		System.out.println("Booking starts on "+bookingDateStart+"\n");
		System.out.println("Booking ends on "+bookingDateEnd+"\n");
		System.out.println("My booking Date "+currentDate()+"\n");
		boolean statusA = true;
		boolean statusC = true;
		if(bookingDateStart.compareTo(currentDate) > 0 && currentDate.compareTo(bookingDateEnd) < 0) {
	         
	         statusA = true;
	      }else {
			statusC = false;
		}
		if (statusA == true ) {
			System.out.println("Booking Confirmed");
		}else if (statusC == false) {
			System.out.println("Booking Closed");
		}
	}

}
