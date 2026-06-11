package programmers.pcce1;

import java.util.Arrays;

public class P05_240600_Walk {
    /*
    [PCCE 기출문제] 5번 / 산책

    문제 설명
    여름이가 강아지를 산책시키며 2차원 좌표평면에서 동/서/남/북으로 1m 단위로 이동합니다.
    경로 문자열 route 가 주어질 때 도착점의 위치를 구하세요.
    - "N": 북쪽으로 1 이동
    - "S": 남쪽으로 1 이동 (북쪽 기준 -1)
    - "E": 동쪽으로 1 이동
    - "W": 서쪽으로 1 이동 (동쪽 기준 -1)
    반환 형식: [동쪽 거리, 북쪽 거리] (음수면 서쪽/남쪽)

    제한사항
    - 1 ≤ route 길이 ≤ 20
    - route 는 "N", "S", "E", "W" 로만 구성

    입출력 예
    route               result
    "NSSNEWWN"          [-1, 1]
    "EESEEWNWSNWWNS"    [0, 0]
    */

    public static void main(String[] args) {
        System.out.println("Expected: [-1, 1] -> " + Arrays.toString(solution("NSSNEWWN")));
        System.out.println("Expected: [0, 0]  -> " + Arrays.toString(solution("EESEEWNWSNWWNS")));
    }

    // ===== 내 풀이 =====
    public static int[] solution(String route) {
        // TODO: 직접 풀어보세요.
        return null;
    }


    // ============================================================
    // ===== 정답 코드 (스스로 풀어본 뒤 확인하세요) =====
    // ============================================================
    public static int[] answer(String route) {
        int east = 0;
        int north = 0;

        for (int i = 0; i < route.length(); i++) {
            switch (route.charAt(i)) {
                case 'N':
                    north++;
                    break;
                case 'S':
                    north--;
                    break;
                case 'E':
                    east++;
                    break;
                case 'W':
                    east--;
                    break;
            }
        }
        return new int[]{east, north};
    }
}
