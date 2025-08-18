import java.util.Arrays;
class SegerateAraay 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		int []ar={12,23,-35,78,-4,-3,6,-8,7};
		segerate(ar);
		System.out.println(Arrays.toString(ar));
	}
	public static void segerate(int []ar){
		int i=0,j=ar.length-1;
		while(i<j){
			while(ar[i]<0){
				i++;
			}
			while(ar[j]>=0){
				j--;
			}
			if(i<j){
				int temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
		}
		// Print Segerate Array using loop
		/*for (int k=0;k<ar.length-1 ;k++ )
		{
			System.out.print(ar[k]+",");
		}*/
	}
}
