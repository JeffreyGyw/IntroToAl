package chapter2;

import java.util.Arrays;

public class BinarySearch {
	public static int binarysearch(int[] a,int v,int s,int t) {
		if(s>=t&&v!=a[s]){
			return -1;
		}
		int j= (t+s)/2;
		if(v==a[j]){
			return j;
		}else{
			if(v<a[j]){
				return binarysearch(a, v, s, j);
			}else{
				return binarysearch(a, v, j+1, t);
			}
		}
	}
	public static void main(String[] args){
		int[] a = {0,1,35,23,5,6,6,7,2};
		MergeSort.mergesort(a, 0, a.length-1);
		System.out.println(binarysearch(a, 0, 0, a.length-1));
		Arrays.binarySearch(a, 1);
	}
}
