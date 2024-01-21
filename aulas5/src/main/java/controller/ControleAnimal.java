package controller;
import java.util.ArrayList;

import model.Animal;

public class ControleAnimal {
	public ArrayList<Animal> animaisCadastrados = new ArrayList<Animal>();
	
	public ControleAnimal() {
		this.animaisCadastrados.add(new Animal("dog", 5,15,"canino"));
		this.animaisCadastrados.add(new Animal("cat", 2,3,"felino"));
	}
	
	public void cadastrarAnimal(String nome, int idade, float peso, String especie) {
		Animal novoAnimal = new Animal(nome, idade, peso, especie);
		animaisCadastrados.add(novoAnimal);
	}
}
