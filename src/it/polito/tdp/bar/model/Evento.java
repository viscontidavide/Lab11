package it.polito.tdp.bar.model;

import java.time.LocalTime;

public class Evento {
	
	
	public enum TipoEvento {
		ARRIVO_GRUPPO,
		USCITA,
	}

	
	private LocalTime ora;
	private TipoEvento tipo;
	private Cliente gruppo_cli;
//	private LocalTime durata;
	
	
	
	
}
