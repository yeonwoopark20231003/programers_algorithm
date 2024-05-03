class Solution {
    public long solution(int price, int money, int count) {
        long answer = money;


    for(int i=1; i<=count; i++){
      answer -= (long) i *price;
    }

    if (answer<0){
      answer = answer*-1;
    }else {
      return answer=0;
    }

    return answer;
  }
}
