package com.springapp.mvc.easyBean;

/**
 * Created by xuc on 2018/1/7.
 * 勇士
 */
public class Braves{
    public IArms arms;

    public Braves(IArms arms) {
        System.out.println("braves 带参构造");
        this.arms = arms;
    }

    public Braves() {
        System.out.println("braves 默认构造");
    }

    public IArms getArms() {
        return arms;
    }

    public void setArms(IArms arms) {
        this.arms = arms;
    }
}
