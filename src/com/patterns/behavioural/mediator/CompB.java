package com.patterns.behavioural.mediator;

public class CompB implements Component {

    private Mediator mediator;
    String name;

    public CompB(String name,Mediator m){
        this.name=name;
        this.mediator = m;
    }

    @Override
    public void send(String msg, String user) {
        System.out.println("Sending Msg to : " + user );
        mediator.notifyuser(this.name,user,msg);
    }

    @Override
    public void recieve(String msg, String from) {
        System.out.println(this.name + " Reciving Messange");
        System.out.println(from +" : "+msg);
    }
}
