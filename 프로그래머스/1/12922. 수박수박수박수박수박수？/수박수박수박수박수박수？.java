class Solution {
    public String solution(int n) {
  String answer = "";
    String su = "수";
    String bak = "박";

    for (int i=0; i<n/2; i++){
      answer += su + bak;
    }

    if (n %2==1){
      answer +=su;
    }

    return answer;
  }
}