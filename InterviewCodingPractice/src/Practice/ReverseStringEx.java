package Practice;

public class ReverseStringEx {

	public static void main(String[] args) {
		String str1="branchMAster", str2=" ";
		//char[] ch=str1.toCharArray();
		for(int i=str1.length()-1;i>=0;i--)
		{
			str2=str2+str1.charAt(i);
			//System.out.print(ch[i]);
		}
		System.out.println(str2);

	}

}
