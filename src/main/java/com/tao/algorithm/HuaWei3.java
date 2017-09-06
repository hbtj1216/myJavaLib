import java.util.Scanner;

/**
 * Created by tao on 2017/9/6.
 */
public class HuaWei3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //n个人
        int m = sc.nextInt();   //m个龙头

        int[] w = new int[n];            //w[i]表示每一个人的接酒量
        int[] bearArray = new int[m];    //beer[i]表示每个龙头

        for(int i = 0; i < w.length; i++) {
            w[i] = sc.nextInt();
            //先让前m个人去接酒
            if(i < m) {
                bearArray[i] = w[i];
            }

        }

        int times = 0;
        //如果没有完全接完，则继续
        while(notOver(bearArray)) {
            int min = getMin(bearArray);    //当前接酒人中最小的接酒量
            times += min;
            for(int j = 0; j < bearArray.length; j++) {
                //经过min时间
                bearArray[j] -= min;
                if(bearArray[j] ==0 &&  m < w.length) {
                    bearArray[j] = w[m];    //下一个未接酒的人来顶替空闲龙头
                    m++;
                }
            }
        }

        System.out.println(times);
    }


    //判断是否还有人在接酒
    public static boolean notOver(int[] beerArray) {

        for(int i = 0; i < beerArray.length; i++) {
            //如果有一个人还没有接完酒
            if(beerArray[i] > 0) {
                return true;
            }
        }
        return  false;
    }


    //找到当前正在接酒的最小的接酒量
    public static int getMin(int[] beerArray) {

        int min = 100;
        for(int i = 0; i < beerArray.length; i++) {
            if(beerArray[i] > 0 && min > beerArray[i]) {
                min = beerArray[i];
            }
        }
        return min;
    }
}







