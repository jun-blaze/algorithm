package programmers.pcce1;

public class P02_240597_Pythagoras {
    /*
    [PCCE 기출문제] 2번 / 피타고라스의 정리

    문제 설명
    직각삼각형이 주어졌을 때 빗변의 제곱은 다른 두 변을 각각 제곱한 것의 합과 같습니다.
    직각삼각형의 한 변의 길이를 나타내는 정수 a와 빗변의 길이를 나타내는 정수 c가
    주어질 때, 다른 한 변의 길이의 제곱인 b_square 을 반환하도록 코드를 완성하세요.

    제한사항
    - 1 ≤ a < c ≤ 100

    입출력 예
    입력      출력
    3, 5      16
    9, 10     19

    입출력 예 설명
    예 #1: a² = 9, c² = 25 이므로 결과는 16
    예 #2: a² = 81, c² = 100 이므로 결과는 19

    주어진 코드 (원본 C++) - 아래 한 줄을 수정해야 함
    int b_square = c - a;   // 버그: 단순 차이를 계산
    */

    public static void main(String[] args) {
        System.out.println("Expected: 16 -> " + solution(3, 5));
        System.out.println("Expected: 19 -> " + solution(9, 10));
    }

    // ===== 내 풀이 =====
    public static int solution(int a, int c) {
        // TODO: 직접 풀어보세요.
        return 0;
    }


    // ============================================================
    // ===== 정답 코드 (스스로 풀어본 뒤 확인하세요) =====
    // ============================================================
    public static int answer(int a, int c) {
        return c * c - a * a;
    }
}
