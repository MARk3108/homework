public class task1 {
    public static void main(String[] args) {
        String s="Строка";
        int numb=5;
        main2(s,numb);
    }

    public static void main2(String s,int numb) {
        for (int i=1;i<=2*numb;i++){
            System.out.println(i+"-"+s);
        }
    }
}
