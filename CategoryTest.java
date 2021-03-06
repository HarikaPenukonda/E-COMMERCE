package com.niit.shoppingcart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.model.Product;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.dao.UserDetailsDAO;
import com.niit.shoppingcart.model.Cart;
import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.Product;
import com.niit.shoppingcart.model.Supplier;
import com.niit.shoppingcart.model.UserDetails;
public class CategoryTest {
	
	static AnnotationConfigApplicationContext context;
	public CategoryTest() {
	 context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.*");
		context.refresh();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
	CategoryTest t= new CategoryTest();
	System.out.println("IN TEST");
	CategoryDAO categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	
	Category category = (Category) context.getBean("category");
	
	category.setId("CG013");
	category.setName("Book1");
	category.setDescription("this is a book");
	
	if(categoryDAO.save(category)==true)
	{
		System.out.println("Category created succesfully");
	}
	else
	{
		System.out.println("Not able to create the category");
	}
	
	
	
	/*	CategoryTest t= new CategoryTest();
		System.out.println("IN TEST");
	Supplier supplier = (Supplier) context.getBean("supplier");
	//Supplier supplier=new Supplier();
	supplier.setId("SUP002");
	supplier.setName("supplier2");
	supplier.setAddress("Banglore");
	
	SupplierDAO supplierDAO = (SupplierDAO) context.getBean("supplierDAO");
	//supplierDAO.save(supplier);
	if(supplierDAO.save(supplier)==true)
	{
		System.out.println("supplier created succesfully");
	}
	else
	{
		System.out.println("Not able to create the supplier");
	}*/
	
		/*CategoryTest t= new CategoryTest();
		System.out.println("IN TEST");
		UserDetails userdetails = (UserDetails) context.getBean("userDetails");
	    //userdetailsDAO.save(userdetails);
		userdetails.setId("UD002");;
		userdetails.setName("harika");
		userdetails.setPassword("harika");
		userdetails.setMail("harika@gmail.com");
		userdetails.setContact("12345");
		userdetails.setAddress("hyderabad");
		userdetails.setRole("ROLE_ADMIN");
		userdetails.setEnabled(true);
		
		UserDetailsDAO userdetailsDAO = (UserDetailsDAO) context.getBean("userdetailsDAO");
		if(userdetailsDAO.save(userdetails)==true);
		{
			System.out.println("Userdetails created succesfully");
		}*/
		
		
	/*CategoryTest t= new CategoryTest();
		System.out.println("IN TEST");
		Product product = (Product)context.getBean("product");
		product.setId("PD001");
		product.setName("Book1");
		product.setDescription("this is a book");
		product.setPrice(250);
		product.setCatid("CG001");
		product.setSupid("SUP001");
	
		
	
		
		
		ProductDAO productDAO = (ProductDAO) context.getBean("productDAO");
		if(productDAO.save(product)==true)
		{
			System.out.println("Product is created successfully");
		}
		else
		{
			System.out.println("Not able to create the product");		
		}*/
		
		/*CategoryTest t= new CategoryTest();
		System.out.println("IN TEST");
		Cart cart = (Cart)context.getBean("cart");
		cart.setId(1);
		cart.setQuantity(1);
		cart.setPrice(200);
		cart.getUser_Id()
		*/
		
	
		
	
		

}	
}
	

