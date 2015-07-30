package chapter7;

import java.util.Arrays;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;

public class Quicksort {
	
	public static int partition(int[] a,int s,int e) {
		int x = a[e];
		int i = s-1;
		for(int j = s;j<e;j++){
			if(a[j]<=x){
				i++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		int temp = a[i+1];
		a[i+1] = a[e];
		a[e] = temp;
		return i+1;
	}
	public static void quicksort(int[] a,int s,int e) {
		if(s<e){
			int m = partition(a, s, e);
			quicksort(a, s, m-1);
			quicksort(a, m+1, e);
		}
	}
	public static void main(String[] args) {
		int[] a = {1,11,3,4,2,8,5};
		quicksort(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));
	}
}
