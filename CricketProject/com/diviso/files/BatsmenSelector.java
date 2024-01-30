package com.diviso.files;

import java.util.*;

public class BatsmenSelector extends TeamSelector {
   public  List<Player> selectTeam(List<Player> list){
	    List<Player> batsmen = new ArrayList<Player>() ;
		for(Player p:list){
		    
			if(p.getRole().equals("Bats")){
		      batsmen.add(p);
			}	
		}
		return batsmen;
	}
	
	
}
