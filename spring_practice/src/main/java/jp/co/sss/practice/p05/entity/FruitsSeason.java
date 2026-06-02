package jp.co.sss.practice.p05.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "fruits_season")
public class FruitsSeason {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_fruits_season")
	@SequenceGenerator(name = "seq_fruits_season", sequenceName = "seq_fruits_season", allocationSize = 1)
	private Integer fruitId;
	private String fruitName;
	private Integer seasonMonth;

	/**
	 * @return id
	 */
	public Integer getId() {
		return fruitId;
	}

	/**
	 * @param id セットする id
	 */
	public void setId(Integer id) {
		this.fruitId = id;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return fruitName;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.fruitName = name;
	}

	/**
	 * @return season
	 */
	public Integer getSeason() {
		return seasonMonth;
	}

	/**
	 * @param season セットする season
	 */
	public void setSeason(Integer season) {
		this.seasonMonth = season;
	}

}
