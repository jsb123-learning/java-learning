package 继承_练习4;

public class Test {
    public static void main(String[] args) {
        Goods goods = new Goods("jj", 1000.0);
        goods.showinfo();
        Clothes clothes = new Clothes("shirt", 200.0, "M", "red");
        clothes.showinfo();
        Ele ele = new Ele("computer", 3000.0, "Dell", "laptop");
        ele.showinfo();
    }
}
