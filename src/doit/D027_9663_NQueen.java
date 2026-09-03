package doit;

public class D027_9663_NQueen {
    /*
    [Do it! 알고리즘 코딩 테스트: 자바 편] 27. N-Queen / 백준 9663

    문제 설명
    N × N 크기의 체스판 위에 퀸 N개를 서로 공격할 수 없게 놓는 경우의 수를 구합니다.
    퀸은 같은 행, 같은 열, 같은 대각선에 있는 말을 공격할 수 있습니다.

    핵심 아이디어 (백트래킹)
    - 퀸은 한 행에 하나만 놓을 수 있으므로 row 를 0 → N-1 로 늘려가며,
      각 행에서 0 ~ N-1 열을 하나씩 시도한다.
    - A[row] = col 형태로 배치 정보를 1차원 배열에 저장한다. (행 = 인덱스, 열 = 값)
    - 새로 놓은 퀸이 이전에 놓은 퀸들과 충돌하는지 check(row) 로 검사하고,
      통과할 때만 다음 행으로 재귀한다. (충돌하면 더 내려가지 않고 되돌아옴 = 가지치기)
    - row == N 이면 퀸 N개를 모두 놓은 것이므로 경우의 수를 1 늘린다.

    충돌 판정 check(row) — 이전 행 i(0 ≤ i < row) 들과 비교
    - 같은 열     : A[i] == A[row]
    - 같은 대각선 : |row - i| == |A[i] - A[row]|   (행 간격 == 열 간격)

    제한사항
    - 1 ≤ N < 15

    입출력 예
    N    result
    1    1
    2    0
    3    0
    4    2
    8    92

    (원본 백준 9663 은 표준 입력으로 N 을 받아 경우의 수만 출력합니다.
     여기서는 연습을 위해 solution(int n) 이 경우의 수를 반환하도록 바꿨습니다.)
    */

    public static void main(String[] args) {
        // 체스판이 아니라 테스트 목록. 한 줄이 { 입력 N, 그 N 일 때의 정답 } 이다.
        int[][] tests = {{1, 1}, {2, 0}, {3, 0}, {4, 2}, {5, 10}, {6, 4}, {8, 92}};
        for (int[] t : tests) {
            int n = t[0];
            int expected = t[1];
            System.out.println("N=" + n + "  기대=" + expected
                    + "   solution=" + solution(n) + "  answer=" + answer(n));
        }
    }

    // ===== 내 풀이 =====
    static int[] board;   // board[row] = 그 행에서 퀸이 놓인 열
    static int n;         // 체스판 크기
    static int count = 0;     // 퀸을 배치하는 경우의 수

    public static int solution(int n) {
        board = new int[]{n};  // board[row] = 그 행에서 퀸이 놓인 열
        // 1.가지치기 유망성 검사. DFS
        count = myBacktracking(0);







        return 1;
    }

    private static int myBacktracking (int row) {
        if (row == n) { // 정답출력
            // 왜 조건이 row == n 일지? 생각해보기
            count++;
            return count;
        }

        for (int i = 0; i < n; i++){ // 모든 경우의 수 탐색
            board[row] = i; // 일단 첫번째 row에 배치를 해본다. 갈수있는 열을 전부.
            if(check(row)){ // 가지치기 유망성 검사.
                myBacktracking(row + 1); // 체크했는데 패스되면 다음 row로 넘어간다.
            }
        }

        return 0;
    }

    private static boolean check (int row) {
        for (int i = 0; i <row ; i++) {
            if(board[i] == board[row]) return false  // 일직선 공격
            if(Math.abs(row-i) == Math.abs(board[row] - board[i])) return false; // 대각선 공격

        }
        return true;
    }


    // ============================================================
    // ===== 정답 코드 (스스로 풀어본 뒤 확인하세요) =====
    // ============================================================
    public static int answer(int num) {
        return backtracking(new int[num], num, 0);
    }

    private static int backtracking(int[] a, int size, int row) {
        if (row == size) {   // 퀸 N개를 모두 배치한 경우
            return 1;
        }
        int total = 0;
        for (int col = 0; col < size; col++) {
            a[row] = col;
            if (check(a, row)) {   // 이전 퀸들과 서로 공격할 수 없을 때만 다음 행으로
                total += backtracking(a, size, row + 1);
            }
        }
        return total;
    }

    private static boolean check(int[] a, int row) {
        for (int i = 0; i < row; i++) {
            if (a[i] == a[row]) {                                 // 같은 열
                return false;
            }
            if (Math.abs(row - i) == Math.abs(a[i] - a[row])) {   // 같은 대각선
                return false;
            }
        }
        return true;
    }
}
