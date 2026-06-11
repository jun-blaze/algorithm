package programmers.pcce_mock3;

import java.util.Arrays;

public class M05_240610_PastaIngredients {
    /*
    [PCCE 모의고사] 5번

    문제 설명
    파스타 종류별 1인분 필요 재료량(마늘, 소금, 양파, 면)이 다음과 같습니다.
        토마토 파스타     : 4, 4, 1, 125
        새우 오일 파스타   : 6, 3, 0, 170
        버섯 크림 파스타   : 5, 4, 1, 140
    만들 파스타 종류 menu, 인분 수 n 이 주어질 때, 필요한 재료의 양을
    마늘, 소금, 양파, 면 순서의 정수 배열로 반환하세요.

    제한사항
    - menu 는 "tomato pasta", "shrimp oil pasta", "mushroom cream pasta" 중 하나
    - 1 ≤ n ≤ 30

    입출력 예
    menu                     n    result
    "tomato pasta"           3    [12, 12, 3, 375]
    "mushroom cream pasta"   12   [60, 48, 12, 1680]
    */

    public static void main(String[] args) {
        System.out.println("Expected: [12, 12, 3, 375]    -> " + Arrays.toString(solution("tomato pasta", 3)));
        System.out.println("Expected: [60, 48, 12, 1680] -> " + Arrays.toString(solution("mushroom cream pasta", 12)));
    }

    // ===== 내 풀이 =====
    public static int[] solution(String menu, int n) {
        // TODO: 직접 풀어보세요.
        return null;
    }


    // ============================================================
    // ===== 정답 코드 (스스로 풀어본 뒤 확인하세요) =====
    // ============================================================
    public static int[] answer(String menu, int n) {
        int[] base;
        switch (menu) {
            case "tomato pasta":         base = new int[]{4, 4, 1, 125}; break;
            case "shrimp oil pasta":     base = new int[]{6, 3, 0, 170}; break;
            case "mushroom cream pasta": base = new int[]{5, 4, 1, 140}; break;
            default:                     base = new int[]{0, 0, 0, 0};
        }

        int[] result = new int[4];
        for (int i = 0; i < 4; i++) {
            result[i] = base[i] * n;
        }
        return result;
    }
}
