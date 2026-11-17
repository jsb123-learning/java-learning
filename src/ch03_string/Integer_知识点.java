public class Integer_知识点 {
    public static void main(String[] args) {
        //构造方法
        //Integer i = new Integer(10); 已经移除
        //静态方法
        //当方法被加载到内存的时候会提前创建-128-127之间的所有数据的对象，放到一个数组（Integer常量池）中
        //若是创建的对象在这个池子中，则直接从数组中获取，
        //否则，就创建一个新的对象
        Integer i =Integer.valueOf(777);//777不在所以，创建新的对象内存地址不一样
        Integer i2 =Integer.valueOf("777");
        System.out.println(i==i2);
        //直接赋值
        Integer i1 =10;
        System.out.println(i1);

    }
}
