package Array;

import java.util.Arrays;
import java.util.Iterator;

public class AddElementAtSpecificIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {10,20,30,40};
		int given=50;
		int index=1;
		int[] result = AddElement(a, given, index);
		System.out.println("Adding Element at Specific Index: "+Arrays.toString(result));
		int[] result1 = removeIndex(a,index);
		System.out.println("Removing Element at Specifice Index: "+Arrays.toString(result1));
		
		//System.out.println(AddElement(a,given,index));
	}
	public static int [] AddElement(int []a, int given,int index) {
		int [] ans= new int [a.length+1];
		for(int i=0;i<ans.length;i++) {
			if(i<index) {
				ans[i]=a[i];
			}
			else if(i==index) {
				ans[i]=given;
			}
			else {
				ans[i]=a[i-1];
			}	
		}
		return ans;
		
	}
	
	public static int[] removeIndex(int []arr,int index) {
		int []ans=new int[arr.length-1];
		for(int i=0;i<arr.length;i++) {
			if(i<index) {
				ans[i]=arr[i];
			}
			else if(i>index) {
				ans[i-1]=arr[i];
			}
		}
		return ans;	
	}

}
