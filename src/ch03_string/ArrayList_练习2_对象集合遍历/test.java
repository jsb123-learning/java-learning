package ArrayList_练习2_对象集合遍历;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        Student s1 = new Student(1,"zhangsan",18);
        Student s2 = new Student(2,"lisi",19);
        Student s3 = new Student(3,"wangwu",20);
        al.add(s1);
        al.add(s2);
        al.add(s3);
        for (int i = 0; i < al.size(); i++) {
            System.out.println("id:"+al.get(i).getId()+" \tname:"+al.get(i).getName()+"\t\tage:"+al.get(i).getAge());
        }
        //输入id
        System.out.println("please enter the student id:");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        id=searchYourmtfk(al,id);
        if(id>=0) {
            System.out.println("id:" + al.get(id).getId() + " \tname:" + al.get(id).getName() + "\t\tage:" + al.get(id).getAge());
        }else{
            System.out.println("Not,found");
        }



    }
    public static int searchYourmtfk(ArrayList<Student> al,int id){
        for (int i = 0; i < al.size(); i++) {
            if(al.get(i).getId()==id){
                return i;
            }
        }
        return -1;
    }
}
