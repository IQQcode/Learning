package sort;


/**
 * @Author: Mr.Q
 * @Date: 2020-04-09 16:20
 * @Description:鸡尾酒双向排序
 */
public class CocktailSort {
    public static int[] cocktailSort(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            boolean flag = false;
            //奇数轮,从左向右比较交换
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    //此趟排序没有进行数值交换
                    flag = true;
                }
            }
            //在一趟排序中没有发生过交换
            if (!flag)
                break;


            //偶数轮,从右向左比较交换
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    //此趟排序没有进行数值交换
                    flag = true;
                }
            }
            //在一趟排序中没有发生过交换
            if (!flag)
                break;
        }
        return arr;
    }
}
