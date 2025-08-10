package Array;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {100,90,52,31,3};
		bubbleSort(a);
	}
	public static void bubbleSort(int []a) {
		for(int i=0;i<a.length-1;i++) {
			boolean check=false;
			for (int j = 0; j < a.length-1-i; j++) {
				if (a[j]>a[j+1]) {
					check=true;
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;	
				}
			}
			if (!check) {
				break;
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
