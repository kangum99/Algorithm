package algorithm;

import java.util.Scanner;

public class Back17827_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int Nnext = sc.nextInt();
		int node [] = new int[N];
		for (int i = 0; i < N; i++ ) {
			node[i] = sc.nextInt();
		}
		for (int i = 0; i < M; i++) {
			int num = sc.nextInt();
			if (num < N) {
				System.out.println(node[num]);
			}else if(N == Nnext){
				System.out.println(node[N-1]);
			}else{
				//전체를 한번 빼고 나머지만 순환값만큼 나눈 나머지 + (Nnext-1)
				//(Nnext-1) : 배열이라 0부터 시작해서 -1
				System.out.println(node[(Nnext-1)+((num-N) % (N-(Nnext-1)))]);
			}
		}
		sc.close();
	}

}
