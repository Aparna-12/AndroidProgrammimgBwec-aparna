public class isEveryWhereTest{
public static boolean isEveryWhere(int[] a,int val)
{
		for(int i=0;i<a.length;i++){
			if((a[i]!=val) && (i>0 ? (a[i-1]!=val):true) && (i<a.length ? (a[i+1]!=val):true))
				{
						return false;
				}
			}
			return true;
}
	public static void main(String[] args){
		int a[]={1,2,1,3};
		System.out.println(isEveryWhere(a,1));
	}
}

			
