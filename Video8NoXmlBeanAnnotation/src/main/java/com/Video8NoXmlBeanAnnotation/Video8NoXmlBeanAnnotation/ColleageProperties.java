package com.Video8NoXmlBeanAnnotation.Video8NoXmlBeanAnnotation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ColleageProperties {
		
	@Bean(name="BeanOfPrincipal")  // if we don;t write name it will be same as function name
//	you can give multiple name to single bean by @Bean(name="{"A","B"}")
	public ColleagPrincipal PrincipalBean()
	{ColleagPrincipal obj = new ColleagPrincipal();
		return obj;}

	@Bean
	public Teacher beanofTeacher()
	{
		Teacher beanofTeacher= new MathTeacher();
		return beanofTeacher;}
	
	@Bean
	public Colleag beanOfColleag()
	{	Colleag objColleag = new Colleag();
		objColleag.setPrincipal(PrincipalBean());
		objColleag.setTeacher(beanofTeacher());
		return objColleag;
	}
	
	
}
