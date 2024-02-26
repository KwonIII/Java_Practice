package practice;
//문자열 my_string과 정수 k가 주어질 때, my_string을 k번 반복한 문자열을 return 하는 solution 함수를 작성해 주세요.
public class Prac08 {

	public static void main(String[] args) {
		  // 입력 문자열과 k 값 설정
        String myString = "Hello";
        int k = 5;

        // Solution 클래스의 인스턴스 생성
        Solution1 solution = new Solution1();

        // Solution 클래스의 solution 메서드 호출하여 결과 출력
        String result = solution.solution(myString, k);
        System.out.println(result);

	}
}

class Solution1 {
    public String solution(String myString, int k) {
        String answer = "";
        
        for(int i = 0; i < k; i++) {
            answer = answer.concat(myString);
        }
        
        return answer;
    }
}
