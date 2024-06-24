package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa um contrato com número, data, valor total e parcelas.
 */
public class Contract {

	/** Número do contrato. */
	private Integer number;

	/** Data do contrato. */
	private LocalDate date;

	/** Valor total do contrato. */
	private Double totalValue;

	/** Parcelas associadas ao contrato. */
	private List<Installment> installments = new ArrayList<>();

	/** Construtor padrão. */
	public Contract() {
	}

	/**
	 * Construtor com parâmetros.
	 *
	 * @param number     número do contrato
	 * @param date       data do contrato
	 * @param totalValue valor total do contrato
	 */
	public Contract(Integer number, LocalDate date, Double totalValue) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}

	/**
	 * Obtém o número do contrato.
	 *
	 * @return número do contrato
	 */
	public Integer getNumber() {
		return number;
	}

	/**
	 * Define o número do contrato.
	 *
	 * @param number novo número do contrato
	 */
	public void setNumber(Integer number) {
		this.number = number;
	}

	/**
	 * Obtém a data do contrato.
	 *
	 * @return data do contrato
	 */
	public LocalDate getDate() {
		return date;
	}

	/**
	 * Define a data do contrato.
	 *
	 * @param date nova data do contrato
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}

	/**
	 * Obtém o valor total do contrato.
	 *
	 * @return valor total do contrato
	 */
	public Double getTotalValue() {
		return totalValue;
	}

	/**
	 * Define o valor total do contrato.
	 *
	 * @param totalValue novo valor total do contrato
	 */
	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	/**
	 * Obtém a lista de parcelas do contrato.
	 *
	 * @return lista de parcelas
	 */
	public List<Installment> getInstallments() {
		return installments;
	}
}