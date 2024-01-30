package com.diviso.files;

import java.util.*;

public class CricketGameEngine
{
	private Scanner scan = new Scanner(System.in);
	private TeamCreator team = new TeamCreator();

	public void createTeam(){
		
		team.createIndianTeam();
        team.createAustralianTeam();		
		
		
		System.out.println(team.getIndianTeamFinal());
		System.out.println(team.getAustralianTeamFinal()); 
	   
	   
       }
	   
	   public void findPlayer(){
		   
		   boolean check = true;
		   while(check){
			   
			   System.out.print("\n Enter Player name :");
			   String name = scan.nextLine();
			   
			   System.out.print("\n Enter Player role (Bats/Bowls/Wk(Wicket keeper)) :");
			   String role = scan.nextLine();
			   
			   Player player = new Player(name,role);
			   
			   if(team.getIndianTeamFinal().contains(player) || team.getAustralianTeamFinal().contains(player)){
				   
				   //int i = team.indianTeamFinal.indexOf(player);
				   System.out.println(" \n Congrats player is Selected... \n");
				   
			   }
			   else{
				   
				   //int i = team.indianTeamFinal.indexOf(player);
				   System.out.println("\n Better luck next time... \n");
				   
				   
			   }
					
				
				
				System.out.println("\n To continue press 'y' or 'n' to quit \n");
				String response = scan.nextLine();
				if(response.equalsIgnoreCase("n")){
					
					check = false;
				}
				
			   
			   
			   
			   
		   }
		   
		   
		   
		   
		   
		   
	   }
	   
 

	
	
	
	
	
}
