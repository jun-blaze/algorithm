package programmers.lessons2;

import java.util.HashMap;

public class P94_250511_ModeValue {
    /*
    문제 설명
    최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
    정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요.
    최빈값이 여러 개면 -1을 return 합니다.

    제한사항
    - 0 < array의 길이 < 100
    - 0 ≤ array의 원소 < 1000

    입출력 예
    array                  result
    [1, 2, 3, 3, 3, 4]     3
    [1, 1, 2, 2]          -1
    [1]                   1

    입출력 예 설명
    예 #1: 3이 세 번으로 가장 많음
    예 #2: 1과 2가 각각 두 번 → 최빈값 여러 개 → -1 반환
    예 #3: 하나뿐인 1 → 최빈값은 1

    ※ 공지 - 2022년 10월 17일 제한 사항 및 테스트케이스가 수정되었습니다.
    */

    public static void main(String[] args) {
        P94_250511_ModeValue solution = new P94_250511_ModeValue();

        // 테스트 케이스
        System.out.println("Test Case 1 - Expected: 3");
        int result1 = solution.solution(new int[]{1, 2, 3, 3, 3, 4});
        System.out.println("Result: " + result1);

        System.out.println("\nTest Case 2 - Expected: -1");
        int result2 = solution.solution(new int[]{1, 1, 2, 2});
        System.out.println("Result: " + result2);

        System.out.println("\nTest Case 3 - Expected: 1");
        int result3 = solution.solution(new int[]{1});
        System.out.println("Result: " + result3);
    }

    public int solution(int[] array) {
        int answer = 0;
        // 0. 배열의 원소가 1개뿐이라면 1을 바로 리턴
        // 1. 배열을 순회하며 해당 숫자와, 카운트를 같이 저장, 만약 이전에 저장된값이라면 count ++ ,
        //      아니라면 해당숫자 : 카운트 0 으로 저장. > 2차원 배열 이용 > 2차원배열대신 해쉬맵 HashMap<Integer,Integer> 이용으로변경함 더나은자료구조
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : array){
            map.put(num, map.getOrDefault(num,0) + 1);
        }

        int maxCount = 0;
        int modeValue = -1 ; // 최빈값, 초기값 -1로 설정
        boolean isMultiple = false;

        // 순회하며 최빈값을 찾기.
        for (int key : map.keySet()) {

            if (map.get(key) > maxCount) {
                modeValue = key;
                maxCount = map.get(key);

            } else if (maxCount == map.get(key)) {
                isMultiple = true;

            }

        }
        answer = isMultiple ? -1 : modeValue;
        // 2. 배열을 순회하며 각 숫자의 카운트 증가
        // 3. 결과 배열들의 카운트 비교하여, 같은게 있다면, -1 , 같은게 없다면 : 해당 카운트 리턴 ,
        return answer;
    }
}
