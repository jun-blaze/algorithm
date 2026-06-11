package programmers.pcce1;

public class P09_240604_NeighboringCells {
    /*
    [PCCE 기출문제] 9번 / 이웃한 칸

    문제 설명
    색칠된 2차원 격자 보드판 board 에서 선택한 칸 (h, w) 의
    위, 아래, 왼쪽, 오른쪽 인접 칸 중 같은 색으로 칠해진 칸의 개수를 구하세요.
    방향 벡터: dh = [0, 1, -1, 0], dw = [1, 0, 0, -1]
    인접 좌표가 보드 범위 안이고 같은 색이면 count 증가.

    제한사항
    - 1 ≤ board 길이 ≤ 7, board 는 정사각형
    - 0 ≤ h, w < board 길이
    - board[h][w] 는 영어 소문자 색상 문자열, 1 ≤ 길이 ≤ 10

    입출력 예
    board                                                              h   w   result
    [["blue","red","orange","red"],["red","red","blue","orange"],
     ["blue","orange","red","red"],["orange","orange","red","blue"]]   1   1   2
    [["yellow","green","blue"],["blue","green","yellow"],
     ["yellow","blue","blue"]]                                         0   1   1
    */

    public static void main(String[] args) {
        String[][] board1 = {
                {"blue", "red", "orange", "red"},
                {"red", "red", "blue", "orange"},
                {"blue", "orange", "red", "red"},
                {"orange", "orange", "red", "blue"}
        };
        String[][] board2 = {
                {"yellow", "green", "blue"},
                {"blue", "green", "yellow"},
                {"yellow", "blue", "blue"}
        };
        System.out.println("Expected: 2 -> " + solution(board1, 1, 1));
        System.out.println("Expected: 1 -> " + solution(board2, 0, 1));
    }

    // ===== 내 풀이 =====
    public static int solution(String[][] board, int h, int w) {
        // TODO: 직접 풀어보세요.
        return 0;
    }


    // ============================================================
    // ===== 정답 코드 (스스로 풀어본 뒤 확인하세요) =====
    // ============================================================
    public static int answer(String[][] board, int h, int w) {
        int n = board.length;
        int count = 0;
        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};

        for (int i = 0; i < 4; i++) {
            int hCheck = h + dh[i];
            int wCheck = w + dw[i];

            if (hCheck < 0 || hCheck >= n || wCheck < 0 || wCheck >= n) {
                continue;
            }
            if (board[hCheck][wCheck].equals(board[h][w])) {
                count++;
            }
        }
        return count;
    }
}
