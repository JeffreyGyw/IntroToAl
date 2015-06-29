package chapter4;

public class Exe415 {
	public static int maxsubarray(int[] a){
		int sum = 0;
		int maxsum = Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++){
			if(sum>=0){
				sum += a[i];
			}else{
				sum = a[i];
			}
			if(sum>maxsum){
				maxsum = sum;
			}
		}
		return maxsum;
	}
	public static void main(String[] args) {
		int[] a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		System.out.println(maxsubarray(a));
	}
}