import java.util.Arrays;

public class DivideAndConqure2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []ar= {100,86,71,68,54,45,40,38,20,15,9,5,0};
		mergeSort(ar,0, ar.length-1);
		System.out.println(Arrays.toString(ar));
	}
	public static void mergeSort(int []a,int start,int end) {
		if(start<end) {
			int mid=(start+end)/2;
			mergeSort(a,start,mid);
			mergeSort(a,mid+1,end);
			merge(a,start,mid,end);
		}
	}
	public static void merge(int[] a,int start,int mid,int end) {
	    int[] ans = new int[a.length];
	    //int mid1 = a.length / 2;

	    int i = start;        // pointer for first half
	    int j = mid+1;      // pointer for second half
	    int k = start;        // pointer for ans array

	    // Merge until one half is exhausted
	    while (i <= mid && j <=end ) {
	        if (a[i]>a[j]) {
	            ans[k++] = a[j++];
	        } else if (a[i]<=a[j]) {
	            ans[k++] = a[i++];
	        }
	    }

	    // Copy remaining elements from first half
	    while (i <= mid) {
	        ans[k++] = a[i++];
	    }

	    // Copy remaining elements from second half
	    while (j <=end) {
	        ans[k++] = a[j++];
	    }
		for(int k2=start;k2<=end;k2++) {
	    	a[k2]=ans[k2];

	}

}
}
