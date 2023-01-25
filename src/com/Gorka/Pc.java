package com.Gorka;

public class Pc{

    public Pc(){
        Ordenadores pc = new Ordenadores(512,256);

        System.out.println(pc);
        pc.setMemoria(1024);
        System.out.println(pc.toString());
    }



}
