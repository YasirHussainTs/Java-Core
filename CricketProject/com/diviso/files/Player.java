package com.diviso.files;

public class Player{
	
	private String name;
	private String role;
	private String country;
	
	public String getName(){
	
	return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public String getRole(){
	
	return role;
	}
	public void setRole(String role){
		this.role = role;
	}
	
	public String getCountry(){
	
	return country;
	}
	public void setCountry(String country){
		this.country = country;
	}
	
	public Player(String country,String name,String role){
		
		this.country = country;
		this.name = name;
		this.role= role;
		
	}
	
	public Player(String name, String role){
		
		this.name = name;
		this.role = role;
		
	}
	

    public boolean equals(Object o){
		boolean condition = false;
		if(o instanceof Player && o != null)
	    if(((Player)o).name.equals(this.name) && ((Player)o).role.equals(this.role)){
			condition = true;
		}
		return condition;
	}
	public String toString(){
		
		return "\n Name :"+name+"\n Role :"+role+"\n Country :"+country;
	}
}
