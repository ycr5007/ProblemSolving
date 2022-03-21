package programmers.question.lv1.q07;
/*
	문제 설명
		길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.
		예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.
		
	제한 조건
		n은 길이 10,000이하인 자연수입니다.
	
	입출력 예
		n	return
		3	"수박수"
		4	"수박수박"
*/
public class Way1 {
	public static String solution(int n) {
        String answer = "";
        for(int i = 0; i < n; i++) {
        	answer += ((i % 2) == 0? "수" : "박");
        }
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(3));
		System.out.println(solution(4));
	}
}

/*
	정확성  테스트
		테스트 1 〉	통과 (2.52ms, 76.2MB)
		테스트 2 〉	통과 (9.91ms, 88.5MB)
		테스트 3 〉	통과 (6.14ms, 87.7MB)
		테스트 4 〉	통과 (17.65ms, 97.3MB)
		테스트 5 〉	통과 (6.16ms, 81.8MB)
		테스트 6 〉	통과 (1.23ms, 85.1MB)
		테스트 7 〉	통과 (1.45ms, 76MB)
		테스트 8 〉	통과 (1.47ms, 79.8MB)
		테스트 9 〉	통과 (2.05ms, 72.2MB)
		테스트 10 〉	통과 (1.35ms, 75.1MB)
		테스트 11 〉	통과 (1.92ms, 76.6MB)
		테스트 12 〉	통과 (1.33ms, 68.9MB)
		테스트 13 〉	통과 (1.71ms, 76.7MB)
		테스트 14 〉	통과 (1.98ms, 76.1MB)
		테스트 15 〉	통과 (52.91ms, 131MB)
		테스트 16 〉	통과 (1.36ms, 71.2MB)
		
	채점 결과
		정확성: 100.0
		합계: 100.0 / 100.0
*/
