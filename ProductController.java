package it.esedra.corso.Ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.esedra.corso.Ecommerce.dao.ProductDao;
import it.esedra.corso.Ecommerce.entity.Product;

@RestController
public class ProductController {
	
	@Autowired
	
	private ProductDao productDao;
	
	 //Récupérer la liste des produits
    
    @GetMapping("/products")
    public List<Product>listeProducts() {
        return productDao.findAll();
    }

	 //Récupérer un produit par son Id
   
    @GetMapping(value="/Products/{id}")
    public Product afficherUnProduct(@PathVariable int id) {
     Product product = new Product(id, new String("ecouteur"),100);  
    	
    	return product;
    }
    
    @PostMapping("/products")
    public void ajouterProduit(@RequestBody Product product) {
    	productDao.save(product);
    	
    }

}
