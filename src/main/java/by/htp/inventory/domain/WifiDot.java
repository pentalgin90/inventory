package by.htp.inventory.domain;

import java.io.Serializable;

public class WifiDot implements Serializable {

	private static final long serialVersionUID = -5489405166953355002L;

	private String idwifiDot;
	private String wifiDotModel;
	private String wifiDotBrand;
	private String ipAdress;
	private String location;
	private String inverter_id;

	public WifiDot() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WifiDot(String idwifiDot, String wifiDotModel, String wifiDotBrand, String ipAdress, String location) {
		super();
		this.idwifiDot = idwifiDot;
		this.wifiDotModel = wifiDotModel;
		this.wifiDotBrand = wifiDotBrand;
		this.ipAdress = ipAdress;
		this.location = location;
	}

	public WifiDot(String idwifiDot, String wifiDotModel, String wifiDotBrand, String ipAdress, String location,
			String inverter_id) {
		super();
		this.idwifiDot = idwifiDot;
		this.wifiDotModel = wifiDotModel;
		this.wifiDotBrand = wifiDotBrand;
		this.ipAdress = ipAdress;
		this.location = location;
		this.inverter_id = inverter_id;
	}

	public String getIdwifiDot() {
		return idwifiDot;
	}

	public void setIdwifiDot(String idwifiDot) {
		this.idwifiDot = idwifiDot;
	}

	public String getWifiDotModel() {
		return wifiDotModel;
	}

	public void setWifiDotModel(String wifiDotModel) {
		this.wifiDotModel = wifiDotModel;
	}

	public String getWifiDotBrand() {
		return wifiDotBrand;
	}

	public void setWifiDotBrand(String wifiDotBrand) {
		this.wifiDotBrand = wifiDotBrand;
	}

	public String getIpAdress() {
		return ipAdress;
	}

	public void setIpAdress(String ipAdress) {
		this.ipAdress = ipAdress;
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
		result = prime * result + ((idwifiDot == null) ? 0 : idwifiDot.hashCode());
		result = prime * result + ((inverter_id == null) ? 0 : inverter_id.hashCode());
		result = prime * result + ((ipAdress == null) ? 0 : ipAdress.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((wifiDotBrand == null) ? 0 : wifiDotBrand.hashCode());
		result = prime * result + ((wifiDotModel == null) ? 0 : wifiDotModel.hashCode());
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
		WifiDot other = (WifiDot) obj;
		if (idwifiDot == null) {
			if (other.idwifiDot != null)
				return false;
		} else if (!idwifiDot.equals(other.idwifiDot))
			return false;
		if (inverter_id == null) {
			if (other.inverter_id != null)
				return false;
		} else if (!inverter_id.equals(other.inverter_id))
			return false;
		if (ipAdress == null) {
			if (other.ipAdress != null)
				return false;
		} else if (!ipAdress.equals(other.ipAdress))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (wifiDotBrand == null) {
			if (other.wifiDotBrand != null)
				return false;
		} else if (!wifiDotBrand.equals(other.wifiDotBrand))
			return false;
		if (wifiDotModel == null) {
			if (other.wifiDotModel != null)
				return false;
		} else if (!wifiDotModel.equals(other.wifiDotModel))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "WifiDot [idwifiDot=" + idwifiDot + ", wifiDotModel=" + wifiDotModel + ", wifiDotBrand=" + wifiDotBrand
				+ ", ipAdress=" + ipAdress + ", location=" + location + ", inverter_id=" + inverter_id + "]";
	}

}
