import java.util.*;

public class ZigZag{

    /**
     * check is first number less than second one
     * @param a first number 
     * @param b second number
     * @return 
     */
    private static boolean opposit(int a, int b){
        return a<b;
    }

    /**
     * find the zigzag array
     * @param array number sequence 
     */
    private static void zigZagMethod(int array[]){

        int tempArray [] = new int [array.length];

        tempArray[0] = array[0];
        int index = 1;
        boolean isChechLess = opposit(array[0], array[1]);

        for (int i=0 ;i<array.length-1 ;i++ ) {
            if (isChechLess) {
                if (tempArray[index-1]<array[i+1] ) {
                    tempArray[index] = array[i+1];
                    index++;
                    isChechLess = false;
                }	
            }else{
                if (tempArray[index-1]>array[i+1] ) {
                    tempArray[index] = array[i+1];
                    index++;
                    isChechLess = true;
                }
            }
        }

        /**
         * print the length of sequence
         */
        System.out.println("Count of out put sequance : "+ index);

        /**
         * print the final answer
         */
        System.out.print("Elements of out put sequance : ");
        for (int i=0 ;i<index ;i++ ) {
            System.out.print(tempArray[i]+" ");
        }
    }

    /**
     * main method
     * @param args 
     */
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Elements of sequance : ");
        String numbers [] = input.nextLine().split(" ");// get input as a string line and converto string array splitting by " ".
        int[] array = Arrays.stream(numbers).mapToInt(Integer::parseInt).toArray(); // covert to string array into integer array
        zigZagMethod(array);
    }
}

// 1 17 5 10 13 15 10 5 16 8
