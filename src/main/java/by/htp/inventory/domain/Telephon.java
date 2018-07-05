package by.htp.inventory.domain;

import java.io.Serializable;

public class Telephon implements Serializable{

	private static final long serialVersionUID = -5185902031129477776L;
	
	private String idTelephone;
	private String telephoneModel;
	private String telephoneBrand;
	private String macAddress;
	private String namber;
	private String location;
	private String inverter_id;
	
	public Telephon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Telephon(String idTelephone, String telephoneModel, String telephoneBrand, String macAddress, String namber,
			String location, String inverter_id) {
		super();
		this.idTelephone = idTelephone;
		this.telephoneModel = telephoneModel;
		this.telephoneBrand = telephoneBrand;
		this.macAddress = macAddress;
		this.namber = namber;
		this.location = location;
		this.inverter_id = inverter_id;
	}

	public String getIdTelephone() {
		return idTelephone;
	}

	public void setIdTelephone(String idTelephone) {
		this.idTelephone = idTelephone;
	}

	public String getTelephoneModel() {
		return telephoneModel;
	}

	public void setTelephoneModel(String telephoneModel) {
		this.telephoneModel = telephoneModel;
	}

	public String getTelephoneBrand() {
		return telephoneBrand;
	}

	public void setTelephoneBrand(String telephoneBrand) {
		this.telephoneBrand = telephoneBrand;
	}

	public String getMacAddress() {
		return macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public String getNamber() {
		return namber;
	}

	public void setNamber(String namber) {
		this.namber = namber;
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
		result = prime * result + ((idTelephone == null) ? 0 : idTelephone.hashCode());
		result = prime * result + ((inverter_id == null) ? 0 : inverter_id.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((macAddress == null) ? 0 : macAddress.hashCode());
		result = prime * result + ((namber == null) ? 0 : namber.hashCode());
		result = prime * result + ((telephoneBrand == null) ? 0 : telephoneBrand.hashCode());
		result = prime * result + ((telephoneModel == null) ? 0 : telephoneModel.hashCode());
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
		Telephon other = (Telephon) obj;
		if (idTelephone == null) {
			if (other.idTelephone != null)
				return false;
		} else if (!idTelephone.equals(other.idTelephone))
			return false;
		if (inverter_id == null) {
			if (other.inverter_id != null)
				return false;
		} else if (!inverter_id.equals(other.inverter_id))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (macAddress == null) {
			if (other.macAddress != null)
				return false;
		} else if (!macAddress.equals(other.macAddress))
			return false;
		if (namber == null) {
			if (other.namber != null)
				return false;
		} else if (!namber.equals(other.namber))
			return false;
		if (telephoneBrand == null) {
			if (other.telephoneBrand != null)
				return false;
		} else if (!telephoneBrand.equals(other.telephoneBrand))
			return false;
		if (telephoneModel == null) {
			if (other.telephoneModel != null)
				return false;
		} else if (!telephoneModel.equals(other.telephoneModel))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Telephon [idTelephone=" + idTelephone + ", telephoneModel=" + telephoneModel + ", telephoneBrand="
				+ telephoneBrand + ", macAddress=" + macAddress + ", namber=" + namber + ", location=" + location
				+ ", inverter_id=" + inverter_id + "]";
	}

	
	
	
	

}
