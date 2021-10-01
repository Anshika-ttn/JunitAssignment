package test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import main.EmailService;
import main.Order;

class EmailServiceTest {
	EmailService emailservice = EmailService.getInstance();
	Order order = new Order(100, "Soap", 20.0);
	
	@Test
	void Should_Returninstance_When_getInstance() {
		//when
		EmailService emailservice1 = emailservice.getInstance();
		 //then
		assertEquals(emailservice1, emailservice);
	}
	
	@Test
	void Should_ReturnRuntimeException_when_sendemail() {
		Executable executable = () -> emailservice.sendEmail(order);
		assertThrows(RuntimeException.class, executable);
	}
	
	@Test
	void Should_Returntrue_when_sendeamil() {
		boolean testsend = emailservice.sendEmail(order, "Soap");
		assertTrue(testsend);
		
	}
	    
	}
	
	

