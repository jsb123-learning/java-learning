package 静态修饰;

public class Student {
   private String name;
   private int age;
   private static String teacher;
   //
   public Student(){

   }
   public Student(String name,int age){

   }
   //直接通过类名访问静态变量
   public  static void setTeacher(String teacher){
       Student.teacher=teacher;
   }
   //更换静态变量
   public static  void change(String teacher){
       Student.teacher=teacher;
   }
   public String getTeacher(){
       return teacher;
   }
   public void setName(String name){
       this.name=name;
   }
   public String getName(){
       return name;
   }

}
