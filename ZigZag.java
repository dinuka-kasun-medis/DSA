import java.util.*;

class ZigZag{

	private static void ziGZagMethod(int array[]){

		int tempArray [] = new int [array.length];

		tempArray[0] = array[0];
		int index = 1;
		boolean isChechLess = true;

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

		System.out.println("Count of out put sequance : "+ index);

		System.out.print("Elements of out put sequance : ");

		for (int i=0 ;i<index ;i++ ) {
			System.out.print(tempArray[i]+" ");
		}

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
