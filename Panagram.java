package String;

public class Panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="The quick brown fox jumps over the lazy dog";
		if(panagram(s)) {
			System.out.println("Panagram");
		}
		else
			System.out.println("Its not panagram");

	}
	public static boolean panagram(String s) {
		s=s.toLowerCase();
		int []ar=new int[26];
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(ch>='a'&& ch<='z') {
				ar[s.charAt(i)-97]++;	
			}	
		}
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==0) {
				return false;
			}
		}
		return true;
	}
	

}
