public class task2 {
    public static void main(String[] args) {
        int a=5;
        main2(a);
    }

    public static void main2(int numb) {
        for (int i=1;i<=numb;i++){
            for (int j=1;j<=numb;j++){
                System.out.print(".");
            }
            System.out.println();
        }
    }
}
