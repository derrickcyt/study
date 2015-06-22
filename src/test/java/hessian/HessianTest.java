package hessian;

import java.net.MalformedURLException;
import com.caucho.hessian.client.HessianProxyFactory;

public class HessianTest {
	
	public static void main(String[] args) throws MalformedURLException{
		String url = "http://localhost:8080/study/hessian/helloSpring";  
		
        HessianProxyFactory factory = new HessianProxyFactory();  
        IHello api = (IHello) factory.create(IHello.class, url);  
  
        System.out.println(api.sayHello("fdfsd")); 
	}
}
