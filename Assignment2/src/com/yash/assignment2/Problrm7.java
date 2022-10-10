package com.yash.assignment2;

import java.time.LocalDate;
class Atheltics 
{
	int aid; 
	String aname; 
	String address;
	private LocalDate dob;
	
	public Atheltics(int aid, String aname, String address, LocalDate dob) 
	{
		super();
		this.aid = aid;
		this.aname = aname;
		this.address = address;
		this.dob = dob;
	}
}

class Cricket_Player extends Atheltics
{
	String teamname; 
	int jersyno; 
	int totalruns; 
	int highestscore;
	double avg; 
	int totalmatchedplayed;
	
	public Cricket_Player(int aid, String aname, String address, LocalDate dob, String teamname, int jersyno,
			int totalruns, int highestscore, double avg, int totalmatchedplayed) {
		super(aid, aname, address, dob);
		this.teamname = teamname;
		this.jersyno = jersyno;
		this.totalruns = totalruns;
		this.highestscore = highestscore;
		this.avg = avg;
		this.totalmatchedplayed = totalmatchedplayed;
	}
}