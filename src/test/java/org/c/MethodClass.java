package org.c;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

public class MethodClass {
	static Scanner s;

	public static String className() {
		s = new Scanner(System.in);
		System.out.println("Available Classes:");
		List<String> li = new ArrayList<String>();
		li.add("Yoga class with Omnify");

		for (int i = 0; i < li.size(); i++) {
			String string = li.get(i);
			System.out.println((i + 1) + ". " + string);
		}
		System.out.println("Please Select any one Class:");
		String classes = s.nextLine();
		int i = 0;
		try {
			while (li.size() > 0) {
				if (StringUtils.containsIgnoreCase(li.get(i), classes)) {
					System.out.println("\nYou have selected " + li.get(i).toUpperCase() + ".\n");
					break;

				} else {
					i++;
				}
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Error: Please re-select the valid class name.\n");
		}
		return li.get(i);
	}

	public static String classColor() {
		s = new Scanner(System.in);
		System.out.println("Available Class Colors:");

		Map<String, String> map = new HashMap<String, String>();
		map.put("Red", "Astana");
		map.put("Blue", "Vinyasa");

		List<String> li = new ArrayList<String>();
		li.add("Red");
		li.add("Blue");

		Set<Entry<String, String>> mapValues = map.entrySet();
		int j = 0;
		for (Entry<String, String> entry : mapValues) {
			System.out.println((j + 1) + ". " + entry);
			j++;
		}

		System.out.println("Please Select any one Color:");
		String color = s.nextLine();
		int i = 0;
		try {
			Set<Entry<String, String>> entrySet = map.entrySet();
			for (Entry<String, String> entry : entrySet) {
				if (StringUtils.containsIgnoreCase(entry.getKey(), color)) {
					System.out.println("\nYou have selected " + entry.getValue().toUpperCase() + " classes.\n");
					break;

				} else {
					i++;
				}
			}

		} catch (IndexOutOfBoundsException e) {
			System.out.println("Error: Please re-select the valid color code.\n");
		}
		return li.get(i);
	}

	public static void addImage() {
		System.out.println("Add image URL:");
		s = new Scanner(System.in);
		String url = s.nextLine();
		System.out.println("\nImage aded : " + url + "\n");

	}

	public static void serviceType() {
		s = new Scanner(System.in);
		System.out.println("Available Services:");
		List<String> li = new ArrayList<String>();
		li.add("Free");
		li.add("Paid");

		for (int i = 0; i < li.size(); i++) {
			String string = li.get(i);
			System.out.println((i + 1) + ". " + string);
		}
		System.out.println("Please Select any one Service Type:");
		String service = s.nextLine();
		int i = 0;
		try {
			while (li.size() > 0) {
				if (StringUtils.containsIgnoreCase(li.get(i), service)) {
					System.out
							.println("\nYou have selected " + li.get(i).toUpperCase() + " service type for classes.\n");
					break;

				} else {
					i++;
				}
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Error: Please re-select the valid service type.\n");
		}

	}

	public static void trainer(String location) {
		s = new Scanner(System.in);
		System.out.println("Available Trainers:");
		List<String> li = new ArrayList<String>();
		li.add("Online Trainer");
		li.add("Offline Trainer");

		int i = 0;
		while (li.size() > 0) {
			if (StringUtils.containsIgnoreCase(li.get(i), location)) {
				System.out.println("\nYou are allocated with " + li.get(i).toUpperCase() + " for classes.\n");
				break;

			} else {
				i++;
			}
		}
	}

	public static String location() {
		s = new Scanner(System.in);
		System.out.println("Available Location:");
		List<String> li = new ArrayList<String>();
		li.add("Online");
		li.add("Offline");

		for (int i = 0; i < li.size(); i++) {
			String string = li.get(i);
			System.out.println((i + 1) + ". " + string);
		}
		System.out.println("Please Select any one Location:");
		String location = s.nextLine();
		int i = 0;
		try {
			while (li.size() > 0) {
				if (StringUtils.containsIgnoreCase(li.get(i), location)) {
					System.out.println("\nYou have selected " + li.get(i).toUpperCase() + " for classes.\n");
					break;

				} else {
					i++;
				}
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Error: Please re-select the valid location.\n");
		}
		return li.get(i);
	}

	public static String daysOfWeek() {
		s = new Scanner(System.in);
		System.out.println("Available Location:");
		List<String> li = new ArrayList<String>();
		li.add("Monday");
		li.add("Tuesday");
		li.add("Wednesday");
		li.add("Thursday");
		li.add("Friday");
		li.add("Saturday");
		li.add("Sunday");

		for (int i = 0; i < li.size(); i++) {
			String string = li.get(i);
			System.out.println((i + 1) + ". " + string);
		}
		System.out.println("Please Select any one day:");
		String day = s.nextLine();
		int i = 0;
		try {
			while (li.size() > 0) {
				if (StringUtils.containsIgnoreCase(li.get(i), day)) {
					System.out.println("\nYou have selected " + li.get(i).toUpperCase() + " for classes.\n");
					break;

				} else {
					i++;
				}
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Error: Please re-select the valid location.\n");
		}
		return li.get(i);
	}

	public static String date() {
		s = new Scanner(System.in);
		System.out.println("Available Dates:");
		List<String> allDates = new ArrayList<String>();

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, 3);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		int maxDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
		System.out.print(df.format(cal.getTime()));
		String dates = "";
		for (int i = 1; i < maxDay; i++) {
			cal.set(Calendar.DAY_OF_MONTH, i + 1);
			// System.out.print(","+df.format(cal.getTime()));
			dates = dates + "," + df.format(cal.getTime());

		}
		String[] split = dates.split(",");
		for (int i = 0; i < split.length; i++) {
			allDates.add(split[i]);
			System.out.println(allDates.get(i));
		}

		System.out.println("Please Select any one day:");
		String date = s.nextLine();
		int i = 0;
		try {
			while (allDates.size() > 0) {
				if (StringUtils.containsIgnoreCase(allDates.get(i), date)) {
					System.out.println("\nYou have selected " + allDates.get(i) + " for classes.\n");
					break;

				} else {
					i++;
				}
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Error: Please re-select the valid Date.\n");
		}
		return allDates.get(i);
	}

	public static String time() {
		s = new Scanner(System.in);
		System.out.println("Available Timing:");
		List<String> li = new ArrayList<String>();
		li.add("10:00 AM");
		li.add("12:00 PM");
		li.add("02:00 PM");
		li.add("04:00 PM");

		for (int i = 0; i < li.size(); i++) {
			String string = li.get(i);
			System.out.println((i + 1) + ". " + string);
		}
		System.out.println("Please Select any one Time slot:");
		String day = s.nextLine();
		int i = 0;
		try {
			while (li.size() > 0) {
				if (StringUtils.containsIgnoreCase(li.get(i), day)) {
					System.out.println("\nYou have selected " + li.get(i) + " for classes.\n");
					break;

				} else {
					i++;
				}
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Error: Please re-select the valid Timing.\n");
		}
		return li.get(i);
	}

	public static String bookingDates(int d) {
		DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");

		Date date = new Date();
		String todate = dateFormat.format(date);

		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, d);
		Date todate1 = cal.getTime();
		String fromdate = dateFormat.format(todate1);
		return fromdate;

	}

	public static String currentDate() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		LocalDateTime now = LocalDateTime.now();
		String format = dtf.format(now);
		return format;
	}

}
