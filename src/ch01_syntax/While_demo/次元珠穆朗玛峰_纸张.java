package While_demo;

public class 次元珠穆朗玛峰_纸张 {
    public static void main(String[] args) {
        int tail = 88488600;
        int paper = 1;
        int time = 0;
        while (paper < tail){
            paper = paper * 2;
            time ++;
        }
        System.out.println("需要" + time + "次");
    }
}
