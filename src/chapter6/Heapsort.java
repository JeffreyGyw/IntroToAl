package chapter6;

import java.util.Arrays;

public class Heapsort {
	public static int parent(int i) {
		return (i-1)/2;
	}
	public static int left(int i) {
		return (i+1)*2-1;
	}
	public static int right(int i) {
		return (i+1)*2;
	}
	public static void maxheapify(int[] a, int i) {
		int l = left(i);
		int r = right(i);
		int largest = 0;
		int temp = 0;
		if(l<a.length&&a[l]>a[i]){
			largest = l;
		}else {
			largest = i;
		}
		if(r<a.length&&a[r]>a[largest]){
			largest = r;
		}
		if(largest!=i){
			temp = a[i];
			a[i] = a[largest];
			a[largest] = temp;
			maxheapify(a, largest);
		}
	}
	public static void buildmaxheap(int[] a) {
		for(int i = (a.length-1)/2;i>=0;i--){
			maxheapify(a, i);
		}
	}
	public static void main(String[] args) {
		int[] a = {4,1,3,2,16,9,10,14,8,7};
		buildmaxheap(a);
		System.out.println(Arrays.toString(a));
	}
}
