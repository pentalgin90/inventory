package by.htp.inventory.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="brand")
public class Brand extends BaseEntity{


	/**
	 * 
	 */
	private static final long serialVersionUID = -4317304212149514264L;
	@Column(name="brand")
	private String brand;

	public Brand() {
	}

	public Brand(int id) {
		super(id);
	}

	public Brand(String brand) {
		super();
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Brand other = (Brand) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Brand [brand=" + brand + "]";
	}
	
	
	

}
