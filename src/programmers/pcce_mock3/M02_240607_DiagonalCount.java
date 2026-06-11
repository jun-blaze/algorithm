package programmers.pcce_mock3;

public class M02_240607_DiagonalCount {
    /*
    [PCCE 모의고사] 2번

    문제 설명
    n각형에서 대각선의 개수를 구하는 문제입니다.
    정수 n을 입력받아 n각형의 대각선 개수를 반환하도록 코드를 완성하세요.

    제한사항
    - 3 ≤ n ≤ 30

    입출력 예
    n   출력
    3   0
    5   5

    입출력 예 설명
    예 #1: 3각형의 대각선 개수는 0개
    예 #2: 5각형의 대각선 개수는 5개

    주어진 코드 (원본 C++) - 한 줄 수정(디버깅)
    int num_diagonal = n * n - 3 / 2;   // 버그: 연산자 우선순위 / 공식 오류
    */

    public static void main(String[] args) {
        System.out.println("Expected: 0 -> " + solution(3));
        System.out.println("Expected: 5 -> " + solution(5));
    }

    // ===== 내 풀이 =====
    public static int solution(int n) {
        // TODO: 직접 풀어보세요.
        return 0;
    }


    // ============================================================
    // ===== 정답 코드 (스스로 풀어본 뒤 확인하세요) =====
    // ============================================================
    public static int answer(int n) {
        return n * (n - 3) / 2;
    }
}
