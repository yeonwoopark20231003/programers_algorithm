class Solution {
    public String solution(String phone_number) {
       int phoneNumberLength = phone_number.length()-4;
    String answer = "";
    for (int i=0; i< phoneNumberLength ;i++){
     answer = new StringBuilder(answer).append("*").toString();
    }

    for (int i=0; i<4; i++){
      int startingPoint = phoneNumberLength + i;
      answer = new StringBuilder(answer).append(phone_number.charAt(startingPoint)).toString();
    }

    return answer;
    }
}
