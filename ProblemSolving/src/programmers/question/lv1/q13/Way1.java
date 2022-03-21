package programmers.question.lv1.q13;
/*
	하샤드 수
	
	문제 설명
		양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 예를 들어 18의 자릿수 합은 1+8=9이고, 
		18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
	
	제한 조건
		x는 1 이상, 10000 이하인 정수입니다.
		
	입출력 예
		arr	return
		10	true
		12	true
		11	false
		13	false
		
	입출력 예 설명
		입출력 예 #1
			10의 모든 자릿수의 합은 1입니다. 10은 1로 나누어 떨어지므로 10은 하샤드 수입니다.
		
		입출력 예 #2
			12의 모든 자릿수의 합은 3입니다. 12는 3으로 나누어 떨어지므로 12는 하샤드 수입니다.
		
		입출력 예 #3
			11의 모든 자릿수의 합은 2입니다. 11은 2로 나누어 떨어지지 않으므로 11는 하샤드 수가 아닙니다.
		
		입출력 예 #4
			13의 모든 자릿수의 합은 4입니다. 13은 4로 나누어 떨어지지 않으므로 13은 하샤드 수가 아닙니다.
*/
public class Way1 {
	public static boolean solution(int x) {
		String str = String.valueOf(x);
		int sum = 0;
		for(int i = 0; i < str.length(); i++) {
			sum += Character.getNumericValue(str.charAt(i));
		}
		return (x % sum) == 0;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(10));
		System.out.println(solution(12));
		System.out.println(solution(11));
		System.out.println(solution(13));
	}
}

/*
	정확성  테스트
		테스트 1 〉	통과 (0.03ms, 72.8MB)
		테스트 2 〉	통과 (0.05ms, 86.4MB)
		테스트 3 〉	통과 (0.04ms, 73.9MB)
		테스트 4 〉	통과 (0.03ms, 78.3MB)
		테스트 5 〉	통과 (0.04ms, 75.8MB)
		테스트 6 〉	통과 (0.06ms, 72.1MB)
		테스트 7 〉	통과 (0.11ms, 78.3MB)
		테스트 8 〉	통과 (0.06ms, 71MB)
		테스트 9 〉	통과 (0.04ms, 72MB)
		테스트 10 〉	통과 (0.05ms, 78.1MB)
		테스트 11 〉	통과 (0.05ms, 76.7MB)
		테스트 12 〉	통과 (0.05ms, 74MB)
		테스트 13 〉	통과 (0.05ms, 71.2MB)
		테스트 14 〉	통과 (0.06ms, 72.5MB)
		테스트 15 〉	통과 (0.04ms, 69.1MB)
		테스트 16 〉	통과 (0.09ms, 73.5MB)
		테스트 17 〉	통과 (0.04ms, 72.9MB)
		
	채점 결과
		정확성: 100.0
		합계: 100.0 / 100.0
*/
