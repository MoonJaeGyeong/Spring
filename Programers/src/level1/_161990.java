package level1;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.Stream;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class _161990 {

    public static void main(String[] args) {
        String[] wallpaper = {"..", "#."};
        solution(wallpaper);
    }
    public static int[] solution(String[] wallpaper) {
        int[] wall_f = new int[wallpaper.length];
        int[] wall_l = new int[wallpaper.length];

        int lux = 0;
        int rdx = wallpaper.length;
        int i = 0;

        for(String s : wallpaper){
            wall_f[i] = s.indexOf("#");
            wall_l[i] = s.lastIndexOf("#");

            if(s.indexOf("#") == -1){
                wall_f[i] = 99;
                wall_l[i] = -1;
            }
            i++;
        }
        OptionalInt min = Arrays.stream(wall_f).min();
        OptionalInt max = Arrays.stream(wall_l).max();

        for(int n=0; n<wall_f.length; n++){
            if(wall_f[n] < 99)
                break;
            lux++;
        }
        for(int n=wall_l.length-1; n>0; n--){
            if(wall_l[n] > -1)
                break;
            rdx--;
        }

        int[] answer = {lux, min.getAsInt(), rdx, max.getAsInt()+1};
        return answer;
    }

}
