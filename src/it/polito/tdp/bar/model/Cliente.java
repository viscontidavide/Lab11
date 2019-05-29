package it.polito.tdp.bar.model;

import java.time.LocalTime;
import java.util.Random;

public class Cliente {
	
	
	public enum StatoCliente{
		SERVITO_TAVOLO,
		SERVITO_BANCONE,
	}
	
	
	private Random r= new Random();
	
	
	private int id;
	private int numero = (1+r.nextInt(10));
	private LocalTime oraArrivo;
	private int durata = (60+60*r.nextInt(2));
	private float tolleranza = (r.nextInt(10)/10);
	
	
	
	
	public Cliente(int id, LocalTime oraArrivo) {
		this.id = id;
		this.oraArrivo = oraArrivo;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDurata() {
		return durata;
	}
	public void setDurata(int durata) {
		this.durata = durata;
	}
	public float getTolleranza() {
		return tolleranza;
	}
	public void setTolleranza(float tolleranza) {
		this.tolleranza = tolleranza;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public LocalTime getOraArrivo() {
		return oraArrivo;
	}
	public void setOraArrivo(LocalTime oraArrivo) {
		this.oraArrivo = oraArrivo;
	}
	
	
	
	

}
