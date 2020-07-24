package com.patterns.structural.flyweight;

public class Client {
    public static void main(String[] args) {

        PlayerImpl player1 = (PlayerImpl) PlayerFactory.getPlayer("101");
        player1.addGun(GunFactory.getGun(GunTypes.AK47));
        player1.addGun(GunFactory.getGun(GunTypes.CAR98));

        player1.shoot();
        player1.shoot();
        player1.reload();
        player1.swithGun();
        player1.shoot();
        player1.details();

        System.out.println("\n-------------------------***********************--------------------\n");

        PlayerImpl player2 = (PlayerImpl) PlayerFactory.getPlayer("102");
        player2.addGun(GunFactory.getGun(GunTypes.VECTOR));
        player2.addGun(GunFactory.getGun(GunTypes.AK47));
        player2.addGun(GunFactory.getGun(GunTypes.CAR98));

        player2.shoot();
        player2.shoot();
        player2.reload();
        player2.swithGun();
        player2.shoot();
        player2.reload();
        player2.swithGun();
        player2.shoot();
        player2.reload();
        player2.details();

        System.out.println("\n-------------------------***********************--------------------\n");

        System.out.println("Generating Players and Guns without flyweight pattern");

        long start = System.currentTimeMillis();
        for(int i=0;i<1000;i++){
            Player player = new PlayerImpl("1");
            Gun gun = new Gun("AK47","4.7");
        }
        long end = System.currentTimeMillis();

        System.out.println("Time Taken without using flyweight Pattern : "+ (end-start)); //4200 ms

        System.out.println("Generating Players and Guns with flyweight pattern");

        start = System.currentTimeMillis();
        for(int i=0;i<1000;i++){
            Player player = PlayerFactory.getPlayer("1");
            Gun gun = GunFactory.getGun(GunTypes.CAR98);
        }
        end = System.currentTimeMillis();

        System.out.println("Time Taken with using flyweight Pattern : "+ (end-start)); //2 ms

    }
}
