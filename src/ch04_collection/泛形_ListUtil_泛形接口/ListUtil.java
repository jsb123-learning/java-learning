package 泛形_ListUtil_泛形接口;

public class ListUtil<E> implements ListUtilInterface<E>{
    public ListUtil(){}

    @Override
    public void Printsb(E e) {
        System.out.println(e);
    }
}
