package controlexercise;

import java.util.Scanner;

public class Flight_Ticket {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		boolean [] plane = new boolean [10];
		int economy = 5;
		int firstClass =0;
				int Yes = 0;
		        for(int counter = 1; counter <= 10; counter++) {
					System.out.println("Press code (1 = first class: , 2 = Economy)");
					int chat = input.nextInt();
					if(chat > 2 || chat < 1) {
						System.out.println("Enter 1 or 2");
					}
				    if(chat == 1 || chat == 2)
						if(chat ==1) {
						           plane[firstClass] = true;
						            firstClass++;
						System.out.printf(" FirstClass seat number is: %d%n", ( firstClass));
						}
						else if(firstClass == 4) {
							System.out.println("First Class filled up,Economy:Available:YES||NO");
							if(chat != Yes)
								System.out.println("Next flight leaves in 3 hours time");
					 }
						else if(chat == 2) {
							plane[economy] = true;
							       economy++;
							System.out.printf("Economy Class seat number is: %d%n",( economy));
						}
						}	
			}
		}