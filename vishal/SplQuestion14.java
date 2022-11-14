/*
14. You are given a list of strings, times, where each string represent a timestamp of a 
twenty-four hour clock (i.e. hours and minutes - “HH:MM”). Return the minimum 
difference, in minutes, between any two of the timestamps in the list.
*/

import java.util.*;

class SplQuestion14 {

	static int getTimeInSeconds(String str) {

		String[] curr_time = str.split(":");
		int t = Integer.parseInt(curr_time[0]) * 60 * 60 + Integer.parseInt(curr_time[1]) * 60
				+ Integer.parseInt(curr_time[2]);

		return t;
	}
	static String convertSecToTime(int t) {
		int hours = t / 3600;
		String hh = hours < 10 ? "0" + Integer.toString(hours)
				: Integer.toString(hours);
		int min = (t % 3600) / 60;
		String mm = min < 10 ? "0" + Integer.toString(min)
				: Integer.toString(min);
		int sec = ((t % 3600) % 60);
		String ss = sec < 10 ? "0" + Integer.toString(sec)
				: Integer.toString(sec);
		String ans = hh + ":" + mm + ":" + ss;
		return ans;
	}
	static String timeGap(String st, String et) {

		int t1 = getTimeInSeconds(st);
		int t2 = getTimeInSeconds(et);

		int time_diff = (t1 - t2 < 0) ? t2 - t1 : t1 - t2;

		return convertSecToTime(time_diff);
	}
	public static void main(String args[]) {

		String st = "13:50:45", et = "14:55:50";
		System.out.println(timeGap(st, et));
	}
}
