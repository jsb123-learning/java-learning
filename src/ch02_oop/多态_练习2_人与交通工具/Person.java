package 多态_练习2_人与交通工具;

public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void travel(Transportation t) {
        t.move();
        System.out.println(this.name + " traveling by " + t.getLogo() + " at speed " + t.getSpeed() + " ");
        //判断实例是不是Bicycle，是的话就调用bicycleRing方法
        if(t instanceof Bicycle){
            Bicycle b = (Bicycle)t;
            b.bicycleRing();
        }else if(t instanceof Car){
            //判断实例是否是Car，是的话就调用carHonk方法
            Car c = (Car)t;
            c.carHonk();
        }
    }
}
