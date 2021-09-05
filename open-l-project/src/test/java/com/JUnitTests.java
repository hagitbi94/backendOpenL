
///uncomment the file for testing

//package com;
//
//import javax.annotation.PostConstruct;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.web.server.LocalServerPort;
//import org.springframework.web.client.RestTemplate;
//
//import com.models.Products;
//
//@SpringBootTest(webEnvironment =  SpringBootTest.WebEnvironment.RANDOM_PORT)
//public class JUnitTests {
//
//	private int port;
//	private String url;
//	private RestTemplate restTemplate;
//	
//	
//	@LocalServerPort
//	public void setPort(int port) {
//		this.port = port;
//	}
//	
//	@PostConstruct
//	public void init() {
//		this.url = "http://localhost:" + this.port + "/product";
//		this.restTemplate = new RestTemplate();
//	}
//	
//	
//	@BeforeEach
//	public void setup() throws Exception{
//		// do nothing
//
//	}
//	
//	@AfterEach
//	public void tearDown() throws Exception {
//		
//
//		
//	}
//	
//	@Test
//	public void testContext() {
//		
//	}
//	
//	
//	
//	
//	@Test
//	public void testCreateNewProductInDb() throws Exception{
//		
//		//GIVEN the server is up 
//		
//		//WHEN I  POST /prosuct/AddItems
//		Products newProd = new Products("1", "Milk","3","121");
//		
//		Products output = this.restTemplate.postForObject(this.url + "/AddItems", newProd, Products.class);
//
//		if(!(output.getItemNo().equals(newProd.getItemNo())&&output.getAmount().equals(newProd.getAmount())&& output.getName().equals(newProd.getName())&& output.getInventoryCode().equals(newProd.getInventoryCode()))) {
//			throw new Exception("expected new product but it was wrong");
//		
//			
//		}
//	
//	}
//	
//	//infrastructure for more tests:
//	
//	@Test
//	public void testDeleteProduct() throws Exception{
//		
//
//	}
//	
//	
//	
//	
//	@Test
//	public void testDepositAmountOfSpecificProductToStock() throws Exception{
//		
//		
//		
//		
//		
//	}
//	
//	
//	
//	@Test
//	public void testDepositWithdrawalOfSpecificProductToStock() throws Exception{
//		
//		
//		
//		
//		
//	}
//	
//	
//	
//	@Test
//	public void testGetOneProduct() throws Exception{
//		
//		
//		
//		
//		
//	}
//	
//	
//	
//	@Test
//	public void testGetListOfProduct() throws Exception{
//		
//		
//		
//		
//		
//	}
//	
//	
//	
//}
