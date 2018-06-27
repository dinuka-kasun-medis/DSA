/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DinukaMedis
 */

class LIS{
	private static void longestIncreasingSubSeaquence(int array[]){

            int tempArray[]=new int[array.length];
            ArrayList<Integer> answerArray=new ArrayList<>();
            //int answerArray[]=new int[array.length];
            int mainArray[]=array;

            for (int i=0;i<tempArray.length ;i++ ) {
                tempArray[i]=1;
            }

            for (int i=1 ;i<array.length ;i++ ) {
                for (int j=0;j<i ;j++ ) {
                    if (array[j]<array[i]) {
                        if (tempArray[j]+1>tempArray[i]) {
                            tempArray[i] = tempArray[i] + 1;
                        }
                    }
                }
            }

            int maxValue=1;
            for (int number : tempArray) {
                if (number>maxValue) {
                    maxValue = number;
                }
            }
            
//            System.out.println("tempArray 1 :"+Arrays.toString(tempArray));
            
            for (int i = 0; i < array.length-1; i++) {
                for (int j = i+1; j <  array.length-1; j++) {
                    if (tempArray[i]>tempArray[j]) {
                        int tem = tempArray[j];
                        tempArray[i]=tempArray[j];
                        tempArray[j]=tem;
                        int tem2 = mainArray[j];
                        mainArray[i]=mainArray[j];
                        mainArray[j]=tem2;                        
                    }else{
                        
                    }
                }
            }
            
            
            int number=tempArray[array.length-1];
            answerArray.add(mainArray[array.length-1]);
            for (int i = array.length-2; i >=0; i--) {
                int number2=tempArray[i];
                if (number>number2) {
                    answerArray.add(mainArray[i]);
                }
                number=tempArray[i];
            }
            System.out.println("tempArray :"+Arrays.toString(tempArray));
            System.out.println(answerArray);
                


	}
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		System.out.print("Input number of invitations : ");

		System.out.println("\n========================================");

		int lo[]={1,5,2,4,8,6};
		longestIncreasingSubSeaquence(lo);

		System.out.println("\n========================================");

		int lol[]={1,3,2};
		longestIncreasingSubSeaquence(lol);

		System.out.println("\n========================================");

		int lols[]={3,4,-1,5,8,2,3,12,7,9,10};
		longestIncreasingSubSeaquence(lols);
	}
}
