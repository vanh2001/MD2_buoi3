public class Main {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        a = deleteElement(a, 3);
    }
    public static int[] deleteElement(int arr[], int element){
        int newArr[] = new int[arr.length - 1];
        int check = isExist(arr, element);
        if (check == -1){
            System.out.println("Không có phần tử nào để xóa!");
            return arr;
        }else {
            for (int i = 0; i < check; i++) {
                newArr[i] = arr[i];
            }
            for (int i = check; i < arr.length - 1; i++) {
                newArr[i] = arr[i + 1];
            }
            for (int i = 0; i < newArr.length; i++) {
                System.out.println(newArr[i]);
            }
            return newArr;
        }
    }
    public static int isExist (int arr[], int element){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == element){
                return i;
            }
        }
        return -1;
    }
}
