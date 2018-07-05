package by.htp.inventory.domain;

import java.io.Serializable;

public class Printer implements Serializable {

	private static final long serialVersionUID = -1168437459986423689L;

	
	private String idPrinter;
	private String printerModel;
	private String printerBrand;
	private boolean color;
	private String printerType;
	private String printerCartridge;
	private boolean ethernet;
	private String location;
	private String inverter_id;
	
	public Printer() {
		super();
	}

	public Printer(String idPrinter, String printerModel, String printerBrand, boolean color, String printerType,
			String printerCartridge, boolean ethernet, String location, String inverter_id) {
		super();
		this.idPrinter = idPrinter;
		this.printerModel = printerModel;
		this.printerBrand = printerBrand;
		this.color = color;
		this.printerType = printerType;
		this.printerCartridge = printerCartridge;
		this.ethernet = ethernet;
		this.location = location;
		this.inverter_id = inverter_id;
	}

	public String getIdPrinter() {
		return idPrinter;
	}

	public void setIdPrinter(String idPrinter) {
		this.idPrinter = idPrinter;
	}

	public String getPrinterModel() {
		return printerModel;
	}

	public void setPrinterModel(String printerModel) {
		this.printerModel = printerModel;
	}

	public String getPrinterBrand() {
		return printerBrand;
	}

	public void setPrinterBrand(String printerBrand) {
		this.printerBrand = printerBrand;
	}

	public boolean isColor() {
		return color;
	}

	public void setColor(boolean color) {
		this.color = color;
	}

	public String getPrinterType() {
		return printerType;
	}

	public void setPrinterType(String printerType) {
		this.printerType = printerType;
	}

	public String getPrinterCartridge() {
		return printerCartridge;
	}

	public void setPrinterCartridge(String printerCartridge) {
		this.printerCartridge = printerCartridge;
	}

	public boolean isEthernet() {
		return ethernet;
	}

	public void setEthernet(boolean ethernet) {
		this.ethernet = ethernet;
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
		result = prime * result + (color ? 1231 : 1237);
		result = prime * result + (ethernet ? 1231 : 1237);
		result = prime * result + ((idPrinter == null) ? 0 : idPrinter.hashCode());
		result = prime * result + ((inverter_id == null) ? 0 : inverter_id.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((printerBrand == null) ? 0 : printerBrand.hashCode());
		result = prime * result + ((printerCartridge == null) ? 0 : printerCartridge.hashCode());
		result = prime * result + ((printerModel == null) ? 0 : printerModel.hashCode());
		result = prime * result + ((printerType == null) ? 0 : printerType.hashCode());
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
		Printer other = (Printer) obj;
		if (color != other.color)
			return false;
		if (ethernet != other.ethernet)
			return false;
		if (idPrinter == null) {
			if (other.idPrinter != null)
				return false;
		} else if (!idPrinter.equals(other.idPrinter))
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
		if (printerBrand == null) {
			if (other.printerBrand != null)
				return false;
		} else if (!printerBrand.equals(other.printerBrand))
			return false;
		if (printerCartridge == null) {
			if (other.printerCartridge != null)
				return false;
		} else if (!printerCartridge.equals(other.printerCartridge))
			return false;
		if (printerModel == null) {
			if (other.printerModel != null)
				return false;
		} else if (!printerModel.equals(other.printerModel))
			return false;
		if (printerType == null) {
			if (other.printerType != null)
				return false;
		} else if (!printerType.equals(other.printerType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Printer [idPrinter=" + idPrinter + ", printerModel=" + printerModel + ", printerBrand=" + printerBrand
				+ ", color=" + color + ", printerType=" + printerType + ", printerCartridge=" + printerCartridge
				+ ", ethernet=" + ethernet + ", location=" + location + ", inverter_id=" + inverter_id + "]";
	}

	

}
