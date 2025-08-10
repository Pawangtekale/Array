package Array;

import java.util.Arrays;

public class MargeReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {10,20,30};
		int []b= {11,22,33};
		reverseArray(a,b);
		System.out.println("End Execution");
	}
	public static void reverseArray(int []a,int []b) {
		int []c = new int [a.length+b.length];
		int []rev= new int [c.length];
		/*for(int i=a.length-1;i>=0;i--){
			c[a.length-1-i]=a[i];	
		}
		for(int i=a.length-1;i>=0;i--){
			c[b.length-1-i]=b[i];	
		}
		*/
		for(int i=0;i<c.length;i++) {
			if(i<a.length) {
				c[i]=a[i];	
			}
			else {
				c[i]=b[i-a.length];
			}
			
		}
        for (int i=c.length-1;i>=0;i--) {
			
			rev[c.length-1-i]=c[i];
			
		}
//		for (int num : c) {
//	        System.out.print(num + " ");
//	    }
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(rev));
	}

}
