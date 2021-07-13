package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department obj = new Department(1, "Books");

		// Para facilitar estamos colocando um new Date() para não ter que ficar criando
		// uma data aqui:

		// no Department vamos colocar o objeto obj.

		Seller seller = new Seller(1, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		// Basta chamar o método createSellerDao() na fábrica:

		// Assim, o meu programa não conhece a implementação.
		// Ele conhece somente a interface.
		// Isto é também uma forma de fazermos a injeção de dependência,
		// sem explicitar a implementação.

		System.out.println(obj);
		System.out.println(seller);

	}
}
