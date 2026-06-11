package programmers.pcce_mock3;

import java.util.Arrays;

public class M04_240609_CountdownBackwards {
    /*
    [PCCE 모의고사] 4번

    문제 설명
    영진이는 수를 거꾸로 세는 연습을 합니다. 시작값 start 부터 간격 step 만큼
    감소시키며 수를 셉니다. 단, 끝나는 수 end 보다 작아지지는 않아야 합니다.
    start 부터 end 이상인 동안 step 만큼 감소시킨 수들을 순서대로 반환하세요.
    (원본은 콘솔 출력 문제이나, 이 레포에서는 수열을 배열로 반환하도록 변환)

    제한사항
    - 10 ≤ start ≤ 50
    - 1 ≤ step ≤ 10
    - -50 ≤ end < start

    입출력 예
    입력          출력
    10, 2, 3      10, 8, 6, 4
    10, 3, 1      10, 7, 4, 1

    주어진 코드 (원본 C++) - for문 한 줄 수정(디버깅)
    for(int i = start; i < end; i++){ ... }   // 버그: 감소/종료조건/step 미반영
    */

    public static void main(String[] args) {
        System.out.println("Expected: [10, 8, 6, 4] -> " + Arrays.toString(solution(10, 2, 3)));
        System.out.println("Expected: [10, 7, 4, 1] -> " + Arrays.toString(solution(10, 3, 1)));
    }

    // ===== 내 풀이 =====
    public static int[] solution(int start, int step, int end) {
        // TODO: 직접 풀어보세요.
        return null;
    }


    // ============================================================
    // ===== 정답 코드 (스스로 풀어본 뒤 확인하세요) =====
    // ============================================================
    public static int[] answer(int start, int step, int end) {
        java.util.List<Integer> list = new java.util.ArrayList<>();
        for (int i = start; i >= end; i -= step) {
            list.add(i);
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
