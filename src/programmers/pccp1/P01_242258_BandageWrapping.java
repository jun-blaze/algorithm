package programmers.pccp1;

public class P01_242258_BandageWrapping {
    /*
    [PCCP 기출문제] 1번 / 붕대 감기

    문제 설명
    붕대 감기 기술은 t초 동안 시전하며 1초마다 x 만큼 체력을 회복합니다.
    t초 연속 성공하면 추가로 y 만큼 회복합니다. (최대 체력 초과 불가)
    시전 중 공격을 받으면 기술이 취소되고 연속 성공 시간이 0으로 초기화됩니다.
    공격을 받아 체력이 0 이하가 되면 사망하며, 이때 -1 을 반환합니다.
    bandage = [시전 시간 t, 초당 회복량 x, 추가 회복량 y], 시작 체력 health,
    공격 정보 attacks(시간 오름차순, [공격 시간, 피해량])가 주어질 때
    마지막 공격 종료 후 남은 체력을 반환하세요. (사망 시 -1)

    제한사항
    - bandage: t(1~50), x(1~100), y(1~100)
    - health: 1~1,000
    - 1 ≤ attacks 길이 ≤ 100, attacks[i] = [시간(1~1000), 피해량(1~100)]

    입출력 예
    bandage   health  attacks                              result
    [5,1,5]   30      [[2,10],[9,15],[10,5],[11,5]]        5
    [3,2,7]   20      [[1,15],[5,16],[8,6]]                -1
    [4,2,7]   20      [[1,15],[5,16],[8,6]]                -1
    [1,1,1]   5       [[1,2],[3,2]]                        3
    */

    public static void main(String[] args) {
        System.out.println("Expected: 5  -> " + solution(new int[]{5, 1, 5}, 30,
                new int[][]{{2, 10}, {9, 15}, {10, 5}, {11, 5}}));
        System.out.println("Expected: -1 -> " + solution(new int[]{3, 2, 7}, 20,
                new int[][]{{1, 15}, {5, 16}, {8, 6}}));
        System.out.println("Expected: -1 -> " + solution(new int[]{4, 2, 7}, 20,
                new int[][]{{1, 15}, {5, 16}, {8, 6}}));
        System.out.println("Expected: 3  -> " + solution(new int[]{1, 1, 1}, 5,
                new int[][]{{1, 2}, {3, 2}}));
    }

    // ===== 내 풀이 =====
    public static int solution(int[] bandage, int health, int[][] attacks) {
        // TODO: 직접 풀어보세요.
        return 0;
    }


    // ============================================================
    // ===== 정답 코드 (스스로 풀어본 뒤 확인하세요) =====
    // ============================================================
    public static int answer(int[] bandage, int health, int[][] attacks) {
        int castTime = bandage[0]; // t
        int healPerSec = bandage[1]; // x
        int bonus = bandage[2]; // y

        int maxHealth = health;
        int hp = health;
        int combo = 0;
        int attackIdx = 0;
        int lastTime = attacks[attacks.length - 1][0];

        for (int sec = 1; sec <= lastTime; sec++) {
            if (attackIdx < attacks.length && attacks[attackIdx][0] == sec) {
                hp -= attacks[attackIdx][1];
                if (hp <= 0) {
                    return -1;
                }
                combo = 0; // 연속 성공 초기화
                attackIdx++;
            } else {
                hp += healPerSec;
                combo++;
                if (combo == castTime) {
                    hp += bonus;
                    combo = 0;
                }
                if (hp > maxHealth) {
                    hp = maxHealth;
                }
            }
        }
        return hp;
    }
}
