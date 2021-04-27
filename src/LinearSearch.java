
public class LinearSearch {

	public static void main(String[] args) {
		
		int[] nums = {2, 5, 1, -2, 7, 9};
		
		//Demonstrate Linear Search
		linearSearch(nums, 7);
		
		//Demonstrate finding the minimum value
		int min = getMinValue(nums);
		System.out.println("The minimum value in the array is: " + min);

	}
	
	//Pre: list is not empty
	//Post: displays item and location if found, or a message indicating not found
	static void linearSearch(int[] list, int toFind) {
		boolean isFound = false;
		for(int i = 0; i < list.length; i++) {
			if(list[i] == toFind) {
				//Search is successful
				isFound = true;
				System.out.println(toFind + " found at position " + i);
			}
		}
		
		if(!isFound) {
			System.out.println("Item was not found");
		}
	}
	
	//Pre: list is not empty
	//Post: returns the smallest value in the list
	static int getMinValue(int[] list) {
		int minValue = Integer.MAX_VALUE;
		
		for(int i = 0; i < list.length; i++) {
			if(list[i] < minValue) {
				minValue = list[i];
			}
		}
		
		return minValue;
	}

}
