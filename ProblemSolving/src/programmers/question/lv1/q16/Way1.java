package programmers.question.lv1.q16;
/*
	최대공약수와 최소공배수
		
	문제 설명
		두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 
		배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다. 
		예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.
		
	제한 사항
		두 수는 1이상 1000000이하의 자연수입니다.

	입출력 예
		n	m	return
		3	12	[3, 12]
		2	5	[1, 10]
	
	입출력 예 설명
		입출력 예 #1
			위의 설명과 같습니다.
		
		입출력 예 #2
			자연수 2와 5의 최대공약수는 1, 최소공배수는 10이므로 [1, 10]을 리턴해야 합니다.
*/
public class Way1 {
	
	// 호제법
	public static int gcd(int n, int m){
		while(m != 0){
			int r = n % m;
			n = m;
			m = r;
		}
		return n;
	}
	
	public static int[] solution(int n, int m) {
		int[] arr = {gcd(n, m), (int) (n * m / gcd(n, m))};
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = solution(265, 21000);
		System.out.println(arr[0] + " " + arr[1]);
	}
}

/*
	정확성  테스트
		테스트 1 〉	통과 (0.02ms, 75.6MB)
		테스트 2 〉	통과 (0.02ms, 74.4MB)
		테스트 3 〉	통과 (0.02ms, 75.3MB)
		테스트 4 〉	통과 (0.01ms, 73.7MB)
		테스트 5 〉	통과 (0.02ms, 78.1MB)
		테스트 6 〉	통과 (0.02ms, 68MB)
		테스트 7 〉	통과 (0.02ms, 80.7MB)
		테스트 8 〉	통과 (0.01ms, 72.4MB)
		테스트 9 〉	통과 (0.02ms, 79.9MB)
		테스트 10 〉	통과 (0.01ms, 74.4MB)
		테스트 11 〉	통과 (0.01ms, 74.8MB)
		테스트 12 〉	통과 (0.02ms, 69.8MB)
		테스트 13 〉	통과 (0.02ms, 69.5MB)
		테스트 14 〉	통과 (0.01ms, 74.2MB)
		테스트 15 〉	통과 (0.04ms, 77.1MB)
		테스트 16 〉	통과 (0.01ms, 76.9MB)
		
	채점 결과
		정확성: 100.0
		합계: 100.0 / 100.0
*/
