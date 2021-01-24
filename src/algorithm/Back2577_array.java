package algorithm;

//import java.util.Arrays;
import java.util.Scanner;
//import java.util.stream.Stream;

public class Back2577_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		// 배열 선언시 0으로 초기화 된다.
		int cnt[] = new int[10];
		int result = 1;

		int numA = scan.nextInt();
		int numB = scan.nextInt();
		int numC = scan.nextInt();
		scan.close();
		result = numA * numB * numC;

		while (result > 0) {

			cnt[result % 10]++;
			result /= 10;
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(cnt[i]);
		}
		/*
		 * //숫자를 int 배열로 나누기 int digit[] =
		 * Stream.of(String.valueOf(result).split("")).mapToInt(Integer::parseInt).
		 * toArray();
		 * 
		 * for (int i = 0 ; i < digit.length; i++) { cnt[digit[i]] ++; } for (int i = 0;
		 * i < 10; i ++) { System.out.println(cnt[i]); }
		 */

	}

}
