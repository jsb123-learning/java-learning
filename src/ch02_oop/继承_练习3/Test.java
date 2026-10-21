package 继承_练习3;

public class Test {
    public static void main(String[] args) {
        HotDishes hotDishes = new HotDishes("宫保鸡丁", 20, "麻辣", 30);
        hotDishes.detail();
        ColdDishes coldDishes = new ColdDishes("凉拌黄瓜", 10, "酸爽", 30);
        coldDishes.detail();
    }
}
