package leveltwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FunctionDevelopment {

    public static void main(String[] args) {
        int[] progresses = {20, 99, 93, 30, 55, 10};
        int[] speeds = {5, 10, 1, 1, 30, 5};

        System.out.println(Arrays.toString(solution(progresses, speeds)));
    }

    private static int[] solution(int[] progresses, int[] speeds) {
        int[] timeTakenArray = new int[progresses.length];
        List<Integer> answerList = new ArrayList<>();

        for(int i = 0; i < progresses.length; i++) {
            int timeTaken = (int) Math.ceil((100 - progresses[i]) / (speeds[i] * 1.0));
            timeTakenArray[i] = timeTaken;
        }

        int cnt = 1;
        int baseTimeTaken = timeTakenArray[0];
        for(int i = 1; i < timeTakenArray.length; i++) {
            if(baseTimeTaken >= timeTakenArray[i]) {
                cnt++;
            } else {
                answerList.add(cnt);
                cnt = 1;
                baseTimeTaken = timeTakenArray[i];
            }

            if(i == timeTakenArray.length - 1) {
                answerList.add(cnt);
            }
        }

        int[] answer = new int[answerList.size()];
        for(int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}
