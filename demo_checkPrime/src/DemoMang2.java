public class DemoMang2 {
    public static void main(String[] args) {
        int a1[] = new int[3];
        int a2[] = a1;
        a2[1] = 100;

        System.out.println(a1[1]);
    }
}
