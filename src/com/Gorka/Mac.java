package com.Gorka;

public class Mac{

    public Mac(){
        Ordenadores mac = new Ordenadores(2048,512);

        System.out.println(mac);
        mac.setMemoria(1024);
        System.out.println(mac.toString());
    }

    public static void main(String[] args) {

    }
}