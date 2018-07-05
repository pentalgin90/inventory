package by.htp.inventory.domain;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="matherboard")
public class Matherboard extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3150756011968420797L;
	@Column(name="matherboard")
	private String matherboard;
	@ElementCollection(fetch=FetchType.LAZY)
	@ManyToOne
	@JoinColumn(name="brand")
	private Brand brand;
	public Matherboard() {
	}
	public Matherboard(int id) {
		super(id);
	}
	public Matherboard(String model, Brand brand) {
		super();
		this.matherboard = model;
		this.brand = brand;
	}
	public Matherboard(int id, String model, Brand brand) {
		super(id);
		this.matherboard = model;
		this.brand = brand;
	}
	public String getMatherboard() {
		return matherboard;
	}
	public void setMatherboard(String matherboard) {
		this.matherboard = matherboard;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	
	

}
