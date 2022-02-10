public class DemoAdd2 {
    public static void main(String[] args) {
        int a[] = {3,4,5,6};
        a = addElement(a, 100);
        //C1; Dùng for
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
        //C2: Dùng foreach
        for (int element: a) {
            System.out.println(element);
        }
    }

    //Viết phương thức thêm mới phần tử vào mảng
    //Kiểu dữ liệu trả về phải là mảng
    //Tham số: 1 mảng và 1 số mới
    //Tên phương thức: addElement
    //Phần thân:
    public static int[] addElement(int arr[], int newE){
        int newArr[] = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[newArr.length - 1] = newE;
        return newArr;
    }
}
