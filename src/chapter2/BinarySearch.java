package chapter2;

public class BinarySearch {
	public static int binarysearch(int[] a,int v,int s,int t) {
		if(s>=t&&v!=a[s]){
			return -1;
		}
		int j= (t+s+1)/2;
		if(v==a[j]){
			return j;
		}else{
			if(v<a[j]){
				return binarysearch(a, v, s, j);
			}else{
				return binarysearch(a, v, j, t);
			}
		}
	}
	public static void main(String[] args){
		int[] a = {0,1};
		System.out.println(binarysearch(a, 1, 0, a.length-1));
	}
}
