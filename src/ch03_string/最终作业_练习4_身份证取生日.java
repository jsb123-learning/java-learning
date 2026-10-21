public class 最终作业_练习4_身份证取生日 {
    public static void main(String[] args) {
        //假设身份证
        String personId ="321104200801121224";
        //获取生日字段；
        String briY = personId.substring(6,10);
        String briM = personId.substring(10,12);
        String briD = personId.substring(12,14);
        //获取性别字段；
        String male =" ";
        if((personId.charAt(16)-'0')%2==0){
            male="female";
        }else
            male = "male";
        System.out.println("出生年月日："+briY+"年"+briM+"月"+briD+"日");
        System.out.println("性别为："+male);
    }

}
