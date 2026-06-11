package programmers.pcce1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P10_240605_DataAnalysis {
    /*
    [PCCE 기출문제] 10번 / 데이터 분석

    문제 설명
    데이터는 [코드 번호(code), 제조일(date), 최대 수량(maximum), 현재 수량(remain)] 으로 구성됩니다.
    주어진 기준 항목 ext 의 값이 val_ext 보다 작은 데이터들만 필터링한 후,
    sort_by 항목을 기준으로 오름차순 정렬하여 반환하세요.

    제한사항
    - 1 ≤ data 길이 ≤ 500, data[i] = [code, date, maximum, remain]
    - 1 ≤ code ≤ 100,000
    - 20000101 ≤ date ≤ 29991231 (yyyymmdd)
    - 1 ≤ maximum ≤ 10,000, 1 ≤ remain ≤ maximum
    - ext, sort_by 는 "code","date","maximum","remain" 중 하나
    - 조건 만족 데이터는 항상 1개 이상 존재

    입출력 예
    data: [[1,20300104,100,80],[2,20300804,847,37],[3,20300401,10,8]]
    ext:"date"  val_ext:20300501  sort_by:"remain"
    result: [[3,20300401,10,8],[1,20300104,100,80]]
    */

    public static void main(String[] args) {
        int[][] data = {
                {1, 20300104, 100, 80},
                {2, 20300804, 847, 37},
                {3, 20300401, 10, 8}
        };
        int[][] result = solution(data, "date", 20300501, "remain");
        System.out.println(Arrays.deepToString(result));
        // Expected: [[3, 20300401, 10, 8], [1, 20300104, 100, 80]]
    }

    // ===== 내 풀이 =====
    public static int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        // TODO: 직접 풀어보세요.
        return new int[0][];
    }


    // ============================================================
    // ===== 정답 코드 (스스로 풀어본 뒤 확인하세요) =====
    // ============================================================
    public static int[][] answer(int[][] data, String ext, int val_ext, String sort_by) {
        int extIdx = columnIndex(ext);
        int sortIdx = columnIndex(sort_by);

        return Stream.of(data)
                .filter(row -> row[extIdx] < val_ext)
                .sorted(Comparator.comparingInt(row -> row[sortIdx]))
                .collect(Collectors.toList())
                .toArray(new int[0][]);
    }

    private static int columnIndex(String name) {
        switch (name) {
            case "code":    return 0;
            case "date":    return 1;
            case "maximum": return 2;
            case "remain":  return 3;
            default:        throw new IllegalArgumentException("unknown column: " + name);
        }
    }
}
