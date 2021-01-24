package algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Back2164_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		//큐생성
		Queue<Integer> q = new LinkedList<>();
		for (int i = 1; i <= num; i++) {
			q.add(i);
		}
		//하나 남을 때 까지 돌려돌려
		while(q.size()!= 1) {
			q.remove();
			int a = q.poll();
			q.add(a);
			}
		//하나 남은거 빼주기
        System.out.println(q.poll());
	}
}
