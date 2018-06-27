package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

class DinnerGame{
	private static void dinnerGame(int array[]){

            int tempArray[]=new int[array.length];//temporary array
            ArrayList<Integer> answerArray=new ArrayList<>();//this will stor final answer
            int mainArray[]=array;//get the sending array

            /**
             * assign 1 to all elements in the temporary array
             */
            for (int i=0;i<tempArray.length ;i++ ) {
                tempArray[i]=1;
            }

            /**
             * find the longest increasing sub seaquence length
             */
            for (int i=1 ;i<array.length ;i++ ) {
                for (int j=0;j<i ;j++ ) {
                    if (array[j]<array[i]) {
                        if (tempArray[j]+1>tempArray[i]) {
                            tempArray[i] = tempArray[i] + 1;
                        }
                    }
                }
            }

            /**
             * sort the temporary array and do the same changes to main array
             */
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
            
            /**
             * pick the longest increasing subsequence
             * 
             */
            int number=tempArray[array.length-1];
            answerArray.add(mainArray[array.length-1]);
            for (int i = array.length-2; i >=0; i--) {
                int number2=tempArray[i];
                if (number>number2) {
                    answerArray.add(mainArray[i]);
                }
                number=tempArray[i];
            }
            
            Collections.reverse(answerArray);
            System.out.println("Output increasing sequence : "+answerArray);
            
	}
	
        /**
         * Main method
         * @param args 
         */
	public static void main(String args[]){
            Scanner input = new Scanner(System.in);
            Random random = new Random();
            System.out.print("Input number of invitations : ");//
            int noOfInvitations = input.nextInt();//get the no of invitations
            int noCardArray [] = new int[noOfInvitations];
            for (int i = 0; i < noOfInvitations; i++) {//generat no to all invitations
                noCardArray[i] = random.nextInt(noOfInvitations+1);//make random numers from 1 to no of invitations
            }
            
            System.out.println("Obtained sequence :"+Arrays.toString(noCardArray));// print the generated random number list
            dinnerGame(noCardArray);// send generated random mumber list to make calculations
            
	}
}
