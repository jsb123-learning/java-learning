package Switch_demo;

public class Switch新特性 {
    public static void main(String[] args) {
        //箭头标签；
        int number = 1;
        switch (number) {
            case 1 -> System.out.println("星期一");
            case 2 -> System.out.println("星期二");
            case 3 -> System.out.println("星期三");
            case 4 -> System.out.println("星期四");
            case 5 -> System.out.println("星期五");
            case 6 -> System.out.println("星期六");
            case 7 -> System.out.println("星期日");
            default -> System.out.println("输入错误");
        }
        //case后可以写多个值
        int number2 = 10;
        switch (number2) {
            case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 -> System.out.println("输入正确");
            default -> System.out.println("输入错误");
        }
        //switch结果yield(yield可以省略2)
        int number3 = 1;
        String day = switch (number3) {
            case 1 -> {
                yield "星期一";
            }
            case 2 -> "星期二";
            case 3 -> "星期三";
            case 4 -> "星期四";
            case 5 -> "星期五";
            case 6 -> "星期六";
            case 7 -> "星期日";
            default -> "输入错误";
        };
        System.out.println(day);
    }
}
