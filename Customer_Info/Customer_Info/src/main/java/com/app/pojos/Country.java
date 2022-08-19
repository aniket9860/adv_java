package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "country")
public class Country extends BaseEntity {
	@Column(name="countryName", length = 20)
	private String countryName;
	@Column(name="continent", length = 20)
	private String continent;
	private double population;
}
