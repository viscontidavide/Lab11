package it.polito.tdp.bar.model;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;

public class Simulatore {
	
	
	private PriorityQueue<Evento> queue = new PriorityQueue();
	
	
	private List <Cliente> clienti;
/*	private int tavLiberi_10;
	private int tavLiberi_8;
	private int tavLiberi_6;
	private int tavLiberi_4;     */
	
	private Random rand = new Random();
	private Duration T_ARRIVAL =  Duration.ofMinutes(rand.nextInt(10)+1);
	
	private LocalTime T_inizio = LocalTime.of(8, 0);
	
	
	private int t_10 = 2;
	private int t_8 = 4;
	private int t_6 = 4;
	private int t_4 = 5;
	
	
	private int num_tot_clienti;
	private int num_cli_sodd;
	private int num_cli_ins;
	
	
	public Simulatore(){
		this.clienti = new ArrayList<Cliente>();
	}

	
	public void init() {
		
		LocalTime oraArrivo = T_inizio;
		clienti.clear();
		
		for(int i=1; i<1000; i++) {
			Cliente c = new Cliente();
		}
		
	}
	
	
	
}
