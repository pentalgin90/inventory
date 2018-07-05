package by.htp.inventory.domain;

import java.io.Serializable;

public class Terminal implements Serializable{

	private static final long serialVersionUID = -43069223515089818L;
	
	private String idTerminal;
	private String terminalBrand;
	private String terminalModel;
	private String location;
	private String inverter_id;
	
	public Terminal() {
		super();
	}

	public Terminal(String idTerminal, String terminalBrand, String terminalModel, String location,
			String inverter_id) {
		super();
		this.idTerminal = idTerminal;
		this.terminalBrand = terminalBrand;
		this.terminalModel = terminalModel;
		this.location = location;
		this.inverter_id = inverter_id;
	}

	public String getIdTerminal() {
		return idTerminal;
	}

	public void setIdTerminal(String idTerminal) {
		this.idTerminal = idTerminal;
	}

	public String getTerminalBrand() {
		return terminalBrand;
	}

	public void setTerminalBrand(String terminalBrand) {
		this.terminalBrand = terminalBrand;
	}

	public String getTerminalModel() {
		return terminalModel;
	}

	public void setTerminalModel(String terminalModel) {
		this.terminalModel = terminalModel;
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
		result = prime * result + ((idTerminal == null) ? 0 : idTerminal.hashCode());
		result = prime * result + ((inverter_id == null) ? 0 : inverter_id.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((terminalBrand == null) ? 0 : terminalBrand.hashCode());
		result = prime * result + ((terminalModel == null) ? 0 : terminalModel.hashCode());
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
		Terminal other = (Terminal) obj;
		if (idTerminal == null) {
			if (other.idTerminal != null)
				return false;
		} else if (!idTerminal.equals(other.idTerminal))
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
		if (terminalBrand == null) {
			if (other.terminalBrand != null)
				return false;
		} else if (!terminalBrand.equals(other.terminalBrand))
			return false;
		if (terminalModel == null) {
			if (other.terminalModel != null)
				return false;
		} else if (!terminalModel.equals(other.terminalModel))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Terminal [idTerminal=" + idTerminal + ", terminalBrand=" + terminalBrand + ", terminalModel="
				+ terminalModel + ", location=" + location + ", inverter_id=" + inverter_id + "]";
	}


	


	

	

}
