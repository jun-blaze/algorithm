package programmers.pcce_mock3;

import java.util.Arrays;

public class M06_240611_MatrixAddition {
    /*
    [PCCE 모의고사] 6번 / 행렬의 덧셈

    문제 설명
    같은 크기의 두 행렬에서 같은 자리에 있는 원소끼리 더하는 행렬의 덧셈을 수행합니다.
    두 행렬 matrix_A 와 matrix_B 가 주어질 때 두 행렬의 합을 반환하세요.

    제한사항
    - 3 ≤ matrix_A, matrix_B 의 크기 ≤ 10 (두 행렬 크기는 항상 같음)
    - 3 ≤ matrix_A[i], matrix_B[i] 의 크기 ≤ 10
    - 0 ≤ 원소 ≤ 10

    입출력 예
    matrix_A                          matrix_B                          result
    [[1,2,3],[1,2,3],[1,2,3]]         [[0,1,1],[1,0,0],[0,0,1]]         [[1,3,4],[2,2,3],[1,2,4]]

    주어진 코드 (원본 C++) - 한 줄 수정(디버깅)
    answer[i][j] = matrix_A[i][j];   // 버그: matrix_B 를 더하지 않음
    */

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        int[][] b = {{0, 1, 1}, {1, 0, 0}, {0, 0, 1}};
        System.out.println("Expected: [[1, 3, 4], [2, 2, 3], [1, 2, 4]]");
        System.out.println("Result:   " + Arrays.deepToString(solution(a, b)));
    }

    // ===== 내 풀이 =====
    public static int[][] solution(int[][] matrix_A, int[][] matrix_B) {
        // TODO: 직접 풀어보세요.
        return null;
    }


    // ============================================================
    // ===== 정답 코드 (스스로 풀어본 뒤 확인하세요) =====
    // ============================================================
    public static int[][] answer(int[][] matrix_A, int[][] matrix_B) {
        int rows = matrix_A.length;
        int cols = matrix_A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix_A[i][j] + matrix_B[i][j];
            }
        }
        return result;
    }
}
