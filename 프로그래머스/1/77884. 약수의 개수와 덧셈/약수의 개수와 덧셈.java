class Solution {
    public int solution(int left, int right) {
    int answer = 0;

    for(int i =left; i<=right; i++){
      int numOfDivisor = 1;
      for(int x = 1; x<=i/2 ; x++){
        if(i%x ==0){
          numOfDivisor ++;
        }
      }

      if(numOfDivisor%2==0){
        answer += i;
      }else{
        answer -=i;
      }
    }

    return answer;
  }
}