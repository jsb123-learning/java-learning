package 学生大学生涯;

public class self {
        public static void main(String[] args) {
            //大一状况
            Student s =new Student();
            s.setName("张三");
            s.setAge(18);
            s.setHeight(183);
            s.setWeight(60);
            System.out.println("大一"+s.getName()+" "+s.getAge()+"身高："+s.getHeight()+"体重："+s.getWeight());
            s.study();
            //
            s.setName("张三");
            s.setAge(s.getAge()+1);
            s.setHeight(s.getHeight());
            s.setWeight(s.getWeight()+10);
            System.out.println("大二"+s.getName()+" "+s.getAge()+"身高："+s.getHeight()+"体重："+s.getWeight());
            //
            s.setName("张三");
            s.setAge(s.getAge()+1);
            s.setHeight(s.getHeight()+2);
            s.setWeight(s.getWeight()-3);
            System.out.println("大三"+s.getName()+" "+s.getAge()+"身高："+s.getHeight()+"体重："+s.getWeight());
        }
    }


