package by.htp.inventory.domain;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="monitor")
public class Monitor extends BaseEntity{
	
	private static final long serialVersionUID = 8805070516861789802L;
	@ElementCollection(fetch=FetchType.LAZY)
	@ManyToOne
	@JoinColumn(name="brand")
	private Brand brand;
	@ElementCollection(fetch=FetchType.LAZY)
	@ManyToOne
	@JoinColumn(name="diagonal")
	private Diagonal diagonal;
	@Column(name="model")
	private String monitorModel;
	@Column(name="location")
	private String location;
	@Column(name="inventar_id")
	private String inverterId;

	public Monitor() {
	}

	public Monitor(int id) {
		super(id);
	}

	public Monitor(Brand brand, Diagonal diagonal, String monitorModel, String location, String inverterId) {
		super();
		this.brand = brand;
		this.diagonal = diagonal;
		this.monitorModel = monitorModel;
		this.location = location;
		this.inverterId = inverterId;
	}
	
	

	public Monitor(int id, Brand brand, Diagonal diagonal, String monitorModel, String location, String inverterId) {
		super(id);
		this.brand = brand;
		this.diagonal = diagonal;
		this.monitorModel = monitorModel;
		this.location = location;
		this.inverterId = inverterId;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Diagonal getDiagonal() {
		return diagonal;
	}

	public void setDiagonal(Diagonal diagonal) {
		this.diagonal = diagonal;
	}

	public String getMonitorModel() {
		return monitorModel;
	}

	public void setMonitorModel(String monitorModel) {
		this.monitorModel = monitorModel;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getInverterId() {
		return inverterId;
	}

	public void setInverterId(String inverterId) {
		this.inverterId = inverterId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((diagonal == null) ? 0 : diagonal.hashCode());
		result = prime * result + ((inverterId == null) ? 0 : inverterId.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((monitorModel == null) ? 0 : monitorModel.hashCode());
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
		Monitor other = (Monitor) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (diagonal == null) {
			if (other.diagonal != null)
				return false;
		} else if (!diagonal.equals(other.diagonal))
			return false;
		if (inverterId == null) {
			if (other.inverterId != null)
				return false;
		} else if (!inverterId.equals(other.inverterId))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (monitorModel == null) {
			if (other.monitorModel != null)
				return false;
		} else if (!monitorModel.equals(other.monitorModel))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Monitor [brand=" + brand + ", diagonal=" + diagonal + ", monitorModel=" + monitorModel + ", location="
				+ location + ", inverterId=" + inverterId + "]";
	}

	
	
	
}
