#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

long solution(int price, int money, int count) {
    long answer = money;
    
    for(int i=1; i<=count; i++){
        answer -= price*i;
    }
    
    if(answer<0){
        answer = answer *-1;
    } else{
        answer =0;
    }
    
    return answer;
}
