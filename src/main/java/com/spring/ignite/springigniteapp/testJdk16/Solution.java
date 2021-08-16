package com.spring.ignite.springigniteapp.testJdk16;

public class Solution {

	public int solution(String S, int[] C) {
	    int index = S.indexOf('c');
        int value = C[index];
	    String s = S.replace("c", "");
		return value;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] numbers = {2,4,3,5,6};
		String value = "abcde";
		System.out.print(sol.solution(value, numbers));
	}
}

