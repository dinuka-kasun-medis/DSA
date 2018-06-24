import java.util.*;
class LIS{
	public static void longestIncreasingSubSeaquence(int nums[]){
	
		int answerArray[]=new int[nums.length];
		int tempArray[]=new int[nums.length];
		for (int i=0;i<tempArray.length ;i++ ) {
			tempArray[i]=1;
		}

		for (int i=1 ;i<nums.length ;i++ ) {
			for (int j=0;j<i ;j++ ) {
				if (nums[j]<nums[i]) {
					if (tempArray[j]+1>tempArray[i]) {
						tempArray[i] = tempArray[i] + 1;
						answerArray[i] = j;
					}
				}
			}
		}

		int maxValue=1;
		int maxIndex=0,k=0;
		for (int number : tempArray) {
			if (number>maxValue) {
				maxValue = number;
				maxIndex = k;
				k++;
			}
		}

		int a = 0;
		for (int i=0 ;i<nums.length - 1 ;i++ ) {
			if (tempArray[i]==tempArray[i+1]) {
				answerArray[a]=nums[i+1];
			}else if (tempArray[i]<tempArray[i+1]) {
				answerArray[a]=nums[i];
				a++;
			}else{
				answerArray[a]=nums[i];
				a++;
			}
		}

		System.out.println("tempArray : "+Arrays.toString(tempArray));
		System.out.println("answerArray : "+Arrays.toString(answerArray));

		System.out.print("Final Answer : ");
		for (int i=0 ;i < maxValue ;i++ ) {
			System.out.print(answerArray[i] + ", ");
		}
		
	}

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		System.out.print("Input number of invitations : ");
		int noOfInvitations=input.nextInt();
		int[] array = new int[noOfInvitations];
		for (int i=0 ;i<noOfInvitations ;i++ ) {
			array[i] = random.nextInt(noOfInvitations+1);
		}
		System.out.println(Arrays.toString(array));
		
		longestIncreasingSubSeaquence(array);
		
		System.out.println("\n========================================");

		int lo[]={1,5,2,4,8,6};
		longestIncreasingSubSeaquence(lo);

		System.out.println("\n========================================");

		int lol[]={1,3,2};
		longestIncreasingSubSeaquence(lol);
	}
}
