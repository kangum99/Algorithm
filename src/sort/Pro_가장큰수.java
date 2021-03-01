package sort;

import java.util.Arrays;
import java.util.Comparator;

//https://programmers.co.kr/learn/courses/30/lessons/42746?language=java

public class Pro_가장큰수 {

	static String solution(int[] numbers) {
		String[] s = new String[numbers.length];
		for(int i = 0; i < numbers.length; i++) {
			s[i] = String.valueOf(numbers[i]);
		}
		Arrays.sort(s, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
//				o2->o1이 내림차순
				return (o2+o1).compareTo(o1+o2);
			}
		});
		
		return (s[0].equals("0")? s[0] : String.join("", s));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 6, 10, 2 };
		System.out.println(solution(arr));
	}

}
