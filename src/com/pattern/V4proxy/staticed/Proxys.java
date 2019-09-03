package com.pattern.V4proxy.staticed;

public class Proxys {
    private Person person;

    //拿到第代理对象
    public Proxys(Person person){
        this.person = person;
    }

    public void findJob(){
        System.out.println("根据要求找工作");
        this.person.findJob();
        System.out.println("已找到工作");
    }

}
