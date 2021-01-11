package _02_vong_lap_trong_java.bai_tap;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        int i,num=2,count = 0;
        boolean check=true;
        while (count<20){
            for ( i=2;i<num;i++){
                if (num %i ==0){
                    check =false;
                    break;
                }
            }
            if (check){
                System.out.println(num);
                count++;
            }
            check = true;
            num++;
        }
    }
}
