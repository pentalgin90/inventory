package by.htp.inventory.domain;

import java.io.Serializable;

public class Laptop implements Serializable{

	private static final long serialVersionUID = 9220997937422261731L;
	
	private String idLaptop;
	private int diagonal;
	private String laptopModel;
	private String laptopBrand;
	private String laptopCpu;
	private String location;
	private String inverter_id;
	
	public Laptop() {
		super();
	}

	public Laptop(String idLaptop, int diagonal, String laptopModel, String laptopBrand, String laptopCpu,
			String location, String inverter_id) {
		super();
		this.idLaptop = idLaptop;
		this.diagonal = diagonal;
		this.laptopModel = laptopModel;
		this.laptopBrand = laptopBrand;
		this.laptopCpu = laptopCpu;
		this.location = location;
		this.inverter_id = inverter_id;
	}

	public String getIdLaptop() {
		return idLaptop;
	}

	public void setIdLaptop(String idLaptop) {
		this.idLaptop = idLaptop;
	}

	public int getDiagonal() {
		return diagonal;
	}

	public void setDiagonal(int diagonal) {
		this.diagonal = diagonal;
	}

	public String getLaptopModel() {
		return laptopModel;
	}

	public void setLaptopModel(String laptopModel) {
		this.laptopModel = laptopModel;
	}

	public String getLaptopBrand() {
		return laptopBrand;
	}

	public void setLaptopBrand(String laptopBrand) {
		this.laptopBrand = laptopBrand;
	}

	public String getLaptopCpu() {
		return laptopCpu;
	}

	public void setLaptopCpu(String laptopCpu) {
		this.laptopCpu = laptopCpu;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getInverter_id() {
		return inverter_id;
	}

	public void setInverter_id(String inverter_id) {
		this.inverter_id = inverter_id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + diagonal;
		result = prime * result + ((idLaptop == null) ? 0 : idLaptop.hashCode());
		result = prime * result + ((inverter_id == null) ? 0 : inverter_id.hashCode());
		result = prime * result + ((laptopBrand == null) ? 0 : laptopBrand.hashCode());
		result = prime * result + ((laptopCpu == null) ? 0 : laptopCpu.hashCode());
		result = prime * result + ((laptopModel == null) ? 0 : laptopModel.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		if (diagonal != other.diagonal)
			return false;
		if (idLaptop == null) {
			if (other.idLaptop != null)
				return false;
		} else if (!idLaptop.equals(other.idLaptop))
			return false;
		if (inverter_id == null) {
			if (other.inverter_id != null)
				return false;
		} else if (!inverter_id.equals(other.inverter_id))
			return false;
		if (laptopBrand == null) {
			if (other.laptopBrand != null)
				return false;
		} else if (!laptopBrand.equals(other.laptopBrand))
			return false;
		if (laptopCpu == null) {
			if (other.laptopCpu != null)
				return false;
		} else if (!laptopCpu.equals(other.laptopCpu))
			return false;
		if (laptopModel == null) {
			if (other.laptopModel != null)
				return false;
		} else if (!laptopModel.equals(other.laptopModel))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Laptop [idLaptop=" + idLaptop + ", diagonal=" + diagonal + ", laptopModel=" + laptopModel
				+ ", laptopBrand=" + laptopBrand + ", laptopCpu=" + laptopCpu + ", location=" + location
				+ ", inverter_id=" + inverter_id + "]";
	}

	
	
	
	
	
}
