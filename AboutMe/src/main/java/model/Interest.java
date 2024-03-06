package model;

/**
 * @author emilylester empope1
 * CIS 175 Spring 2024
 * Feb 8, 2024
 */
public class Interest {
	
	private int exercise;
	private int hours;
	private int minutes;
	
	public Interest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Interest(int exercise) {
		super();
		this.exercise = exercise;
		setTime(exercise);
		
	}
		
	public void setExercise(int exercise) {
		this.exercise = exercise;
		setTime(exercise);
		
	}
	
	public int getExercise() {
		return exercise;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	
	public void setTime(int exercise) {
		final int HOURS = 1;
		final int MINUTES = 60; 
		
		int timeLeft;
		
		setHours(exercise / HOURS);
		timeLeft = exercise % HOURS;
		
		setMinutes(exercise / MINUTES);
		timeLeft = exercise % MINUTES;
	}

	@Override
	public String toString() {
		return "Interest [exercise=" + exercise + ", hours=" + hours + ", minutes=" + minutes + "]";
	}
	
	

}
