package 综合练习_TreeSet_成绩排序;

import java.util.Comparator;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Student s= new Student("001",18,100,96,97);
        Student s1= new Student("002",18,99,96,97);
        Student s2= new Student("003",18,95,96,97);
        Student s3= new Student("004",18,95,96,97);
        Student s4= new Student("005",18,100,96,97);
        TreeSet<Student> ts =new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                int sum = student.getLanguage()+student.getMath()+student.getEnglish();
                int sum1 =t1.getLanguage()+student.getMath()+student.getEnglish();
                int result =sum-sum1;
                if(result==0){
                    result=student.getLanguage()-t1.getLanguage();
                    if(result==0){
                        result=student.getMath()-t1.getMath();
                        if(result==0){
                            result=student.getEnglish()-t1.getEnglish();
                            if(result==0){
                                result=student.getAge()-t1.getAge();
                                if(result==0){
                                    char arr[]=student.getName().toCharArray();
                                    char arrt1[]=t1.getName().toCharArray();
                                    int i=0;
                                    while (result==0&&i<arr.length){
                                        result=arr[i]-arrt1[i];
                                        i++;
                                    }
                                }
                            }                        }
                    }
                }
                return result*-1;
            }
        });
        ts.add(s);
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        for (Student t : ts) {
            System.out.println(t);

        }
    }
}
