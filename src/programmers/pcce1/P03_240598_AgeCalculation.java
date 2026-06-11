package programmers.pcce1;

public class P03_240598_AgeCalculation {
    /*
    [PCCE 기출문제] 3번 / 나이 계산

    문제 설명
    나이를 세는 방법은 여러 가지가 있습니다. 그중 한국식 나이는 태어난 순간 1살이 되며
    해가 바뀔 때마다 1살씩 더 먹게 됩니다.
    - 한국식 나이: 현재 연도 - 출생 연도 + 1
    - 연 나이:     현재 연도 - 출생 연도
    2030년을 기준으로 출생 연도(year)와 나이 종류(age_type)가 주어질 때 나이를 계산합니다.

    제한사항
    - 1950 ≤ year ≤ 2030
    - age_type 은 "Korea" 또는 "Year" 만 주어집니다.

    입출력 예
    입력            출력
    2000, Korea     31
    1999, Year      31
    */

    private static final int CURRENT_YEAR = 2030;

    public static void main(String[] args) {
        System.out.println("Expected: 31 -> " + solution(2000, "Korea"));
        System.out.println("Expected: 31 -> " + solution(1999, "Year"));
    }

    // ===== 내 풀이 =====
    public static int solution(int year, String age_type) {
        // TODO: 직접 풀어보세요.
        return 0;
    }


    // ============================================================
    // ===== 정답 코드 (스스로 풀어본 뒤 확인하세요) =====
    // ============================================================
    public static int answer(int year, String age_type) {
        if (age_type.equals("Korea")) {
            return CURRENT_YEAR - year + 1;
        }
        // "Year"
        return CURRENT_YEAR - year;
    }
}
