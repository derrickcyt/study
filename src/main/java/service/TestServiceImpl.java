package service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import dao.ITestDao;


@Service("testService")
public class TestServiceImpl implements ITestService{

	@Resource(name="testDao")
	private ITestDao testDao;
	
	public ITestDao getTestDao() {
		return testDao;
	}

	public void setTestDao(ITestDao testDao) {
		this.testDao = testDao;
	}

	public String getTestAnnotation() {
		// TODO Auto-generated method stub
		return testDao.getTestDaoAnnotation();
	}

}
