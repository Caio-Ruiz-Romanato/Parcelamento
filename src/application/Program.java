package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.OnlinePaymentService;
import services.PaypalService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); // Configura a localização padrão para US
		Scanner sc = new Scanner(System.in); // Objeto Scanner para entrada de dados
		DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Formatação de datas

		// Entrada de dados do contrato
		System.out.println("Entre os dados do contrato: ");
		System.out.print("Número: ");
		int number = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), formatterDate);
		System.out.print("Valor do contrato: ");
		double totalValue = sc.nextDouble();

		// Cria um objeto Contract com os dados fornecidos
		Contract contract = new Contract(number, date, totalValue);

		// Entrada do número de parcelas
		System.out.print("Entre com o número de parcelas: ");
		int numberOfInstallments = sc.nextInt();

		// Instanciação do serviço de contrato com o serviço de pagamento Paypal
		OnlinePaymentService paymentService = new PaypalService();
		ContractService contractService = new ContractService(paymentService);

		// Processamento das parcelas
		contractService.processContract(contract, numberOfInstallments);

		// Impressão das parcelas
		System.out.println("PARCELAS: ");
		System.out.println();
		for (Installment installment : contract.getInstallments()) {
			System.out.println(installment);
		}

		// Fechamento do objeto Scanner
		sc.close();
	}
}