package chapter5;

public class Exe52 {
	public static int searchunsorted(int[] a,int x) {
		int[] p = new int[a.length];
		boolean swithoff = true;
		int count = 0;
		int temp = 0;
		while(swithoff){
			 temp = (int)(Math.random()*a.length);
			 if(a[temp]==x){
				 return temp;
			 }else{
				 if(p[temp]!=1){
					 p[temp]=1;
					 count++;
				 }else{
					 if(count==a.length){
						 swithoff = false;
					 }
				 }
			 }
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] s = {1,4,9,2,3,8,10,2,3,7};
		System.out.println(searchunsorted(s, 7));
	}
}
