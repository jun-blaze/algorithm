package programmers.pcce_mock3;

public class M07_240612_DeliveryFee {
    /*
    [PCCE 모의고사] 7번

    문제 설명
    택배 요금은 상자 크기(가로+세로+높이)와 무게로 결정됩니다.
    상자 크기별 요금:
        80 미만        : 3,500원
        80~100 미만    : 4,500원
        100~120 미만   : 6,000원
        120~160 미만   : 12,000원
        160 이상        : 배송불가
        가로/세로/높이 중 하나라도 80 이상이면 배송불가
    무게별 요금:
        5 미만   : 500원
        5~10 미만 : 1,000원
        10~25 미만 : 4,000원
        25 이상   : 배송불가
    배송 가능하면 (상자 요금 + 무게 요금)을, 배송불가면 -1 을 반환하세요.

    제한사항
    - 1 ≤ width, length, height ≤ 100
    - 1 ≤ weight ≤ 40

    입출력 예
    width length height weight result
    40    30     70     14     16000
    50    60     60     7      -1
    30    20     90     5      -1
    10    15     14     25     -1
    */

    public static void main(String[] args) {
        System.out.println("Expected: 16000 -> " + solution(40, 30, 70, 14));
        System.out.println("Expected: -1    -> " + solution(50, 60, 60, 7));
        System.out.println("Expected: -1    -> " + solution(30, 20, 90, 5));
        System.out.println("Expected: -1    -> " + solution(10, 15, 14, 25));
    }

    // ===== 내 풀이 =====
    public static int solution(int width, int length, int height, int weight) {
        // TODO: 직접 풀어보세요.
        return 0;
    }


    // ============================================================
    // ===== 정답 코드 (스스로 풀어본 뒤 확인하세요) =====
    // ============================================================
    public static int answer(int width, int length, int height, int weight) {
        int size = width + length + height;

        if (size >= 160 || width >= 80 || length >= 80 || height >= 80) {
            return -1;
        }
        if (weight >= 25) {
            return -1;
        }

        int boxFee;
        if (size < 80) boxFee = 3500;
        else if (size < 100) boxFee = 4500;
        else if (size < 120) boxFee = 6000;
        else boxFee = 12000; // 120 ~ 160 미만

        int weightFee;
        if (weight < 5) weightFee = 500;
        else if (weight < 10) weightFee = 1000;
        else weightFee = 4000; // 10 ~ 25 미만

        return boxFee + weightFee;
    }
}
