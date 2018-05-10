package dudek;

import java.util.Scanner;

public class Application {
	public static int[][] getCases() {
		Scanner in = new Scanner(System.in);
		System.out.println("Define number of test cases:");
		int c = in.nextInt();
		int[][] cases = new int[c][];
		for (int i = 0; i < c; i++) {
			System.out.println("Define elements number for case nr " + (i + 1) + " :");
			int el = in.nextInt();
			cases[i] = new int[el];
			for (int j = 0; j < cases[i].length; j++) {
				System.out.println("Add element:");
				cases[i][j] = in.nextInt();
			}
		}
		return cases;
	}

	public static void finder(int[][] arr) {
		int left = 0;
		int right = 0;
		boolean bool = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr[i].length - 1; j++) {
				for (int k = j - 1; k >= 0; k--) {
					left += arr[i][k];
				}
				for (int k = j + 1; k < arr[i].length; k++) {
					right += arr[i][k];
				}
				bool = (left==right) ? true:false;
				left = 0;
				right = 0;
			}
			System.out.println((bool == true) ? "YES" : "NO");
		}

	}

	public static void main(String[] args) {
		int[][] arr = getCases();
		finder(arr);
	}

}
