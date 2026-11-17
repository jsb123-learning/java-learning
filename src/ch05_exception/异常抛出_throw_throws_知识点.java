public class 异常抛出_throw_throws_知识点 {
    public static void main(String[] args){
        int arr[]=null;
        try{
            getmax(arr);
        }catch (IndexOutOfBoundsException|NullPointerException exception){
            System.out.println("出错了");
        }
        System.out.println("123");
    }
    public static int  getmax(int arr[]) throws IndexOutOfBoundsException,NullPointerException{
        if(arr.length==0){
            throw  new IndexOutOfBoundsException();
        }
        if(arr == null){
            throw new NullPointerException();
        }
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=arr[0]){
                max=arr[i];
            }
        }
        return max;
    }
}
