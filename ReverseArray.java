package Array;

import java.util.Arrays;


public class ReverseArray {
	public static void main(String[] args) {
		int [] ar= {1,2,3,4,5};
		int [] rev=new int [ar.length];
		for (int i=ar.length-1;i>=0;i--) {
			
			rev[ar.length-1-i]=ar[i];
			
		}
		System.out.println(Arrays.toString(rev));
	}

}
