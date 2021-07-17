package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("=== TEST 1: seller findById ====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("\n=== TEST 2: seller findByDepartment ====");
		Department department = new Department(2,null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj: list) {
			System.out.println(obj);
		}

		System.out.println("\n=== TEST 3: seller findAll ====");
		list = sellerDao.findAll();
		for (Seller obj: list) {
			System.out.println(obj);
		}

		System.out.println("\n=== TEST 4: seller insert ====");
 		// Para testar a inserção vou criar um novo objeto:
		// Para simplificar, na birthDate vou colocar uma nova data
		// No department vou aproveitar o objeto instanciado mais acima no código:
		// Dúvida, neste caso usar o date.util ou o date.sql?:
		//É o javautil.date!
		
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		// Para inserir este novo objeto:
		sellerDao.insert(newSeller);
		System.out.println("Inserted! new id = " + newSeller.getId());		
		
		System.out.println("\n=== TEST 5: seller update ====");
		// para testar a função de update, vamos usar a nossa variável
		// seller para receber o vendedor 1;
		// em seguida vamos fazer algumas alterações:
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		// Agora vamos salvar esse vendedor, atualizando os dados dele:
		sellerDao.update(seller);
		System.out.println("Update completed");

		
		System.out.println("\n=== TEST 6: seller delete ====");
		// Vou fazer minha variável receber um objeto específico
		
		// Vou pedir para o usuário escrever um código:
		
		System.out.print("Enter id for delete test: ");
				
		// Vamos criar lá em cima do código um scanner com o seguinte código:
		//Scanner sc = new Scanner(System.in);
		
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed");
		sc.close();

		
	}

}