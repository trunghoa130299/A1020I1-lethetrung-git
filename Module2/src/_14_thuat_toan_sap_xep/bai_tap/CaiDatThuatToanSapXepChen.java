package _14_thuat_toan_sap_xep.bai_tap;

import java.util.Arrays;

public class CaiDatThuatToanSapXepChen {
    public static int [] insertionSort(int[] list){
        for (int i =1 ;i < list.length;i++){
            int insert = list[i];
            int j;
            for (j =i-1;j>=0;j--){
                if (insert < list[j]){
                    list[j +1] = list[j];
                }else {
                    break;
                }
            }
            list[j+1]=insert;
        }
        return list;
    }

    public static void main(String[] args) {
        int [] list = {1,4,7,2,3,5,9,10};
        System.out.println(Arrays.toString(insertionSort(list)));
    }
}
