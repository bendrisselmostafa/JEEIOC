package pres;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

import Metier.IMetier;
import dao.IDao;

public class Presentation {

	public static void main(String[] args) throws Exception {
		/**
		 * Injection des dépendances par
		 * instanciation statique => new 
		 */
		/* version statique
		DaoImpl dao= new DaoImpl();
		MetierImpl metier = new MetierImpl();
		metier.setDao(dao);
		System.out.println(metier.calcul());*/
			Scanner sc = new Scanner(new File("config.txt"));
			
			String daoClassName=sc.nextLine();
			Class cDao=Class.forName(daoClassName);
			IDao dao= (IDao) cDao.newInstance();
			
			String metierClassName=sc.nextLine();
			Class cMetier = Class.forName(metierClassName);
			IMetier metier= (IMetier)cMetier.newInstance();
			
			Method method = cMetier.getMethod("setDao", IDao.class);
			method.invoke(metier, dao);
			
			System.out.println(metier.calcul());
	}

}
