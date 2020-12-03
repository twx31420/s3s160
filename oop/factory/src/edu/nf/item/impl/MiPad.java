package edu.nf.item.impl;

import edu.nf.item.Pad;

public class MiPad  extends Pad {
    @Override
    public void read() {
        System.out.println("使用小米的平板阅读");
    }

    @Override
    public void play() {
        System.out.println("使用小米的平板玩游戏");
    }
}
