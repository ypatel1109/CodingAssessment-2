package ally_project2;
import java.util.Arrays;
import java.util.Scanner;

public class arrays {
	
    public static int[] searchRange(int[] nums, int target) {//function to search index values.
        int [] result = new int[] {-1,-1}; 
		 for(int i = 0; i < nums.length; i++) {// loop for first index value
			 if(nums[i] == target) {
				 result[0] = i;
				 break;
			 }	 
		 } 
		 for(int i = nums.length-1; i >= 0; i--) {//loop for second index value
			 if(result[0] == -1) {
				 break;
			 }
			 if(nums[i] == target) {
				 result[1] = i;
				 break;
			 }
		 }       
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println("Position of value from sorted array");
		int[] numbers= {3,6,5,5,2,7,8};
		System.out.println(Arrays.toString(numbers));
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter the traget:");
			byte target=scanner.nextByte();
			System.out.println("Traget is:" + target);
			int [] result=searchRange(numbers, target);
			System.out.println("The position for target is" + Arrays.toString(result));
		}
	}

}
