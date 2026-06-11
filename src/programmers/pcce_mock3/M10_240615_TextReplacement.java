package programmers.pcce_mock3;

public class M10_240615_TextReplacement {
    /*
    [PCCE 모의고사] 10번

    문제 설명
    메신저의 텍스트 대치 기능을 구현합니다. 대치 규칙 snippet 은 [줄임말, 원래 단어]
    쌍으로 구성되며, message 의 단어(띄어쓰기로 구분) 중 줄임말과 "정확히 일치"하는
    단어를 원래 단어로 변환합니다. 단, 대치된 단어는 다시 대치되지 않습니다.

    제한사항
    - 1 ≤ snippet 의 길이 ≤ 20
    - 1 ≤ snippet[i][0], snippet[i][1] 의 길이 ≤ 50
    - 1 ≤ message 의 길이 ≤ 3,000
    - 연속 공백 없음, message 는 공백으로 시작하지 않음

    입출력 예
    snippet                                                          message                          result
    [["IMO,","In my opinion,"],["AYS?","Are you serious?"],         "IMO, it does not look so good.   "In my opinion, it does not look
     ["TTYL.","Talk to you later."]]                                 AYS? TTYL."                       so good. Are you serious? Talk to you later."
    [["msg","message"],["m","me"],["s","see"],["g","group"]]        "msg"                            "message"
    [["IMO","In my opinion"]]                                       "IMO, IMO"                       "IMO, In my opinion"

    입출력 예 설명
    예 #3: "IMO," 는 정확히 일치하지 않아 대치되지 않고, "IMO" 만 "In my opinion" 으로 대치됨
    */

    public static void main(String[] args) {
        String[][] s1 = {{"IMO,", "In my opinion,"}, {"AYS?", "Are you serious?"}, {"TTYL.", "Talk to you later."}};
        System.out.println(solution(s1, "IMO, it does not look so good. AYS? TTYL."));

        String[][] s2 = {{"msg", "message"}, {"m", "me"}, {"s", "see"}, {"g", "group"}};
        System.out.println("Expected: message -> " + solution(s2, "msg"));

        String[][] s3 = {{"IMO", "In my opinion"}};
        System.out.println("Expected: IMO, In my opinion -> " + solution(s3, "IMO, IMO"));
    }

    // ===== 내 풀이 =====
    public static String solution(String[][] snippet, String message) {
        // TODO: 직접 풀어보세요.
        return null;
    }


    // ============================================================
    // ===== 정답 코드 (스스로 풀어본 뒤 확인하세요) =====
    // ============================================================
    public static String answer(String[][] snippet, String message) {
        String[] words = message.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int w = 0; w < words.length; w++) {
            String word = words[w];
            for (String[] rule : snippet) {
                if (word.equals(rule[0])) { // 정확히 일치하는 단어만 대치
                    word = rule[1];
                    break;                  // 대치 후 재대치 금지
                }
            }
            if (w > 0) sb.append(' ');
            sb.append(word);
        }
        return sb.toString();
    }
}
