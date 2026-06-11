package programmers.pcce1;

import java.util.Arrays;

public class P06_240601_GradeCheck {
    /*
    [PCCE 기출문제] 6번 / 가채점 비교

    문제 설명
    성적을 문의하려는 학생들의 번호가 담긴 정수 리스트 numbers,
    가채점한 점수가 문의 순서대로 담긴 정수 리스트 our_score,
    실제 성적이 번호 순서대로 담긴 정수 리스트 score_list 가 주어집니다.
    각 학생의 가채점 점수가 실제 성적과 같으면 "Same", 다르면 "Different" 를 반환하세요.

    제한사항
    - 1 ≤ numbers 길이 = our_score 길이 ≤ 10
    - 1 ≤ numbers 의 원소 ≤ 31, numbers 는 중복 원소 없음
    - 0 ≤ our_score 의 원소 ≤ 100
    - 2 ≤ score_list 길이 ≤ 31, 0 ≤ score_list 의 원소 ≤ 100
    - score_list 는 [1번 학생 성적, 2번 학생 성적, ...] 순서

    입출력 예
    numbers   our_score   score_list                        result
    [1]       [100]       [100,80,90,84,20]                 ["Same"]
    [3,4]     [85,93]     [85,92,38,93,48,85,92,56]         ["Different","Same"]

    주어진 코드 (원본 C++) - 비교 한 줄에 버그가 있음
    if (our_score[i] == score_list[i]) { ... }   // 버그
    */

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                solution(new int[]{1}, new int[]{100}, new int[]{100, 80, 90, 84, 20})));
        System.out.println(Arrays.toString(
                solution(new int[]{3, 4}, new int[]{85, 93},
                        new int[]{85, 92, 38, 93, 48, 85, 92, 56})));
    }

    // ===== 내 풀이 =====
    public static String[] solution(int[] numbers, int[] our_score, int[] score_list) {
        // TODO: 직접 풀어보세요.
        return null;
    }


    // ============================================================
    // ===== 정답 코드 (스스로 풀어본 뒤 확인하세요) =====
    // ============================================================
    public static String[] answer(int[] numbers, int[] our_score, int[] score_list) {
        int n = numbers.length;
        String[] result = new String[n];

        for (int i = 0; i < n; i++) {
            int realScore = score_list[numbers[i] - 1];
            result[i] = (our_score[i] == realScore) ? "Same" : "Different";
        }
        return result;
    }
}
