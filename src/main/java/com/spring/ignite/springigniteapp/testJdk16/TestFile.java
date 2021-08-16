package com.spring.ignite.springigniteapp.testJdk16;

public class TestFile {

	void sort(int arr[]) {
		int n = arr.length;
		int temp;
		for (int i = 0; i < n; ++i) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String args[]) {
		int arr[] = { 12, 11, 13, 7, 6 };
		TestFile ob = new TestFile();
		ob.sort(arr);
		for (int i : arr)
			System.out.println(i + " ");
	}
}