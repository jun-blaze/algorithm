package programmers.pcce1;

import java.util.LinkedHashMap;
import java.util.Map;

public class P08_240603_WarehouseOrganize {
    /*
    [PCCE 기출문제] 8번 / 창고 정리

    문제 설명
    선빈이가 게임 창고를 정리하려 합니다. 여러 칸에 나뉘어 있는 같은 물건들을
    한 칸에 모아 정리할 때, 개수가 가장 많은 물건의 이름을 반환하세요.
    storage[i] 는 i번 칸 물건 이름, num[i] 는 i번 칸 물건 개수입니다.

    제한사항
    - 1 ≤ storage 길이 = num 길이 ≤ 30
    - storage[i] 는 영어 대소문자로 구성 (대소문자 구분), 1 ≤ 길이 ≤ 30
    - 1 ≤ num[i] ≤ 20
    - 가장 개수가 많은 물건은 유일함

    입출력 예
    storage                                          num             result
    ["pencil","pencil","pencil","book"]              [2,4,3,1]       "pencil"
    ["doll","doll","doll","doll"]                    [1,1,1,1]       "doll"
    ["apple","steel","leaf","apple","leaf"]          [5,3,5,3,7]     "leaf"
    ["mirror","net","mirror","net","bottle"]         [4,1,4,1,5]     "mirror"

    주어진 코드 (원본 C++) - 한 줄에 버그가 있음
    clean_storage[num_item] = to_string(num[i]);   // 버그: 이름 대신 개수를 저장
    */

    public static void main(String[] args) {
        System.out.println(solution(
                new String[]{"pencil", "pencil", "pencil", "book"}, new int[]{2, 4, 3, 1}));
        System.out.println(solution(
                new String[]{"doll", "doll", "doll", "doll"}, new int[]{1, 1, 1, 1}));
        System.out.println(solution(
                new String[]{"apple", "steel", "leaf", "apple", "leaf"}, new int[]{5, 3, 5, 3, 7}));
        System.out.println(solution(
                new String[]{"mirror", "net", "mirror", "net", "bottle"}, new int[]{4, 1, 4, 1, 5}));
    }

    // ===== 내 풀이 =====
    public static String solution(String[] storage, int[] num) {
        // TODO: 직접 풀어보세요.
        return "";
    }


    // ============================================================
    // ===== 정답 코드 (스스로 풀어본 뒤 확인하세요) =====
    // ============================================================
    public static String answer(String[] storage, int[] num) {
        Map<String, Integer> counts = new LinkedHashMap<>();
        for (int i = 0; i < storage.length; i++) {
            counts.merge(storage[i], num[i], Integer::sum);
        }

        String result = "";
        int max = -1;
        for (Map.Entry<String, Integer> e : counts.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
                result = e.getKey();
            }
        }
        return result;
    }
}
