public class DemoMang3 {
    public static void main(String[] args) {
//        int a1[] = new int[3];
//        changePoint(a1, 2, 90);
//        System.out.println(a1[2]);

        int a = 3, b = 4;
        getSum(a, b);
        System.out.println(a);
    }

    //Phương thức thay đổi điểm tại vị trí index của mảng
    //tên phương thức: changePoint
    //Tham số: 1 mảng, index, giá trị mới
    //Dữ liệu trả về: void - không trả về
    //Thân hàm: Gán lại
    public static void changePoint (int a[], int index, int newValue){
        a[index] = newValue;
    }

    //Phương thức tính tổng 2 số
    public static void getSum (int a, int b){
        a = a + b;
        System.out.println(a);
    }
}
