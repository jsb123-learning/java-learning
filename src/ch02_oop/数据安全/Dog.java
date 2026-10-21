package 数据安全;

import com.sun.tools.attach.AgentInitializationException;

public class Dog {
    private String name;
     private int  age;
public void setAge(int value){
    if (value<=0){
        System.out.println("年龄设置错误");
    }else age=value;
    }
public void setName(String value){
    name=value;
}
public String getName(){
    return name;
}
public int getAge (){
return age;
}
public void eat(int age,String name){
    System.out.println("狗的名字是"+name+"年龄是"+age+"在吃骨头");
}


}
