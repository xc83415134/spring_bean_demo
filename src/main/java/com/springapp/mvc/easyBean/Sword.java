package com.springapp.mvc.easyBean;

/**
 * Created by xuc on 2018/1/7.
 * 宝剑
 */
public class Sword implements IArms{
    private boolean light;
    public Sword(){
        light = true;
        System.out.println("sword 默认构造");
    }

    public boolean isLight() {
        return light;
    }

    public void setLight(boolean light) {
        this.light = light;
    }
}
