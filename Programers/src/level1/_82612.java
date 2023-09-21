package level1;

public class _82612 {
    public static void main(String[] args) {
        int price = 3;
        int money = 20;
        int count = 4;
        solution(price,money,count);

    }

    public static long solution(int price, int money, int count) {
        long answer = money;
        for(int i=1; i<=count; i++){
            answer = answer - price*i;
        }
        if(answer > 0)
            return 0;
        else
            answer = Math.abs(answer);

        return answer;
    }

}
