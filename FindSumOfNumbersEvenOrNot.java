package sandy;
public class FindSumOfNumbersEvenOrNot {
	
	public static void main(String[] args) {
		int[] nums= {11,234,2345,1,23};
		System.out.println(findNumbers(nums));
	}
	
	static int findNumbers(int[] nums) {
		int count=0;
		for(int num:nums) {
		if(even(num)) {
			count++;
		}
   	}
		return count;
	}
//validate whether even or not
	static boolean even(int num) {
		int numberOfDigits=digits(num);
		return numberOfDigits%2==0;
	}
// check the length of the numbers
	static int digits(int num) {
		int count=0;
		while(num>0) {
			count++;
			num=num/10;
		}
		return count;
	}
}

