package chapter4;

import java.util.Arrays;

public class MaxSubArrayForce {
	public static int maxsubarray(int[] a) {
		int[] sum = new int[a.length+1];
		sum[0] = 0;
		for (int i = 1; i <= a.length; i++) {
			sum[i] = sum[i-1]+a[i-1];
		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j <a.length; j++) {
				if(sum[j+1]-sum[i]>max){
					max = sum[j+1]-sum[i];
				}
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int[] a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		System.out.println(maxsubarray(a));
	}
}
