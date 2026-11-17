import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<? extends ye> arr = new ArrayList<>();
    }
    public static void test(ArrayList<zi> arr){

    }
    class ye{}
    class fu extends ye{}
    class zi extends fu{}
}
