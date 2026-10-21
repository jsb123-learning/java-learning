package 多态_练习1_初步了解;

public class Person {
    private String name;
    private int id;
    private int passwd;

    public Person() {
    }

    public Person(String name, int id, int passwd) {
        this.name = name;
        this.id = id;
        this.passwd = passwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPasswd() {
        return passwd;
    }

    public void setPasswd(int passwd) {
        this.passwd = passwd;
    }

    public void work(){
        System.out.println("work");
    }
}
