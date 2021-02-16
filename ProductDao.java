package it.esedra.corso.Ecommerce.dao;

import java.util.List;

import it.esedra.corso.Ecommerce.entity.Product;

public interface ProductDao {
	
	public List <Product>findAll();
	public Product findById(int id);
	public Product save (Product product);

}
