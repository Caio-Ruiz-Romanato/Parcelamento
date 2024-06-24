package services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

/**
 * Serviço para processar contratos, calculando e adicionando parcelas.
 */
public class ContractService {

	private OnlinePaymentService onPayServ; // Serviço de pagamento online

	/**
	 * Construtor que recebe um serviço de pagamento online.
	 *
	 * @param onPayServ serviço de pagamento online
	 */
	public ContractService(OnlinePaymentService onPayServ) {
		this.onPayServ = onPayServ;
	}

	/**
	 * Processa o contrato, calculando e adicionando parcelas.
	 *
	 * @param contract contrato a ser processado
	 * @param months   número de meses para parcelamento
	 */
	public void processContract(Contract contract, int months) {
		double basicQuota = contract.getTotalValue() / months; // Calcula a cota básica

		for (int i = 1; i <= months; i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i); // Calcula a data de vencimento da parcela

			double interest = onPayServ.interest(basicQuota, i); // Calcula os juros
			double fee = onPayServ.paymentFee(basicQuota + interest); // Calcula a taxa de pagamento
			double quota = basicQuota + interest + fee; // Calcula o valor final da parcela

			// Adiciona a parcela ao contrato
			contract.getInstallments().add(new Installment(dueDate, quota));
		}
	}
}