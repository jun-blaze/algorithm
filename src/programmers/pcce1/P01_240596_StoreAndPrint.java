package programmers.pcce1;

public class P01_240596_StoreAndPrint {
    /*
    [PCCE 기출문제] 1번

    문제 설명
    주어진 초기 코드는 변수에 데이터를 저장하고 출력하는 코드입니다.
    아래와 같이 출력되도록 빈칸을 채워 코드를 완성해 주세요.

    출력 예시
    Spring is beginning
    13
    310

    주어진 코드 (원본 C++)
    string msg = ____;
    int val1 = ____;
    string val2 = ____;
    cout << msg << endl;
    cout << val1 + 10 << endl;     // 13
    cout << val2 + "10" << endl;   // 310
    */

    public static void main(String[] args) {
        solve();
    }

    // ===== 내 풀이 =====
    public static void solve() {
        // TODO: msg, val1, val2 에 알맞은 값을 넣어 출력 예시와 같게 만드세요.
        String msg = "";
        int val1 = 0;
        String val2 = "";

        System.out.println(msg);
        System.out.println(val1 + 10);
        System.out.println(val2 + "10");
    }


    // ============================================================
    // ===== 정답 코드 (스스로 풀어본 뒤 확인하세요) =====
    // ============================================================
    public static void answer() {
        String msg = "Spring is beginning";
        int val1 = 3;
        String val2 = "3";

        System.out.println(msg);
        System.out.println(val1 + 10);
        System.out.println(val2 + "10");
    }
}
