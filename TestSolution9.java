class Solution9 {
	public int countTriple(String s) {
		StringBuilder sb = new StringBuilder(s);
		int count = 3;
		if(sb.length() == 3)
			return count;
		else if(sb.length() == 1)
			return 0;
		for(int i=1; i<sb.lenth(); i++)
		{
			
			if(sb.charAt(i) == sb.charAt(3)) {
				count;
			}
			else if(sb.charAt(i) != sb.charAt(3)){
				count = 0;
			}
		}
		return count; 	 
	}
}
public class TestSolution9{
		public static void main(String args[])
		{
			Solution9 s1=new Solution9();
			System.out.println(s1.countTriple("xxx"));
		}
}

