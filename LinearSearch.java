package sandy;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr= {11,12,34,67,31};
		int target=67;
		System.out.println(linearSearch(arr,target));
	}
	static int linearSearch(int[] arr, int target) {
		if (arr.length==0) {
			return -1;
		}
		for(int index=0;index<arr.length;index++) {
			//check for element at every index if it is = target
			int element =arr[index];
			if(element==target) {
				return index;
			}
		}
		return -1;
		
	}
		}

