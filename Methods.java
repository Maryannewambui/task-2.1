package com.mycompany.java_methods;
import java.util.Scanner;
public class Methods {
    //creating a main method
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        //enter first number
        System.out.println("Enter the first number:");
        int first =input.nextInt();
        
        //enter second  number
        System.out.println("Enter the second number:");
        int second =input.nextInt();
        
        //enter third number
        System.out.println("Enter the third number:");
        int third =input.nextInt();
        
        int largest = largest(first, second, third);
     int smallest = smallest(first, second, third);
     
     System.out.printf("largest of the three numbers %d, %d, and %d is :%d %n", first, second, third, largest);
     System.out.printf("smallest of the three numbers %d, %d, and %d is :%d %n", first, second, third, smallest);
        
    }
    
        //java method to calculate largest of the three
    public static int largest(int first, int second,int third){
        int max = first;
        if(second > max){
            max = second;
        }
        
        if(third > max){
            
            max = third;
            
        }
        
        return max;
        
    }
    
    
   
    //java method to calculate smallest of the three
   
    public static int smallest(int first, int second,int third){
        int min = first;
        if(second < min){
            min = second;
        }
        
        if(third < min){
            
            min = third;
            
        }
        
        return min;
        
    }

}
