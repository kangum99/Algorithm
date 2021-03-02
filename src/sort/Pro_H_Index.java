package sort;

import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/42747?language=java

public class Pro_H_Index {
	
	static int solution(int[] citations) {
        int max = -1;
        Arrays.sort(citations);
        for(int i = 0; i < citations.length; i++) {
//        	h번 이상 인용된 논문이 h편 이상일때
        	if(citations[i] <= citations.length-i) {
//        		나머지 논문이 h번 이하일때
        		if(i <= citations[i]) {
        			max = Math.max(max, citations[i]);
        		}
        	}else 
//        		h번 이상 인용된 논문이 h편 보다 적지만 
//        		남은 논문의 개수가 max값보다 작을때->[0, 1, 4, 5, 6] ->3
        		return (citations.length-i > max ? citations.length-i : max);
        }
        return max;
        
//        코드실환가.. ? 잘 모르겟음..ㅎ..
//        int max = 0;
//        for(int i = citations.length-1; i > -1; i--){
//            int min = (int)Math.min(citations[i], citations.length - i);
//            if(max < min) max = min;
//        }
//
//        return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] citation = {6, 5, 4, 1, 0};
		System.out.println(solution(citation));
	}

}
