package services;

/**
 * Implementação do serviço de pagamento online utilizando PayPal.
 */
public class PaypalService implements OnlinePaymentService {

	/**
	 * Calcula a taxa de pagamento com base no valor da transação.
	 *
	 * @param amount valor da transação
	 * @return taxa de pagamento
	 */
	@Override
	public double paymentFee(double amount) {
		return amount * 0.02; // A taxa de pagamento é 2% do valor da transação
	}

	/**
	 * Calcula os juros com base no valor da transação e no número de meses.
	 *
	 * @param amount valor da transação
	 * @param months número de meses
	 * @return juros
	 */
	@Override
	public double interest(double amount, int months) {
		return amount * 0.01 * months; // Os juros são 1% do valor da transação por mês
	}
}