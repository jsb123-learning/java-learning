package 枚举.电商订单状态;

public enum Weekends {
    //列举对象
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);
    //属性：对象的编号，对应第几天
    int num;
    //私有化构造方法,仅限本类使用
    private Weekends(){
    }
    private Weekends(int num){
        this.num=num;
    }
    public int getNum(){
        return num;
    }
    public void setNum( int num){
        this.num = num;
    }
}

