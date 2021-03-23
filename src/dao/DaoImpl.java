package dao;

import org.springframework.stereotype.Repository;

@Repository("dao")
public class DaoImpl implements IDao {

	@Override
	public double getData() {
		System.out.println("Version base de donn�es");
		double data=35;
		return data;
	}
	public void init() {
		System.out.println("Instanciation de DaoImpl");
	}
}
