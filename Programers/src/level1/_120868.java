package level1;

public class _120868 {

    public static void main(String[] args) {
        int[] sides = {1,2};
        solution(sides);
    }
    public static int solution(int[] sides) {
        int answer = 0;
        int sum = 0, max = 0;
        int min = 0;

        for(int i : sides){
            sum += i;
            if(i > max) {
                min = max;
                max = i;
            }
        }

        answer += sum - max - 1;
        answer += 2*max -min +1;

        return answer = (sum-max == 1) ? 1 : answer;
    }

}
