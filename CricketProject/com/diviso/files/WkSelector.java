package com.diviso.files;

import java.util.*;

public class WkSelector extends TeamSelector {
	
	 public  List<Player> selectTeam(List<Player> list){
		List<Player> wk = new ArrayList<Player>() ;
		    for(Player p:list){
			if(p.getRole().equals("Wk")){
			
			wk.add(p);
			}	
			
			
		}
		return wk;
		
	}
	
	
	
	
}
