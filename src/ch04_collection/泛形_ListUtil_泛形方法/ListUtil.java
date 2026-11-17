package 泛形_ListUtil_泛形方法;

import java.util.ArrayList;

public class ListUtil {
    private ListUtil(){};
    public static<E> void addAll(ArrayList<E> list,ArrayList<E> copyList){
        copyList.forEach(E->{
            list.add(E);
        });
    }
    public static <E> void addAll(ArrayList<E> list,E...e){
        for(E element:e){
            list.add(element);
        }
    }
}
