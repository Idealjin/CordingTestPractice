package com.sangjin.test;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		//백준 2525 오븐시계
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int time = sc.nextInt();
		final int MIN_MAX = 60;
		
		if(time <= 1000 && hour < 24 && minute < 60) {
			
			int hour2 = hour + ((minute + time) / MIN_MAX);
		
		if(minute + time < MIN_MAX) {
			minute = minute + time;
			System.out.println(hour + " " + minute);
		} else if(minute + time >= MIN_MAX && hour2 < 24) {
			hour = hour2 ;
			minute = (minute + time) - (MIN_MAX * ((minute + time) / MIN_MAX));
			System.out.println(hour + " " + minute);
		} else if(hour2 >= 24 && minute + time >= MIN_MAX) {
			hour = hour2 - 24 ;
			minute = (minute + time) - (MIN_MAX * ((minute + time) / MIN_MAX));
			System.out.println(hour + " " + minute);
		} 
	}	
		sc.close();
	} 
}

