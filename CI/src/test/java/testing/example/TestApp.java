package testing.example;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestApp {

	private App app;

	@Before
	public void setUp() {
		app = new App();
	}
	
	@Test
	public void testAppSayHello(){
		assertEquals("Hello", app.sayHello());
	}

	

}
