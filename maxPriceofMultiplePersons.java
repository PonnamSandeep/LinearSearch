package sandy;

public class maxPriceofMultiplePersons {

	public static void main(String[] args) {
		int [][] accounts= {
				{1,2,3},
				{3,2,1},
				{9,1,2}
		};
		System.out.println(findMax(accounts));
	}
	
	static int findMax(int [][] accounts) {
		if(accounts.length==0) {
			return -1;
		}
		int max=0;
		for(int persons=0;persons<accounts.length;persons++) {
			int sum=0;
			for(int account=0;account<accounts[persons].length;account++) {
				sum +=accounts[persons][account];
		}
			
			if(sum>max) {
				max=sum;
			}
	}
		return max;

}
}
