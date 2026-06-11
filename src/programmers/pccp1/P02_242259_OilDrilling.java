package programmers.pccp1;

import java.util.ArrayDeque;
import java.util.Deque;

public class P02_242259_OilDrilling {
    /*
    [PCCP 기출문제] 2번 / 석유 시추

    문제 설명
    격자 모양의 땅 land 에서 0은 빈 땅, 1은 석유입니다. 상하좌우로 연결된 석유는
    하나의 덩어리이며, 수직으로 시추관 하나를 뚫어 한 열을 지나면 그 열이 지나는
    모든 석유 덩어리의 석유를 전부 뽑을 수 있습니다.
    가장 많은 석유를 뽑을 수 있는 시추관 위치(열)의 석유량을 반환하세요.

    제한사항
    - 1 ≤ land 세로 길이 n ≤ 500
    - 1 ≤ land 가로 길이 m ≤ 500
    - land[i][j] 는 0 또는 1

    입출력 예
    예제 1: 9
    예제 2: 16
    */

    public static void main(String[] args) {
        int[][] land1 = {
                {0, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 1, 1, 0, 0},
                {1, 1, 0, 0, 0, 1, 1, 0},
                {1, 1, 1, 0, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0, 1, 1}
        };
        int[][] land2 = {
                {1, 0, 1, 0, 1, 1},
                {1, 0, 1, 0, 0, 0},
                {1, 0, 1, 0, 0, 1},
                {1, 0, 0, 1, 0, 0},
                {1, 0, 0, 1, 0, 1},
                {1, 0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1}
        };
        System.out.println("Expected: 9  -> " + solution(land1));
        System.out.println("Expected: 16 -> " + solution(land2));
    }

    // ===== 내 풀이 =====
    public static int solution(int[][] land) {
        // TODO: 직접 풀어보세요.
        return 0;
    }


    // ============================================================
    // ===== 정답 코드 (스스로 풀어본 뒤 확인하세요) =====
    // ============================================================
    public static int answer(int[][] land) {
        int n = land.length;
        int m = land[0].length;
        boolean[][] visited = new boolean[n][m];
        long[] columnSum = new long[m]; // 각 열에서 뽑을 수 있는 석유량 합

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                if (land[r][c] != 1 || visited[r][c]) {
                    continue;
                }
                // BFS 로 한 덩어리 탐색
                Deque<int[]> queue = new ArrayDeque<>();
                queue.add(new int[]{r, c});
                visited[r][c] = true;

                int size = 0;
                boolean[] cols = new boolean[m]; // 덩어리가 걸치는 열들

                while (!queue.isEmpty()) {
                    int[] cur = queue.poll();
                    size++;
                    cols[cur[1]] = true;

                    for (int d = 0; d < 4; d++) {
                        int nr = cur[0] + dr[d];
                        int nc = cur[1] + dc[d];
                        if (nr < 0 || nr >= n || nc < 0 || nc >= m) continue;
                        if (land[nr][nc] != 1 || visited[nr][nc]) continue;
                        visited[nr][nc] = true;
                        queue.add(new int[]{nr, nc});
                    }
                }

                // 덩어리가 걸친 각 열에 덩어리 크기를 한 번씩 더함
                for (int col = 0; col < m; col++) {
                    if (cols[col]) {
                        columnSum[col] += size;
                    }
                }
            }
        }

        long max = 0;
        for (long sum : columnSum) {
            max = Math.max(max, sum);
        }
        return (int) max;
    }
}
