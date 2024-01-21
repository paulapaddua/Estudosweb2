package controller;
import java.util.ArrayList;
import model.filme;

public class Ingresso {
	public ArrayList<filme>controleingresso = new ArrayList<filme>();
	
	public Ingresso() {
		this.controleingresso.add(new filme ("A bela Adormecida", "3", 10, 11));
		this.controleingresso.add(new filme ("Batman", "5", 14, 16));
	}
	
	public void controleingresso(String filme, String sala, int horarioInicio, int horarioFim) {
		filme novofilme = new filme (filme, sala, horarioInicio, horarioFim);
		controleingresso.add(novofilme);
	}
	
}
