package com.diviso.cricket;

import com.diviso.files.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To Cricket Game");

        CricketGameEngine cge = new CricketGameEngine();
        cge.createTeam();
        cge.findPlayer();     
    }
}
