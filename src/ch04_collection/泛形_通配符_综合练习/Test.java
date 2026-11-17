package 泛形_通配符_综合练习;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //泛形不具备继承性，但是数据具备继承性
        ArrayList<animal> arr = new ArrayList<>();
        hashky has = new hashky();
        tidy t = new tidy();
        colorCat cc = new colorCat();
        posiCat pc = new posiCat();
        //但是数据具备继承性
        arr.add(has);

        keepPets(arr);
    }
    ////////////////////////////////////////////泛形不具备继承性
    public static void keepPets(ArrayList<?extends animal> arr){
        arr.forEach(animal::eat);
    }
}
