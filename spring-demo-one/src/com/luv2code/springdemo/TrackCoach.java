package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;

	public TrackCoach() {
		
	}
	public TrackCoach(FortuneService thefortuneService) {
		this.fortuneService = thefortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5K";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: " + fortuneService.getFortune();
	}
}
