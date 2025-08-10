package Array;

public class binarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {50,70,60,20,30,40};
		int search=30;
		BubbleSort.bubbleSort(a);
		binarySearch(a, search);

	}
	public static void binarySearch(int []a,int search) {
		int start=0,end=a.length-1, mid=(start+end)/2;
		while(start<=end) {
			if (a[mid]==search) {
				System.out.println("Element found at: "+mid+" index");
				break;
			}
			else if (search>a[mid]) {
				start=mid+1;
			}
			else if (search<a[mid]) {
				end=mid-1;
			}
			mid=(start+end)/2;
			
		}
		if (end<start) {
			System.out.println("Element not Found");
		}
	}

}
