import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by tao on 2017/9/6.
 */
public class Huawei2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();

        if(M <= 1 || M > 100) {
            System.out.println("ERROR");
            return;
        }

        List<Integer> peopleList = new ArrayList<>();
        for(int i = 1; i <= 100; i++) {
            peopleList.add(i);
        }

        int index = 0;
        int num = 1;
        while(peopleList.size() >= M) {
            if(num % M == 0) {
                peopleList.remove(index);
                index--;
            }

            index++;
            num++;

            if(index > peopleList.size()-1) {
                index = 0;
            }
        }

        for(int i = 0; i < peopleList.size(); i++) {
            System.out.print(peopleList.get(i));
            if(i < M-2) {
                System.out.print(",");
            }
        }
    }
}




