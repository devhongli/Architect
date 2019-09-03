package com.pattern.V4proxy.jdk;

import com.pattern.V4proxy.staticed.Person;

public class GuanYu implements Person {
    @Override
    public void findJob() {
        System.out.println("要求：自由、轻松");
    }

    @Override
    public void shoping() {
        System.out.println("好看");
    }

    @Override
    public void findLove() {
        System.out.println("漂亮");
    }
}
