class Solution {

    public static int[] solution(int[] arr) {
      int min = arr[0];
      for (int i = 1; i < arr.length; i++) {
        min = Math.min(arr[i], min);
      }
      System.out.println(min);

      int[] answer = new int[arr.length == 1 ? 1 : arr.length-1];

      if (arr.length == 1) {
        answer[0] = -1;
      } else {
        int idx=0;
        for (int i = 0; i < arr.length; i++) {
          if (arr[i] == min) {
            continue;
          } else {
            answer[idx++] = arr[i];
          }
        }
      }

      return answer;
    }
  }