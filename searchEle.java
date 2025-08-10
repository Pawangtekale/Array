package Array;

public class searchEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {10,20,30,40,50,30};
		int []b= {1,2,3};
		//checkEle(arr,50);
		//System.out.println("Element Present Position at: "+checkEle(arr,40));
		//System.out.println("Count Of Element :"+countOfEle(arr,30));
		margeTwoArray(arr,b);		
	}
	/*public static int checkEle(int []arr, int findEle) {
		for(int i=0;i<arr.length;i++) {
			if (findEle==arr[i]) {
				
				return i;
			}
			
		}
		return -1;
	}*/
	/*public static int countOfEle(int []arr, int num) { 
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(num==arr[i]) {
				count++;
				
			}		
		}
		return count;	
	}*/
	public static void margeTwoArray(int []a,int []b) {
		int[] c = new int[a.length + b.length];
		for(int i=0;i<c.length;i++) {
			if(i<a.length) {
				c[i]=a[i];	
			}
			else {
				c[i]=b[i-a.length];
			}
			
		}
		for (int num : c) {
	        System.out.print(num + " ");
	    }
		
	}
 
}
