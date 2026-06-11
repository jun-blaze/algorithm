package programmers.pccp1;

public class P03_242260_AnalogClock {
    /*
    [PCCP 기출문제] 3번 / 아날로그 시계

    문제 설명
    시침, 분침, 초침이 있는 아날로그 시계에서 초침이 시침 또는 분침과 겹칠 때마다
    알람이 울립니다. h1시 m1분 s1초부터 h2시 m2분 s2초까지(양 끝 포함) 동안
    울린 알람 횟수를 반환하세요. 단, 초침/분침/시침이 동시에 겹치는 순간은
    한 번의 알람으로 셉니다.

    제한사항
    - 0 ≤ h1, h2 ≤ 23
    - 0 ≤ m1, m2 ≤ 59
    - 0 ≤ s1, s2 ≤ 59
    - h1시 m1분 s1초 < h2시 m2분 s2초

    입출력 예
    h1 m1 s1  h2 m2 s2  result
    0  5  30   0  7  0    2
    12 0  0    12 0  30   1
    0  6  1    0  6  6    0
    11 59 30   12 0  0    1
    11 58 59   11 59 0    1
    1  5  5    1  5  6    2
    0  0  0    23 59 59   2852

    풀이 아이디어
    - 절대 초 start, end 로 변환 (단위: 초)
    - 초침-분침은 5.9도/초로 벌어지므로 t = 3600k/59 마다 겹침
      => 겹침 시각 t 가 정수 k 로 표현됨, [start,end] 안의 k 개수
    - 초침-시침은 719/120 도/초로 벌어지므로 t = 43200k/719 마다 겹침
    - 12:00:00(43200초의 배수)에는 셋이 동시에 겹쳐 분침/시침 양쪽에 중복 계산되므로 1회 빼줌
    */

    public static void main(String[] args) {
        System.out.println("Expected: 2    -> " + solution(0, 5, 30, 0, 7, 0));
        System.out.println("Expected: 1    -> " + solution(12, 0, 0, 12, 0, 30));
        System.out.println("Expected: 0    -> " + solution(0, 6, 1, 0, 6, 6));
        System.out.println("Expected: 1    -> " + solution(11, 59, 30, 12, 0, 0));
        System.out.println("Expected: 1    -> " + solution(11, 58, 59, 11, 59, 0));
        System.out.println("Expected: 2    -> " + solution(1, 5, 5, 1, 5, 6));
        System.out.println("Expected: 2852 -> " + solution(0, 0, 0, 23, 59, 59));
    }

    // ===== 내 풀이 =====
    public static int solution(int h1, int m1, int s1, int h2, int m2, int s2) {
        // TODO: 직접 풀어보세요.
        return 0;
    }


    // ============================================================
    // ===== 정답 코드 (스스로 풀어본 뒤 확인하세요) =====
    // ============================================================
    public static int answer(int h1, int m1, int s1, int h2, int m2, int s2) {
        long start = h1 * 3600L + m1 * 60L + s1;
        long end = h2 * 3600L + m2 * 60L + s2;

        // [start, end] 구간에 들어오는 겹침 시각의 개수
        long minuteMeet = countMeet(start, end, 59, 3600);   // t = 3600k/59
        long hourMeet = countMeet(start, end, 719, 43200);   // t = 43200k/719
        long tripleMeet = countMeet(start, end, 1, 43200);   // t = 43200k (셋이 동시 겹침)

        return (int) (minuteMeet + hourMeet - tripleMeet);
    }

    /*
     * 겹침 시각이 t = (denom * k) / numer (k = 0, 1, 2, ...) 일 때,
     * start <= t <= end 를 만족하는 정수 k 의 개수.
     * 조건: numer*start <= denom*k <= numer*end
     *  => k in [ceil(numer*start/denom), floor(numer*end/denom)]
     */
    private static long countMeet(long start, long end, long numer, long denom) {
        long lo = ceilDiv(numer * start, denom);
        long hi = Math.floorDiv(numer * end, denom);
        return Math.max(0, hi - lo + 1);
    }

    private static long ceilDiv(long a, long b) {
        return Math.floorDiv(a + b - 1, b); // a, b >= 0 가정
    }
}
