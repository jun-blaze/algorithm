package programmers.pcce_mock3;

public class M09_240614_MaxConsecutiveStudy {
    /*
    [PCCE 모의고사] 9번

    문제 설명
    민철이가 기록한 일일 공부 시간 배열 times 에서, 연속한 n일 동안 공부한 시간을
    모두 합했을 때 가장 큰 값을 반환하세요.

    제한사항
    - 10 ≤ times 의 길이 ≤ 1,000
    - 0 ≤ times 의 원소 ≤ 24
    - 1 ≤ n ≤ times 의 길이

    입출력 예
    times                                   n   result
    [4, 6, 3, 1, 0, 5, 9, 0, 1, 3]          4   15

    입출력 예 설명
    연속 4일 합의 최댓값은 (1+0+5+9) 또는 (5+9+0+1) = 15
    */

    public static void main(String[] args) {
        System.out.println("Expected: 15 -> " + solution(new int[]{4, 6, 3, 1, 0, 5, 9, 0, 1, 3}, 4));
    }

    // ===== 내 풀이 =====
    public static int solution(int[] times, int n) {
        // TODO: 직접 풀어보세요.
        return 0;
    }


    // ============================================================
    // ===== 정답 코드 (스스로 풀어본 뒤 확인하세요) =====
    // ============================================================
    public static int answer(int[] times, int n) {
        int windowSum = 0;
        for (int i = 0; i < n; i++) {
            windowSum += times[i];
        }

        int max = windowSum;
        for (int i = n; i < times.length; i++) {
            windowSum += times[i] - times[i - n]; // 슬라이딩 윈도우
            max = Math.max(max, windowSum);
        }
        return max;
    }
}
