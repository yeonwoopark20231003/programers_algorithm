class Solution {
   
    public int solution(long num) {
        int answer = 0;
        long newNum =num;

        if (num != 1 ){
            while (newNum != 1){
                if (newNum %2 ==0){
                    newNum /=2;
                } else {
                   newNum = newNum*3 +1;
                }
                System.out.println("newNum ="+newNum);
                System.out.println("answer="+ ++answer);

            }
        }   if (answer>=500){
            answer = -1;
        }

        return answer;
    }
}