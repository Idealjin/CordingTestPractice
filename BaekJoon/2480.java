package com.sangjin.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dice1 = sc.nextInt();
		int dice2 = sc.nextInt();
		int dice3 = sc.nextInt();
		int result = 0;
		int temp = Math.max(dice1, dice2);
		int max = Math.max(temp, dice3);
		
		if(dice1 == dice2 && dice1 == dice3) {
			result = 10000 + (dice1 * 1000);
			System.out.println(result);
		} else if(dice1 == dice2 || dice1 == dice3) {
			result = 1000+ (dice1 * 100);
			System.out.println(result);
		} else if(dice2 == dice3 || dice2 == dice1) {
			result = 1000+ (dice2 * 100);
			System.out.println(result);			
		} else {
			result = max * 100;
			System.out.println(result);
		}
		
	
		sc.close();
	} 
}

