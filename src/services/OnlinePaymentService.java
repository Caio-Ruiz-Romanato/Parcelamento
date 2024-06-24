package services;

/**
 * Interface que define os serviços de pagamento online.
 * <p>
 * Esta interface fornece métodos para calcular a taxa de pagamento e o juro
 * baseado em um determinado valor e período.
 * </p>
 */
public interface OnlinePaymentService {

	/**
	 * Calcula a taxa de pagamento para um determinado valor.
	 *
	 * @param amount o valor sobre o qual a taxa será calculada
	 * @return a taxa de pagamento calculada
	 */
	double paymentFee(double amount);

	/**
	 * Calcula o juro para um determinado valor e período.
	 *
	 * @param amount o valor sobre o qual o juro será calculado
	 * @param months o número de meses para o cálculo do juro
	 * @return o juro calculado
	 */
	double interest(double amount, int months);
}