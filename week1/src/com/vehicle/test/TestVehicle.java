package com.vehicle.test;

import com.vehicle.*;

import java.util.*;

public class TestVehicle {

	public static void main(String[] args) throws IncorrectInputException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		boolean flag1 = true;
		boolean flag2 = true;
		boolean flag3 = true;
		boolean flag4 = true;
		boolean pow = false;
		String eng = null;
		int vno = 0;
		int gear = 0;
		System.out.println("Please enter the vehicle number:");
		while(flag1 == true){
			if(sc.hasNextInt()){
				int temp = sc.nextInt();
				if(temp > 0){
					vno = temp;
					flag1 = false;
				} else{
					System.out.println("Please enter a positive integer");
					sc.nextLine();
				}
			} else{
				System.out.println("Please enter a valid vehicle number");
				sc.next();
			}
		}
//		int vno = sc.nextInt();
		sc.nextLine();
		System.out.println("Please enter the engine status");
		while(flag4 == true){
//			System.out.println("Please enter on or off");
			String str = sc.nextLine();
			if(   (str.equalsIgnoreCase("Off") || str.equalsIgnoreCase("On"))  == true){
				flag4 = false;
				eng = str;
			} else{
				System.out.println("Please enter on or off");
			}
		}
		
//		String eng = sc.nextLine();
		System.out.println("Please enter the Current Gear:");
//		int gear = sc.nextInt();
		while(flag2 == true){
			if(sc.hasNextInt()){
				int temp1 = sc.nextInt();
				if(temp1 >= 0 && temp1 <=6){
					gear = temp1;
					flag2 = false;
				} else{
					System.out.println("Please enter a positive integer");
					sc.nextLine();
				}
			} else{
				System.out.println("Please enter a valid gear");
				sc.next();
			}
		}
		sc.nextLine();
		System.out.println("Please enter True or False if the car has power steering: ");
		while(flag3 == true){
			if(sc.hasNextBoolean()){
				boolean temp2 = sc.nextBoolean();
				if(temp2 == false || temp2 == true){
					pow = temp2;
					flag3 = false;
				} else{
					System.out.println("Please enter true or false");
					sc.nextLine();
				}
			} else{
				System.out.println("Please enter a power steering");
				sc.next();
			}
		}
//		boolean pow = sc.nextBoolean();
		sc.nextLine();
		System.out.println("Please enter the fuel Type: ");
		String fuel = sc.nextLine();
		Vehicle v = new Car(vno, eng, gear, pow, fuel);
		Car c = (Car) v;
		c.showCarDetails();
		
	}

}
