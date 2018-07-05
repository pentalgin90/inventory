package by.htp.inventory.domain;

import java.io.Serializable;

public class DocStationTerminal implements Serializable{

	private static final long serialVersionUID = -1049670338492048185L;
	
	private String idDocStationTerminal;
	private String docStModel;
	private String docStBrand;
	private String location;
	private String inverter_id;
	
	public DocStationTerminal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DocStationTerminal(String idDocStationTerminal, String docStModel, String docStBrand, String location,
			String inverter_id) {
		super();
		this.idDocStationTerminal = idDocStationTerminal;
		this.docStModel = docStModel;
		this.docStBrand = docStBrand;
		this.location = location;
		this.inverter_id = inverter_id;
	}

	public String getIdDocStationTerminal() {
		return idDocStationTerminal;
	}

	public void setIdDocStationTerminal(String idDocStationTerminal) {
		this.idDocStationTerminal = idDocStationTerminal;
	}

	public String getDocStModel() {
		return docStModel;
	}

	public void setDocStModel(String docStModel) {
		this.docStModel = docStModel;
	}

	public String getDocStBrand() {
		return docStBrand;
	}

	public void setDocStBrand(String docStBrand) {
		this.docStBrand = docStBrand;
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
		result = prime * result + ((docStBrand == null) ? 0 : docStBrand.hashCode());
		result = prime * result + ((docStModel == null) ? 0 : docStModel.hashCode());
		result = prime * result + ((idDocStationTerminal == null) ? 0 : idDocStationTerminal.hashCode());
		result = prime * result + ((inverter_id == null) ? 0 : inverter_id.hashCode());
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
		DocStationTerminal other = (DocStationTerminal) obj;
		if (docStBrand == null) {
			if (other.docStBrand != null)
				return false;
		} else if (!docStBrand.equals(other.docStBrand))
			return false;
		if (docStModel == null) {
			if (other.docStModel != null)
				return false;
		} else if (!docStModel.equals(other.docStModel))
			return false;
		if (idDocStationTerminal == null) {
			if (other.idDocStationTerminal != null)
				return false;
		} else if (!idDocStationTerminal.equals(other.idDocStationTerminal))
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
		return true;
	}

	@Override
	public String toString() {
		return "DocStationTerminal [idDocStationTerminal=" + idDocStationTerminal + ", docStModel=" + docStModel
				+ ", docStBrand=" + docStBrand + ", location=" + location + ", inverter_id=" + inverter_id + "]";
	}

	
	
	
	
	

}
