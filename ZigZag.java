/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DinukaMedis
 */
public class ZidZag {
    
    private static boolean opposit(int a, int b){
        return a<b;
    }
    
    private static void ziGZagMethod(int array[]){

        int tempArray [] = new int [array.length];
        ArrayList<String> aditionalArray = new ArrayList<>();

        tempArray[0] = array[0];
        int index = 1;
        boolean isChechLess = opposit(array[0], array[1]);

        for (int i=0 ;i<array.length-1 ;i++ ) {
            if (isChechLess) {
                if (tempArray[index-1]<array[i+1] ) {
                    tempArray[index] = array[i+1];
                    index++;
                    isChechLess = false;
                }else{
                    aditionalArray.add(index+","+array[i+1]);
                }	
            }else{
                if (tempArray[index-1]>array[i+1] ) {
                    tempArray[index] = array[i+1];
                    index++;
                    isChechLess = true;
                }else{
                    aditionalArray.add(index+","+array[i+1]);
                }
            }
        }

        System.out.println("Count of out put sequance : "+ index);
        
        System.out.println("Additional array : "+ aditionalArray);
        
        System.out.println("temp array : "+ Arrays.toString(tempArray));
        
        for (String string : aditionalArray) {
            int index_new=Integer.parseInt(string.split(",")[0]);
            int value=Integer.parseInt(string.split(",")[1]);
            System.out.print("Elements of out put sequance : ");
            for (int i=0 ;i<index ;i++ ) {
                if (i==index_new) {
                    System.out.print(value+" ");
                }
                System.out.print(tempArray[i]+" ");
            }
            System.out.println("");
        }
/*
        System.out.print("Elements of out put sequance : ");

        for (int i=0 ;i<index ;i++ ) {
            System.out.print(tempArray[i]+" ");
            
        }*/
        //System.out.println("tempArray : "+Arrays.toString(tempArray));

    }

	private static int[] deleteElement(int array[] ,int elementPosition){
            int tempArray [] = array;
            int returnArray [] = new int[array.length-1];
            for (int i=0 ;i< array.length - elementPosition-1 ;i++ ) {
                returnArray[i] = tempArray[i];
            }
            for (int i = elementPosition; i< returnArray.length ; i++ ) {
                returnArray[i] = tempArray[i+1];
            }
            return returnArray;
	}

	public static void main(String args[]){
            Scanner input = new Scanner(System.in);
            System.out.print("Elements of sequance : ");
            String numbers [] = input.nextLine().split(" ");
            int[] array = Arrays.stream(numbers).mapToInt(Integer::parseInt).toArray();
            //int array [] ={10, 22, 9, 33, 49, 50, 31, 60};
            ziGZagMethod(array);
	}
}
//1,17,5,10,13,15,10,5,16,8
//1 17 5 10 13 15 10 5 16 8
