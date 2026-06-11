package programmers.pcce1;

public class P07_240602_Humidifier {
    /*
    [PCCE 기출문제] 7번 / 가습기

    문제 설명
    상우의 가습기는 세 가지 모드를 지원합니다.
    - "auto":  습도 범위로 단계 결정
        0~10 미만:5, 10~20 미만:4, 20~30 미만:3, 30~40 미만:2, 40~50 미만:1, 50 이상:0
    - "target": 습도 < 설정값 -> 3, 습도 >= 설정값 -> 1
    - "minimum": 습도 < 설정값 -> 1, 습도 >= 설정값 -> 0
    mode_type, humidity(현재 습도), val_set(설정값)이 주어질 때 작동 단계를 반환하세요.

    제한사항
    - mode_type 은 "auto", "target", "minimum" 중 하나
    - 0 ≤ humidity, val_set ≤ 100

    입출력 예
    mode_type   humidity   val_set   result
    "auto"      23         45        3
    "target"    41         40        1
    "minimum"   10         34        1
    */

    public static void main(String[] args) {
        System.out.println("Expected: 3 -> " + solution("auto", 23, 45));
        System.out.println("Expected: 1 -> " + solution("target", 41, 40));
        System.out.println("Expected: 1 -> " + solution("minimum", 10, 34));
    }

    // ===== 내 풀이 =====
    public static int solution(String mode_type, int humidity, int val_set) {
        // TODO: 직접 풀어보세요.
        return 0;
    }


    // ============================================================
    // ===== 정답 코드 (스스로 풀어본 뒤 확인하세요) =====
    // ============================================================
    public static int answer(String mode_type, int humidity, int val_set) {
        switch (mode_type) {
            case "auto":
                return autoMode(humidity);
            case "target":
                return humidity < val_set ? 3 : 1;
            case "minimum":
                return humidity < val_set ? 1 : 0;
            default:
                return 0;
        }
    }

    private static int autoMode(int humidity) {
        if (humidity >= 50) return 0;
        else if (humidity >= 40) return 1;
        else if (humidity >= 30) return 2;
        else if (humidity >= 20) return 3;
        else if (humidity >= 10) return 4;
        return 5;
    }
}
