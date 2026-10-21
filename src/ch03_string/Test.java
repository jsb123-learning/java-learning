public class Test {
    public static void main(String[] args) {
        String str = "abcdefg";
        // 是否包含某段字符串（需要是连续的字符）
        boolean b = str.contains("abc");//返回 ture （返回值是布尔类型的）
                                       // "abd" 返回 false

        //判断开头是否包含某段字符串  返回值 布尔类型
        b = str.startsWith("bcd",1); // 1 表示从索引位置开始查找
        //判断结尾是否包含某段字符串
        b= str.endsWith("efg");

        //查找字符第一次出现的索引 返回值 索引位置 查找内容不存在则会返回-1
        int i = str.indexOf('a');
        //查找字符最后一次出现的索引 返回值 索引位置 查找内容不存在则会返回-1
        i = str.lastIndexOf('f');

        //判断字符串是否为空
        b= str.isEmpty();

        //将当前字符串转成字符数组
        char a[] = str.toCharArray();

        //大小写转换         返回值 字符串
        str=str.toUpperCase();
        str=str.toLowerCase();
        System.out.println(str);

        //去除头尾空格       返回值 字符串
        str=str.trim();


    }
}
