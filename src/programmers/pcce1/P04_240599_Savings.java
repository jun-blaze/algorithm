package programmers.pcce1;

public class P04_240599_Savings {
    /*
    [PCCE 기출문제] 4번 / 저축

    문제 설명
    진우는 돈을 모으기 위해 저축을 하려고 합니다. 목표 금액은 100만 원이며,
    첫 달에 일정 금액을 넣은 뒤 70만 원까지는 매월 조금씩 저축하다가
    70만 원 이후부터는 월 저축량을 늘려 빠르게 목표 금액을 달성하고자 합니다.
    정수 start(첫 달 저축액), before(70만 원까지 월 저축액),
    after(100만 원까지 월 저축액)가 주어질 때,
    100만 원 이상을 모을 때까지 걸리는 개월 수를 구하세요. (단위: 만 원)

    제한사항
    - 0 ≤ start ≤ 99
    - 1 ≤ before ≤ after ≤ 25

    입출력 예
    입력          출력
    28, 6, 8      12
    75, 8, 25     2
    */

    public static void main(String[] args) {
        System.out.println("Expected: 12 -> " + solution(28, 6, 8));
        System.out.println("Expected: 2  -> " + solution(75, 8, 25));
    }

    // ===== 내 풀이 =====
    public static int solution(int start, int before, int after) {
        // TODO: 직접 풀어보세요.
        return 0;
    }


    // ============================================================
    // ===== 정답 코드 (스스로 풀어본 뒤 확인하세요) =====
    // ============================================================
    public static int answer(int start, int before, int after) {
        int money = start;
        int month = 1;

        while (money < 70) {
            money += before;
            month++;
        }
        while (money < 100) {
            money += after;
            month++;
        }
        return month;
    }
}
