package hash;

import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/42577 전화번호목록
/*
 * 해쉬
 *접두사로 있는 경우 -> false , 없는 경우 true 
*/

public class Pro_전화번호목록 {
	public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
//        정렬했기 때문에 앞뒤에 있는 거만 확인 하면 됨
        for(int i=0; i < phone_book.length-1; i++ ){
        	
            if(phone_book[i+1].startsWith(phone_book[i]))
            	return false;
        }
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
