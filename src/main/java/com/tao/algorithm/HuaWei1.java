import java.util.Scanner;

/**
 * Created by tao on 2017/8/27.
 */
public class HuaWei1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String inStr = sc.nextLine();

        if(inStr == null || inStr.length() == 0) {
            System.out.println("");
            return;
        }

        char[] array = inStr.toCharArray();

        String str = "";
        for(int i = 0; i < array.length; i++) {
            if(array[i] < '0' || array[i] > '9') {
                str = str + "#";
            } else {
                str = str + array[i];
            }
        }

        String[] strArray = str.split("#+");

        if(strArray.length == 0) {
            System.out.println(0);
            return;
        }

        String maxStr = strArray[0];
        int maxLen = strArray[0].length();
        for(int i = 1; i < strArray.length; i++) {
            if(strArray[i].length() >= maxLen) {
                maxStr = strArray[i];
                maxLen = strArray[i].length();
            }
        }
        System.out.println(maxStr);
        System.out.println(maxLen);

    }



}


