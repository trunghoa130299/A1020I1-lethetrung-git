package _03_mang_va_phuong_thuc_trong_java.thuc_hanh;

public class TimGiaTriNhoNhatTrongMangSuDungPhuongThuc {
    public static int minValue(int[] arr){
        return -1;
    }
    public static void main(String[] args) {
            int []arr = {4, 12, 7, 8, 1, 6, 9};
            int index = minValue(arr);
            System.out.println("The smallest element in the array is: " + arr[index]);
        }
    }
