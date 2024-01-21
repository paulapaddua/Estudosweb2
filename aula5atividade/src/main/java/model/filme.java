package model;

public class filme {
	    private String filme;
	    private String sala;
	    private int horarioInicio;
	    private int horarioFim;

	    public filme(String filme, String sala, int horarioInicio, int horarioFim) {
	        this.filme = filme;
	        this.sala = sala;
	        this.horarioInicio = horarioInicio;
	        this.horarioFim = horarioFim;
	    }

	    public String getFilme() {
	        return filme;
	    }

	    public void setFilme(String filme) {
	        this.filme = filme;
	    }

	    public String getSala() {
	        return sala;
	    }

	    public void setSala(String sala) {
	        this.sala = sala;
	    }

	    public int getHorarioInicio() {
	        return horarioInicio;
	    }

	    public void setHorarioInicio(int horarioInicio) {
	        this.horarioInicio = horarioInicio;
	    }

	    public int getHorarioFim() {
	        return horarioFim;
	    }

	    public void setHorarioFim(int horarioFim) {
	        this.horarioFim = horarioFim;
	    }
}
