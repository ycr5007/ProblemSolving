package programmers.question.lv1.q08;

import java.util.Scanner;

/*
	문제 설명
		이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
		별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.
		
	제한 조건
		n과 m은 각각 1000 이하인 자연수입니다.
	
	예시
		입력
		5 3
		
	출력
		
		*****
		*****
		*****
*/
public class Way1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i = 0; i < b; i++) {
        	for(int j = 0; j < a; j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        sc.close();
	}
}

/*
	정확성  테스트
		테스트 1 〉	통과 (137.92ms, 67.2MB)
		테스트 2 〉	통과 (142.58ms, 68.4MB)
		테스트 3 〉	통과 (138.18ms, 69.7MB)
		테스트 4 〉	통과 (149.62ms, 68.3MB)
		테스트 5 〉	통과 (132.91ms, 63.4MB)
		테스트 6 〉	통과 (126.87ms, 67.9MB)
		테스트 7 〉	통과 (151.40ms, 63.2MB)
		테스트 8 〉	통과 (169.53ms, 81.1MB)
		테스트 9 〉	통과 (292.12ms, 89.8MB)
		테스트 10 〉	통과 (148.09ms, 70.7MB)
		테스트 11 〉	통과 (179.37ms, 76.4MB)
	
	채점 결과
		정확성: 100.0
		합계: 100.0 / 100.0
*/
