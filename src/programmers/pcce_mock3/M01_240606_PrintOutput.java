package programmers.pcce_mock3;

public class M01_240606_PrintOutput {
    /*
    [PCCE 모의고사] 1번

    문제 설명
    주어진 초기 코드는 문자열과 숫자를 출력하는 코드입니다.
    아래와 같이 출력되도록 빈칸을 채워 코드를 완성해 주세요.

    출력 예시
    Input correct number:
    4256 4948
    0000 0000...passed

    주어진 코드 (원본 C++) - 빈칸 채우기
    cout << ____ << endl;                 // "Input correct number:"
    cout << 4256 << " " << 4948 << endl;  // 4256 4948
    cout << ____ << "...passed" << endl;  // "0000 0000"
    */

    public static void main(String[] args) {
        solve();
    }

    // ===== 내 풀이 =====
    public static void solve() {
        // TODO: 직접 풀어보세요.
    }


    // ============================================================
    // ===== 정답 코드 (스스로 풀어본 뒤 확인하세요) =====
    // ============================================================
    public static void answer() {
        System.out.println("Input correct number:");
        System.out.println(4256 + " " + 4948);
        System.out.println("0000 0000" + "...passed");
    }
}
