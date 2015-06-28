package chapter2;

public class BinarySearch {
	public static int binarysearch(int[] a,int v,int s,int t) {
		if(s>=(t-1)&&v!=a[s]){
			return -1;
		}
		int j= (t+s)/2;
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
		int[] a = {1,2,3,4,5,6,7};
		System.out.println(binarysearch(a, 3, 0, a.length-1));
	}
}
