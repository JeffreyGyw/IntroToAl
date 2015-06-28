package chapter4;

import java.util.Arrays;

public class MaxSubArray {
	public static int[] maxcrosssub(int[] a,int low,int mid,int high) {
		int leftsum = Integer.MIN_VALUE;
		int sum = 0;
		int maxleft = 0;
		for(int i = mid;i>=low;i--){
			sum += a[i];
			if(sum>leftsum){
				leftsum = sum;
				maxleft = i;
			}
		}
		int rightsum = Integer.MIN_VALUE;
		sum = 0;
		int maxright = 0;
		for(int i = mid+1;i<=high;i++){
			sum += a[i];
			if(sum>rightsum){
				rightsum = sum;
				maxright = i;
			}
		}
		return new int[]{maxleft,maxright,leftsum+rightsum};
	}
	public static int[] maxsubarray(int[] a,int low,int high) {
		if(low==high){
			return new int[]{low,high,a[low]};
		}else{
			int mid = (low+high)/2;
			int[] left = maxsubarray(a, low, mid);
			int[] right = maxsubarray(a, mid+1, high);
			int[] cross = maxcrosssub(a, low, mid, high);
			if(left[2]>=right[2]&&left[2]>=cross[2]){
				return left;
			}else{
				if(right[2]>=left[2]&&right[2]>=cross[2]){
					return right;
				}else{
					return cross;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		System.out.println(Arrays.toString(maxsubarray(a, 0, a.length-1)));
	}
}
