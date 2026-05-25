package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		IO.println("Enter cliente data:");
		IO.print("Name: ");
		String name = sc.nextLine();
		IO.print("Email: ");
		String email = sc.nextLine();
		IO.print("Birth date (DD/MM/YYYY): ");
		LocalDate birthDate = LocalDate.parse(sc.next(), fmt);
		
		Client client = new Client(name, email, birthDate);
		
		IO.print("Enter order data: ");
		sc.nextLine(); // limpar o \n do birthDate
		OrderStatus status = OrderStatus.valueOf(sc.nextLine());
		
		Order order = new Order(LocalDateTime.now(), status, client);
		
		IO.print("How many items to this order? ");
		int n = sc.nextInt();
		sc.nextLine(); // limpar o \n do int n
		for(int i = 1; i <= n; i++) {
			IO.println("Enter item #" + i + " data: ");
			IO.print("Product name: ");
			String productName = sc.nextLine();
			IO.print("Product price: ");
			double productPrice = sc.nextDouble();
			IO.print("Quantity: ");
			int productQuantity = sc.nextInt();
			sc.nextLine();//limpa o \n do quantity para o prox pedido
			
			Product product = new Product(productName, productPrice);
			
			OrderItem item = new OrderItem(productQuantity, product);
			
			order.addItem(item);
		}
		
		IO.println(order);
		
		sc.close();
	}

}
