class Solution {
    public long solution(int price, int money, int count) {
        long answer = money;


    for(int i=1; i<=count; i++){
      answer -= (long) i *price;
    }

    return answer<0? -answer : 0;
  }
}

