class Solution {
   public long solution(int a, int b) {
        long answer = 0;
        int betweenNum = 0;

        if (a == b) {
            answer = a;
        } else if (b > a) {
            answer = a + b;
            betweenNum = b - 1;
            while (betweenNum > a) {
                answer += betweenNum;
                betweenNum -= 1;
            }
        } else {
            answer = a + b;
            betweenNum = a - 1;
            while (betweenNum > b) {
                answer += betweenNum;
                betweenNum -= 1;
            }
        }
        return answer;
    }
}