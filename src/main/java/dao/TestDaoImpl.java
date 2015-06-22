package dao;

import org.springframework.stereotype.Repository;


@Repository("testDao")
public class TestDaoImpl implements ITestDao {

	public String getTestDaoAnnotation() {
		// TODO Auto-generated method stub
		return "This is testDao Annotation";
	}

}
