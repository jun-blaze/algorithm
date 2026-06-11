package programmers.pcce_mock3;

public class M03_240608_SupportFund {
    /*
    [PCCE 모의고사] 3번

    문제 설명
    국비 지원 프로젝트의 최종 지불 금액을 계산합니다. 나이별 할인:
    - 20~29세: 90% 할인 (즉 10%만 지불)
    - 30~39세: 70% 할인 (즉 30%만 지불)
    - 그 외: 100% 할인 (0원)
    수료(complete == 1) 시 지불 금액의 50%를 환급합니다.
    나이 age, 원래 금액 money, 수료 여부 complete 가 주어질 때 최종 지불 금액을 반환하세요.

    제한사항
    - 10 ≤ age ≤ 60
    - 100,000 ≤ money ≤ 1,000,000 (100의 배수)
    - complete: 1(수료) 또는 0(미수료)

    입출력 예
    입력             출력
    35 500000 1      75000

    입출력 예 설명
    35세 -> 70% 할인 -> 500000 * 0.3 = 150000, 수료하여 50% 환급 -> 75000

    주어진 코드 (원본 C++) - 조건문 빈칸 채우기
    if(){  money = (money / 100) * 10; }       // 20대
    else if(){  money = (money / 100) * 30; }  // 30대
    else{  money = 0; }
    if(){  money /= 2; }                        // 수료 시
    */

    public static void main(String[] args) {
        System.out.println("Expected: 75000 -> " + solution(35, 500000, 1));
    }

    // ===== 내 풀이 =====
    public static int solution(int age, int money, int complete) {
        // TODO: 직접 풀어보세요.
        return 0;
    }


    // ============================================================
    // ===== 정답 코드 (스스로 풀어본 뒤 확인하세요) =====
    // ============================================================
    public static int answer(int age, int money, int complete) {
        if (age >= 20 && age <= 29) {
            money = (money / 100) * 10;
        } else if (age >= 30 && age <= 39) {
            money = (money / 100) * 30;
        } else {
            money = 0;
        }

        if (complete == 1) {
            money /= 2;
        }
        return money;
    }
}
