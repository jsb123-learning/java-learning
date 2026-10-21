package 继承_ITheima;

public class Test {
    public static void main(String[] args) {
        Phone p =new Phone();
        //iPhone show
        iPhone i = new iPhone();
        i.price=9999;
        i.logo="Apple";
        System.out.println(i.logo+"\t"+i.price);
        p.function(i);
        //ad show
        adPhone ad= new adPhone();
        ad.price=8888;
        ad.logo="Huawei";
        System.out.println(ad.logo+"\t"+ad.price);
        ad.NFC();
        p.function(p);

        //bookPad show
        bookPad b = new bookPad();
        b.price=7777;
        b.logo="lenovo";
        System.out.println(b.logo+"\t"+b.price);
        b.Coding();
    }
}
