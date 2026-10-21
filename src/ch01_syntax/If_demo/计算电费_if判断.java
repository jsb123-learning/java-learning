package If_demo;

import java.util.Scanner;

public class 计算电费_if判断 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入电费；
        System.out.println("请输入电费：");
        double electricity = sc.nextDouble();
        while(electricity <= 0){
            System.out.println("不要户吊车，发电站不是为爱发电：");
            electricity = sc.nextDouble();
        }
        //计算电费；
        double electricityBill = 0;
        if(electricity <=100){
            electricityBill = electricity * 0.5;
        }else if (electricity <=200){
            electricityBill = 100 * 0.5 + (electricity - 100) * 0.8;
        }else {
            electricityBill = 100 * 0.5 + 100 * 0.8 + (electricity - 200) * 1.2;
        }
        //pay money
        System.out.println("需要支付电费：" + electricityBill);

    }
}
