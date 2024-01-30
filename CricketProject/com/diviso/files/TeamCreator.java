package com.diviso.files;

import java.util.*;

public class TeamCreator {

    private List<Player> indianTeamFinal = new ArrayList<Player>() ;
    private List<Player> australianTeamFinal = new ArrayList<Player>() ;
	
	public List<Player> getIndianTeamFinal(){
		return indianTeamFinal;
	} 
	
	
	public List<Player> getAustralianTeamFinal(){
		return australianTeamFinal;
	} 
	
    private Configuration configure = new Configuration();
	
    public List<Player> createIndianTeam(){
	    
		BatsmenSelector bs = new BatsmenSelector() ;
        BowlersSelector bws = new BowlersSelector() ;
        WkSelector ws = new WkSelector() ;
		List<Player> batsmen = new ArrayList<Player>() ;
		List<Player> bowlers = new ArrayList<Player>() ;
		List<Player> wk = new ArrayList<Player>() ;
		
		batsmen.addAll(bs.selectTeam(Configuration.INDIANTEAMFORSELECTION));
		bowlers.addAll(bws.selectTeam(Configuration.INDIANTEAMFORSELECTION));
		wk.addAll(ws.selectTeam(Configuration.INDIANTEAMFORSELECTION));
		
		for(int j = 0;j<8;j++){ 
		
		    int random = (int) (Math.random()*10); 
			if(indianTeamFinal.contains(batsmen.get(random))){ 
				j--;
			}else{
			indianTeamFinal.add(batsmen.get(random)); 
			}
			}
		for(int j = 0;j<7;j++){
		
		    int random = (int) (Math.random()*10);
			if(indianTeamFinal.contains(bowlers.get(random))){
				j--;
			}else{
			indianTeamFinal.add(bowlers.get(random));
			}
			}
		for(int j = 0;j<2;j++){
		
		    int random = (int) (Math.random()*10);
			if(indianTeamFinal.contains(wk.get(random))){
				j--;
			}else{
			indianTeamFinal.add(wk.get(random));
			}
			}
	 return indianTeamFinal;
    }

    public List<Player> createAustralianTeam(){
        BatsmenSelector bs = new BatsmenSelector() ;
        BowlersSelector bws = new BowlersSelector() ;
        WkSelector ws = new WkSelector() ;
		List<Player> batsmen = new ArrayList<Player>() ;
		List<Player> bowlers = new ArrayList<Player>() ;
		List<Player> wk = new ArrayList<Player>() ;
		batsmen.addAll(bs.selectTeam(Configuration.AUSTRALIANTEAMFORSELECTION));
		bowlers.addAll(bws.selectTeam(Configuration.AUSTRALIANTEAMFORSELECTION));
		wk.addAll(ws.selectTeam(Configuration.AUSTRALIANTEAMFORSELECTION));
		
		for(int j = 0;j<8;j++){
		
		    int random = (int) (Math.random()*10);
			if(australianTeamFinal.contains(batsmen.get(random))){
				j--;
			}else{
			australianTeamFinal.add(batsmen.get(random));
			}
			}
			for(int j = 0;j<7;j++){
		    int random = (int) (Math.random()*10);
			if(australianTeamFinal.contains(bowlers.get(random))){
				j--;
			}else{
			australianTeamFinal.add(bowlers.get(random));
			}
			}
			for(int j = 0;j<2;j++){
		    int random = (int) (Math.random()*10);
			if(australianTeamFinal.contains(wk.get(random))){
				j--;
			}else{
			australianTeamFinal.add(wk.get(random));
			}
			}
		
			
    return australianTeamFinal;
    }

}
