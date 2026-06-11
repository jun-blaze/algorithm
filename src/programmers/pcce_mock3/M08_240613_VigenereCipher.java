package programmers.pcce_mock3;

public class M08_240613_VigenereCipher {
    /*
    [PCCE 모의고사] 8번 / 비즈네르 암호

    문제 설명
    비즈네르 암호는 단어 하나를 Key 로 반복 사용하여 문자열을 암호화합니다.
    - a=0, b=1, ..., z=25 로 대응
    - (원문 글자 숫자 + 키 글자 숫자) % 26 에 해당하는 알파벳으로 변환
    - Key 문자열은 원문의 공백문자에 관계없이 (원문 인덱스 기준으로) 반복됨
    - 원문의 공백 문자는 암호문에서도 그대로 공백으로 둠
    key 와 original 이 주어질 때 암호화된 문자열을 반환하세요.

    제한사항
    - key 는 영어 소문자만, 3 ≤ key 길이 ≤ 10
    - original 은 영어 소문자와 공백만 포함, 연속 공백 없음, 1 ≤ original 길이 ≤ 50

    입출력 예
    key      original            result
    "bus"    "today is sunday"   "uivbs jm tofeuq"

    주어진 코드 (원본 C++) - 디버깅
    int num_key = int(key[i] - 'a');   // 버그: key[i] 는 범위를 벗어남 -> key[i % key.length()]
    */

    public static void main(String[] args) {
        System.out.println("Expected: uivbs jm tofeuq");
        System.out.println("Result:   " + solution("bus", "today is sunday"));
    }

    // ===== 내 풀이 =====
    public static String solution(String key, String original) {
        // TODO: 직접 풀어보세요.
        return null;
    }


    // ============================================================
    // ===== 정답 코드 (스스로 풀어본 뒤 확인하세요) =====
    // ============================================================
    public static String answer(String key, String original) {
        StringBuilder sb = new StringBuilder();
        int keyLen = key.length();

        for (int i = 0; i < original.length(); i++) {
            char c = original.charAt(i);
            if (c == ' ') {
                sb.append(' ');
                continue;
            }
            int numOriginal = c - 'a';
            int numKey = key.charAt(i % keyLen) - 'a';
            int numCrypto = (numOriginal + numKey) % 26;
            sb.append((char) (numCrypto + 'a'));
        }
        return sb.toString();
    }
}
