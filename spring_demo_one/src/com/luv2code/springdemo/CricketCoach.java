package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	
	private FortuneService fortuneService;
	
	// adding new fields for email address and team
	private String emailAdress;
	private String team;
	
	
	public String getEmailAdress() {
		return emailAdress;
	}
	public String getTeam() {
	
		return team;
	}
	public void setEmailAdress(String emailAdress) {
		System.out.println("CricketCoach: inside setter email address method -");
		this.emailAdress = emailAdress;
	}
	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter team method -");
		this.team = team;
		
	}
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method -");
		this.fortuneService = fortuneService;
	}
	
	public CricketCoach() {
		System.out.println("CricketCoach: inside no arg constructor");
	}
	// our setter method
	
	@Override
	public String getDailyWorkout() {
		
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
