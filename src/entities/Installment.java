package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Classe que representa uma parcela de um pagamento.
 * <p>
 * A classe contém informações sobre a data da parcela e o valor da parcela.
 * </p>
 */
public class Installment {

	//** Atributo privado estatico. */
	private static DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	/** A data da parcela. */
	private LocalDate date;

	/** O valor da parcela. */
	private Double amount;

	/**
	 * Construtor padrão.
	 * <p>
	 * Inicializa uma nova instância da classe {@code Installment} com valores
	 * padrão.
	 * </p>
	 */
	public Installment() {
	}

	/**
	 * Construtor com parâmetros.
	 * <p>
	 * Inicializa uma nova instância da classe {@code Installment} com a data e o
	 * valor especificados.
	 * </p>
	 *
	 * @param date   a data da parcela
	 * @param amount o valor da parcela
	 */
	public Installment(LocalDate date, Double amount) {
		this.date = date;
		this.amount = amount;
	}

	/**
	 * Obtém a data da parcela.
	 *
	 * @return a data da parcela
	 */
	public LocalDate getDate() {
		return date;
	}

	/**
	 * Define a data da parcela.
	 *
	 * @param date a nova data da parcela
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}

	/**
	 * Obtém o valor da parcela.
	 *
	 * @return o valor da parcela
	 */
	public Double getAmount() {
		return amount;
	}

	/**
	 * Define o valor da parcela.
	 *
	 * @param amount o novo valor da parcela
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return date.format(formatterDate) + " - " + String.format("%.2f", amount);
	}
	
	
}