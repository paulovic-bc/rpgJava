package com.project_rpg.rpgJava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RpgJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RpgJavaApplication.class, args);
		/* Humanoid*/
		Mago mg = new Mago(5,10);	
		Guerreiro gr = new Guerreiro(10,10);
		Templario tp = new Templario(10,500);
		Laladino ld = new Laladino(10,5);
		System.out.println("Mago");
		System.out.println("Energia: "+mg.getEnergia());
		System.out.println("Experiencia: "+mg.getExperiencia());
		System.out.println("Guerreiro");
		System.out.println("Energia: "+gr.getEnergia());
		System.out.println("Experiencia:"+gr.getExperiencia());
		System.out.println("Templario ");
		System.out.println("Energia: "+tp.getEnergia());
		System.out.println("Experiencia: "+tp.getExperiencia());
		System.out.println("Laladino");	
		System.out.println("Energia: "+ld.getEnergia());
		System.out.println("Experiencia: "+ld.getExperiencia());
		
			// Monstros
		
		Engia eng = new Engia(20);
		System.out.println("engia");
		System.out.println("Energia: "+eng.getEnergia());
		Cerbero ceb = new Cerbero(50);
		System.out.println("Cerbero");
		System.out.println("Energia: "+ceb.getEnergia());
		
	}

}
