package test;
import main.Order;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OrderTest {
	private Order order;
	
	@BeforeEach
	void value() {
	this.order = new Order(10, "Box" , 20.0);
	}
	
	@Test
	void Should_Returntrue_When_QuantityIsSame() {
	//when
	int testquant = order.getQuantity();
	//then
	assertEquals(10, testquant);
	}
	
	@Test
	void Should_Returntrue_When_setQuantityIsSame() {
		//when
		Order order1 = order.setQuantity(20);
		//then
		assertEquals(order1, order);
	}
	
	@Test
	void Should_Returntrue_When_ItemNameIsSame() {
	//when
	String testitemname = order.getItemName();
	//then
	assertEquals("Box", testitemname);
	}
	
	@Test
	void Should_Returntrue_When_setItemNameIsSame() {
		//when
		Order order2 = order.setItemName("Curtain");
		//then
		assertEquals(order2, order);
	}
	
	@Test
	void Should_Returntrue_When_PriceIsSame() {
	//when
	double testprice = order.getPrice();
	//then
	assertEquals(20.0, testprice);
	}
	
	@Test
	void Should_Returntrue_When_setPriceIsSame() {
		//when
		Order order3 = order.setPrice(50.88);
		//then
		assertEquals(order3, order);
	}
	
	@Test
	void Should_Returntrue_When_PricewithTex() {
		Order test = order.setPriceWithTex(10.88);
		double testpricewithtex = order.getPriceWithTex();
		assertEquals(testpricewithtex, 10.88);
	}
	
	
}

