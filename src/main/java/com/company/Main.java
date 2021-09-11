package com.company;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Sean McCormack
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.print("Is the car silent when you turn the key? ");
        String answer = scan.nextLine();
        if(answer.equals("y")){
            System.out.print("Are the battery terminal corroded? ");
            answer = scan.nextLine();
            if(answer.equals("y")){
                System.out.println("Clean terminals and try starting again.");
            }else{
                System.out.println("Replace cables and try again.");
            }
        }else{
            System.out.print("Does the car make a slicking noise? ");
            answer=scan.nextLine();
            if(answer.equals("y")){
                System.out.println("Replace the battery.");
            }else{
                System.out.print("Does the car crank up but fail to start? ");
                answer=scan.nextLine();
                if(answer.equals("y")){
                    System.out.println("Check spark plug connections");
                }else{
                    System.out.print("Does the engine start and then die? ");
                    answer=scan.nextLine();
                    if(answer.equals("y")){
                        System.out.print("Does your car have fuel injection? ");
                        answer=scan.nextLine();
                        if(answer.equals("y")){
                            System.out.println("Get it in for service.");
                        }else{
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                    }else{
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }
    }
}
