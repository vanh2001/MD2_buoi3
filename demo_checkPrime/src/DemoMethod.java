public class DemoMethod {
    public static void main(String[] args) {
        //Lời gọi hàm phải truyền đúng danh sách tham số
        boolean a = checkPrime(5);
    }

//    hàm kiểm tra số nguyên tố
//    1. Tên hàm(checkPrime)
//    2. Tham số (int n) có kiểu dữ liệu trả vè cho tham số
//    3. Kiểu trả về (boolean)
//    4. Thân hàm (Cách triển khai hàm đó ntn)
    public static boolean checkPrime (int n){
        if (n <= 1) return false;
        if (n <= 3) return true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i ==0) return false;
        }
        return true;
    }
//    public static void checkPrime1 (int n){
//        System.out.println(n);
//    }
}
