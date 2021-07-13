package model.dao.impl;

import java.util.List;

import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

//Vamos informar que esta classe
//vai implementar minha interface SellerDao

public class SellerDaoJDBC implements SellerDao{

	// O compilador avisa que falta implementar os métodos da interface.
	// Eu aceito a auto-correção
	// Então o Eclipse cria uma esqueleto dos métodos:
	
	
	
	@Override
	public void insert(Seller obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Seller obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Department findByid(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Seller> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
