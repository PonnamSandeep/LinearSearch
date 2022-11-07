package sandy;

public class MinOfArray {
	public static void main(String[] args) {
		int [] arr= {23,34,32,1,12,3,5};
		System.out.println(min(arr));
	}
	
	static int min(int[] arr){
		if(arr.length==0) {
			return -1;
		}
		int ans = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<ans) {
				ans=arr[i];
			}
			
		}
		return ans;
		
	}

}
