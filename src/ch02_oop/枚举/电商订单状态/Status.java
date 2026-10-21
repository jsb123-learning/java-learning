package 枚举.电商订单状态;

public enum Status  {
    //这是对象，列举好的对象！！！！！
    LOADING_PAY("加载支付",1),
    IN_WORK("处理中",2),
    SENDED("已发送",3),
    RE_LOADING("重新加载",4),
    OVER("完成",5),
    CANCEL("取消",6);
    //属性：对象的名称、编号
    private String name; //对象的名称
    private int num; //对象的编号
    private Status(){
    }
    //私有化构造方法，防止外部通过new创建对象
    private Status(String name,int num){
        this.name=name;
        this.num=num;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
