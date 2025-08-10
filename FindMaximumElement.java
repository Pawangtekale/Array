package Array;

public class FindMaximumElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {10,20,30,40};
		//Maxelement(a);
		System.out.println("Maximum Element in Array is: "+Maxelement(a));
		System.out.println("Minumin Element in Array is: "+MinElement(a));
		
		
	}
	public static int Maxelement(int []a)
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max) {
				max=a[i];
			}	
		}		
		return max;
		
	}
	public static int MinElement(int []a) {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min) {
				min=a[i];
			}	
		}		
		return min;
	}
}
