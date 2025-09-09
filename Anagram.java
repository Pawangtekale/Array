package String;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="box";
		String s2="box";
		if(anagram(s1, s2)) {
			System.out.println("It is Anagram");
		}
		else
			System.out.println("Its not Anagram");

	}
	public static boolean anagram(String s1,String s2) {
		if(s1.length()==s2.length()) {
			int []ar1=new int[26];
			int []ar2=new int[26];
			
			s1=s1.toLowerCase();
			s2=s2.toLowerCase();
			for (int i = 0,j=s1.length()-1;i<=j;i++,j--) {
				if(i<j) {
					ar1[s1.charAt(i)-97]++;
					ar2[s1.charAt(i)-97]++;
					ar1[s1.charAt(j)-97]++;
					ar2[s1.charAt(j)-97]++;
				}
				else {
					ar1[s1.charAt(i)-97]++;
					ar1[s1.charAt(i)-97]++;
				}
			}
			for(int i=0,j=ar1.length-1;i<j;i++,j--) {
				if(ar1[i]!=ar2[i]||ar1[j]!=ar2[j]) {
					return false;
				}
			}
			return true;
		}
		return false;
	}


}
