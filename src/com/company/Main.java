package com.company;
import java.util.Scanner;
import java.util.*;
public class Main {

    static ArrayList<Integer>input = new ArrayList<Integer>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

	/*Get 5 letters from the user
	store it in arraylist
	then sort them
	print it out
	 */
        methodtosort();


    }

    public static void methodtosort(){

        System.out.println("Enter your 5 numbers");
        for(int i =0; i<=5;i++){
            int usersinput = sc.nextInt();
            input.add(usersinput);
        }

        Collections.sort(input);
        for(Integer sorted: input){
            System.out.print(sorted + " ");
        }

    }

}
