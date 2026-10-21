package 多态_练习1_初步了解;

import javax.sound.midi.Soundbank;

public class Admin extends Person{
    public Admin() {
    }

    public Admin(String name, int id, int passwd) {
        super(name, id, passwd);
    }

    @Override
    public void work() {
        System.out.println("manage");
    }
}
