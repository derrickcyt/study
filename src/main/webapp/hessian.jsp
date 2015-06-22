<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.caucho.hessian.client.HessianProxyFactory"%>     
<%@ page import="hessian.IHello"%>        
<%  
    //Hessian代理工厂  
    HessianProxyFactory factory = new HessianProxyFactory();  
    //获得访问配置的Servlet路径  
    String url=("http://"+request.getServerName()+":"+request.getServerPort()  
    +request.getContextPath()+"/hessian/helloSpring/");  
            
    //使用Hessian工厂获得接口的具体实现类  
    IHello i = (IHello)factory.create(IHello.class,url);  
      
    out.println("<h2>"+i.sayHello(request.getParameter("name"))+"<h2>");  
%>    
 