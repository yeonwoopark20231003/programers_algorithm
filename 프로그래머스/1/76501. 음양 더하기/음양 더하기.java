class Solution {
  public int solution(int[] absolutes, boolean[] signs) {
    int answer = 0;

    for(int i=0; i< absolutes.length; i++){
      int num = 0;
      if (signs[i]){
        num = absolutes[i];
      } else {
        num = absolutes[i]-(absolutes[i]*2);
      }
      answer += num;
    }

    return answer;
    }
}