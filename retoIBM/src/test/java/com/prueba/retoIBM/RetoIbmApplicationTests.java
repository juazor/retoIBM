package com.prueba.retoIBM;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.prueba.reto.services.RetoServices;

@Ignore
@RunWith(SpringRunner.class)
@SpringBootTest
public class RetoIbmApplicationTests {

	@Autowired RetoServices reto;
	
	@Test
	public void contextLoads() {
			
		Integer num1=10;
		Integer num2=30;
		
		Integer result = reto.sumar(num1, num2);
			Integer valueExpected = num1+num2;
			assertEquals(valueExpected, result);
		}
		
	

}
