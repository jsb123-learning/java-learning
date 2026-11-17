public class Lambda_Arrays_综合练习2_不死神兔 {
    public static void main(String[] args) {
        System.out.println(born(6));
    }
    public static int born(int mouth){
        if(mouth==1||mouth==2){
            return 1;
        }
        return born(mouth-1)+born(mouth-2);
    }
}

