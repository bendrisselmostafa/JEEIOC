package pres;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Metier.IMetier;

public class PresAvecSpringAnnotations {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext("dao", "Metier");
		IMetier metier = ctx.getBean(IMetier.class);
		System.out.println(metier.calcul());

	}

}
