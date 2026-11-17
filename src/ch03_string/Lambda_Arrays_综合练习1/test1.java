package Lambda_Arrays_综合练习1;

import java.util.ArrayList;
import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {
        girlFriends gf = new girlFriends("alice", 180, 180);
        girlFriends gf1 = new girlFriends("bowen", 17, 160);
        girlFriends gf2 = new girlFriends("cindy", 16, 170);
        girlFriends gf3 = new girlFriends("dany", 18, 180);
        //定义数组
        girlFriends arr[] = {gf, gf1, gf2, gf3};
        //根据年龄排序
        Arrays.sort(arr, (age1, age2) -> {
            int temp = age1.getAge() - age2.getAge();
            if (temp == 0) {
                temp = (int) age1.getTail() - age2.getAge();
                if (temp == 0) {
                    return age1.getName().compareTo(age2.getName());
                }
            }
            return temp;
        });
        //遍历数组

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getName() + " " + arr[i].getAge() + " " + arr[i].getTail());
        }
    }
}
