package ext;

import org.springframework.stereotype.Repository;

import dao.IDao;

@Repository
public class DaoImplV2 implements IDao{

	@Override
	public double getData() {
		/*
		 * Version web service
		 */
		System.out.println("Version Web Service");
		double data=12;
		return data;
	}

}
