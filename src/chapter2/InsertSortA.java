package chapter2;

import java.util.Arrays;

public class InsertSortA {
	public static void insertsorta(int[] s){
		int temp = 0;
		for(int j=1;j<s.length;j++){
			temp = s[j];
			int i = j-1;
			while( i>=0 && s[i]>temp){
				s[i+1] = s[i];
				i--;
			}
			s[i+1] = temp;
		}
	}
	public static void main(String[] args){
		int[] s = {2,5,9,3,2,4,1};
		insertsorta(s);
		System.out.println(Arrays.toString(s));
	}
}
