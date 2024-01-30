package com.diviso.files;

import java.util.*;

public class BowlersSelector extends TeamSelector {
    public  List<Player> selectTeam(List<Player> list){
		
		List<Player> bowlers = new ArrayList<Player>() ;
		    for(Player p: list){
			if(p.getRole().equals("Bowls")){
				
				bowlers.add(p);
			}
		}
		
		return bowlers;
	}
	
	

}
