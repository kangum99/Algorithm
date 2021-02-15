package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


//https://www.acmicpc.net/problem/1629 - 곱셈 - 분할 정복

//1. (a + b) mod n = ((a mod n) + (b mod n)) mod n
//
//2. (a - b) mod n = ((a mod n) - (b mod n)) mod n
//
//3. (a * b) mod n = ((a mod n) * (b mod n)) mod n

public class Back1629_DivideConquer {
	static long a;
	static int b, c;
	
	static long mul (long a, int b, int c) {
		
		if(b == 1)
            return a;
//        	return a % c;
        else {
            long next = mul(a, b/2, c);
            if(b % 2 == 1) {
                return ((next * next) % c * a) % c;
            }else
                return (next * next) % c;
        }
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		a = Long.parseLong(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		
//		System.out.println(mul(a, b, c));		
		System.out.println(mul(a % c, b, c));

	}

}
