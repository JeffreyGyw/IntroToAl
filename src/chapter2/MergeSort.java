package chapter2;

import java.util.Arrays;

public class MergeSort {
	public static void merge(int[] a,int p,int q,int r){
		int n1 = q-p+1;
		int n2 = r-q;
		int[] le = new int[n1+1];
		int[] re = new int[n2+1];
		for(int i = 0;i<n1;i++){
			le[i] = a[p+i];
		}
		le[n1] = Integer.MAX_VALUE;
		for(int i = 0;i<n2;i++){
			re[i] = a[q+i+1];
		}
		re[n2] = Integer.MAX_VALUE;
		int i=0;
		int j=0;
		for(int k=p;k<=r;k++){
			if(le[i]<=re[j]){
				a[k]=le[i];
				i++;
			}else{
				a[k]=re[j];
				j++;
			}
		}
	}
	public static void mergesort(int[] a,int p,int r){
		if(p<r){
			int q=(p+r)/2;
			mergesort(a,p,q);
			mergesort(a,q+1,r);
			merge(a,p,q,r);
		}
	}
	public static void main(String[] args){
		int[] s = {1,4,9,2,3,8,10,2,3};
		mergesort(s,0,s.length-1);
		System.out.println(Arrays.toString(s));
	}
}
