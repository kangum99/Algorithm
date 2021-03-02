package sort;

import java.util.Arrays;
import java.util.Comparator;

//https://programmers.co.kr/learn/courses/30/lessons/42746?language=java

public class Pro_가장큰수 {

	static String solution(int[] numbers) {
		String[] s = new String[numbers.length];
		for(int i = 0; i < numbers.length; i++) {
//			string으로 변환
			s[i] = String.valueOf(numbers[i]);
		}
		Arrays.sort(s, new Comparator<String>() {
//			오버라이드 해서 원하는 기준으로 바꿔줌
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
//				o2->o1이 내림차순
				return (o2+o1).compareTo(o1+o2);
			}
		});
//		0 0 만 들어 있는 경우 는 0 하나만 적어주기 
//		아닌경우 join
		return (s[0].equals("0")? s[0] : String.join("", s));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 6, 10, 2 };
		System.out.println(solution(arr));
	}

}
