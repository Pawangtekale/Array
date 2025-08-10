package Array;

public class FindSecondMinElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {16,32,48,64,80,96};
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		System.out.println("Max= " +min);
		System.out.println("Min= "+max);
	    System.out.println("Second Maximum element is : "+findSecondMax(a));
	    System.out.println("Second Minumen Element is: "+findSecondMin(a));
	}
	public static int findSecondMax(int []a) {
		int max=Integer.MIN_VALUE;
		int secondMax=Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max) {
				secondMax=max;
				max=a[i];
			}
			else if(a[i]>secondMax && a[i]!=max) {
				secondMax=a[i];
			}
		}
		return secondMax;
	}
	public static int findSecondMin(int []a) {
		int min=Integer.MAX_VALUE;
		int secondMin=Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if(a[i]<min) {
				secondMin=min;
				min=a[i];
			}
			else if(a[i]<secondMin && a[i]!=min) {
				secondMin=a[i];
			}
		}
		return secondMin;
	}
	

}
