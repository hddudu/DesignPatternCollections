package factory2.prod;

import factory2.interf.Weapon;

public class Pistol implements Weapon {

    @Override
    public void shoot() {
        System.out.println("我是一把小手枪，正准备向你开火.");
    }

}
