package Metier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.IDao;

@Service("metier")
public class MetierImpl implements IMetier {
	
	@Autowired
	private IDao dao=null;
	@Override
	public double calcul() {
		double data = dao.getData();
		double res = data*Math.PI;
		return res;
	}
	public void setDao(IDao dao) {
		this.dao = dao;
		//System.out.println("Injection de dépendances");
	}
	public void init() {
		System.out.println("Initialisation de MetierImpl");
	}
	

}
