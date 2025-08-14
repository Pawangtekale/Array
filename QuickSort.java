package Array;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []ar= {100,86,71,54,45,40,3,5,459};
		quickSort(ar, 0, ar.length-1);
		System.out.println(Arrays.toString(ar));

	}
	public static void quickSort(int []ar,int start, int end) {
		if(start<end) {
			int index=partition(ar,start,end);
			quickSort(ar,start,index-1);
			quickSort(ar, index+1, end);
		}
	}
	public static int partition(int []ar,int start,int end) {
		int ref=ar[start];
		int i=start, j=end;
		while(i<j) {
			while(i<=end && ar[i]<=ref) {
				i++;
			}
			while(j>start && ar[j]>=ref) {
				j--;
			}
			if(i<j) {
				int temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
			else {
				break;
			}
		}
		int temp=ar[start];
		ar[start]=ar[j];
		ar[j]=temp;
		return j;
	}

}
