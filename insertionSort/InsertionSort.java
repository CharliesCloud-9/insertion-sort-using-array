package insertionSort;


public class InsertionSort {
	
	public int[] insertionSort (int[] list) {          //accept int array called list. return int array. Input data.
		int i, j, key, temp;          						//variables:outer loop i, inner loop j, key value, temp to make the swaps with.
		for (i = 1; i < list.length; i++) { 		   //i starts at index 1 because 1st comparison will be to i’s left, index 0.
			key = list[i]; 									//initialize key to list[i]. 
			j = i - 1;   									//initialize j to i-1. j will count down from i-1 (end of list) to 0 (beginning of list). Element to i’s left
			while (j >= 0 && key < list[j]) { 		   //use while loop to iterate through the list of items to i’s left. Exit while loop when j reaches 0/ the end of the list. Only get that when key is smallest element in the list, it’ll get all the way to j=0. Or when key value reaches an element that its no longer smaller than. As long as key is less than list[j] , we’ll keep on SWAPPING.
				temp = list[j];  							//inside while loop all we are doing is swapping the elements. As long as key is less than list[j], and j yet hasn’t reach the end of the list, than we’ll swap the elements. 
				list[j] = list[j + 1];
				list[j + 1] = temp;
				j--;    									//and we decrement j, which is moving left one more item.
			}
		}
		return list;  								   //return same list, but in sorted order.
	}
		

	
	public static void main(String[] args) {
		int[] list= {4,3,6,1,9,2,5,23,19,100,99 };
		InsertionSort isObj = new InsertionSort();
		isObj.insertionSort(list);
		for (int i = 0; i < list.length; i++) {
		System.out.println(list[i]);
			
		}
			
	}

}
