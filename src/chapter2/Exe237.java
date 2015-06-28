package chapter2;

public class Exe237 {
	public static boolean solution(int[] a,int v){
		MergeSort.mergesort(a, 0, a.length-1);
		for(int i=0;i<a.length;i++){
			if(BinarySearch.binarysearch(a, v-a[i], 0, a.length-1)>0){
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] a = {0,1};
		System.out.println(solution(a, 1));
		
	}
}
