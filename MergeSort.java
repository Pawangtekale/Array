package Array;
import java.util.Arrays;
public class MergeSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int []a= {11,22,33,44};
		//int []b= {12,24,36,48,60};
		 //int[] a2 = {2,4,6,8,10,3,5,7,9,11};
	   int []pass= {10,20,30,40,50,1,9,10,30,50};
		//int []ans =mergeSort(a,b);
		//System.out.println(mergeSort(a, b));
		//System.out.println(Arrays.toString(a,b));
		//System.out.println(Arrays.toString(ans));
		
		int []ans =OneArraymergeSort(pass);
		System.out.println(Arrays.toString(ans));
	}
	public static int[] mergeSort(int []a,int []b) {
		int []ans=new int[a.length+b.length];
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length) {
			if(a[i]>b[j]) {
				ans[k++]=b[j++];
			}
			else if (a[i]<=b[j]) {
				ans[k++]=a[i++];	
			}
		}
		while(i<a.length) {
			ans[k++]=a[i++];
		}
		while(j<b.length) {
			ans[k++]=b[j++];
		}
		return ans;	
	}
	public static int [] mergeSortOneArray(int []a) {
	  int []ans=new int[a.length]; 
	  int start1=0, start2=(start1+a.length)/2,k=0; 
		for(int i=0;i<(a.length)/2;i++) {
			for(int j=start2;j<a.length;j++) {
				if(a[i]>a[j]) {
					ans[k++]=a[start2++];
				}
				else if(a[i]<=a[j]) {
					ans[k++]=a[i++];
				}
			}
		}
		//System.out.println();
		return ans;
	}
	//*************************************************************
	public static int[] OneArraymergeSort(int[] a) {
	    int[] ans = new int[a.length];
	    int mid = a.length / 2;

	    int i = 0;        // pointer for first half
	    int j = mid;      // pointer for second half
	    int k = 0;        // pointer for ans array

	    // Merge until one half is exhausted
	    while (i < mid && j < a.length) {
	        if (a[i] <= a[j]) {
	            ans[k++] = a[i++];
	        } else if (a[i]>a[j]) {
	            ans[k++] = a[j++];
	        }
	    }

	    // Copy remaining elements from first half
	    while (i < mid) {
	        ans[k++] = a[i++];
	    }

	    // Copy remaining elements from second half
	    while (j < a.length) {
	        ans[k++] = a[j++];
	    }

	    return ans;
	}

}
