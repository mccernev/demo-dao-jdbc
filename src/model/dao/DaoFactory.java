package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	// Esta classe terá operações estáticas para instanciar os daos.

	// Por exemplo, vai ter um método estático createSellerDao()
	// Este método vai ter que retornar um SellerDao.

	public static SellerDao createSellerDao() {
		// E como será a implementação dela?
		// Ela vai retornar um novo SellerDaoJDBC.
		return new SellerDaoJDBC();
		// Desssa forma, a minha classe, ela vai expor um método
		// que retorna o tipo da interface (SellerDao)
		// Mas internamente ela vai intanciar uma implementação: SellerDaoJDBC
		// Isso aqui é um macete para não precisar expor a implementação.
		// Deixando somente a interface.
		// Assim, lá no Program, eu posso acrescentar uma instanciação de um SellerDao:
		// SellerDao sellerDao = (sem precisar dar um new SellerDaoJDBC)
		// Eu simplesmente vou chamar o método createSellerDao() na fábrica:
		// SellerDao sellerDao = DaoFactory.createSellerDao();
		// Assim, o meu programa não conhece a implementação.
		// Ele conhece somente a interface.
		// isto também é uma forma de fazermos a injeção de dependência,
		// sem explicitar a implementação.

	}
}
