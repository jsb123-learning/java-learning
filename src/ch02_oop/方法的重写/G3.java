package 方法的重写;

import java.net.SocketOption;

public class G3 extends G2{
    @Override
    public void call() {
        System.out.println("G3 call");
    }

    public void game(){
        System.out.println("G3 game");
    }
}
