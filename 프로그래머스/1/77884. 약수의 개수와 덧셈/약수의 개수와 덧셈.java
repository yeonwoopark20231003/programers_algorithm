class Solution {
    public int solution(int left, int right) {
     int answer = 0;

    for (int i = left; i <= right; i++) {
      int divisor = 1;
      for (int z = 1; z <= i/2; z++) {
        if (i % z == 0) {
          divisor++;
        }
      }
      if (divisor % 2 == 0) {
        answer += i;
      } else {
        answer -= i;
      }
    }
    return answer;
  }
}