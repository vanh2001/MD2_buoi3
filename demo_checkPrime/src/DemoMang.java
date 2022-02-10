public class DemoMang {
    public static void main(String[] args) {
        // Khai báo:
        //C1: <Kiểu dữ liệu của mảng> [] tenMang;
        //C2: <Kiểu dữ liệu của mảng> tenMang[];
        int[] a1;
        int a2[];

        //Khởi tạo mảng:
        //tenMang = new <Kieu du lieu>[so luong phan tu];
        a1 = new int[3];
        a2 = new int[5];

        //Khai báo và khởi tạo mảng:
        //Cấp phát vùng nhớ cho n phần tử
        //Đặt tên địa chỉ của vùng nhớ đó là tên biến mảng
        int a3[] = new int[6];

        System.out.println(a1[0]);
    }
}
