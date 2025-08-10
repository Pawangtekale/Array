package Array;

public class SearchElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {10,20,30,40,50};
		int search=50;
		for(int i=0;i<arr.length;i++) {
			if (search==arr[i]) {
				System.out.println("It Present");
				break;
			}	
		}
	}
}
