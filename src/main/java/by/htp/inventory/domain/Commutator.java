package by.htp.inventory.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="commutator")
public class Commutator extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -75761134486194013L;
	@Column(name="model")
	private String commutatorModel;
	@Column(name="port")
	private int port;
	@Column(name="fc")
	private String fc;
	@Column(name="location")
	private String location;
	@Column(name="inverter_id")
	private String inverterId;
	
	public Commutator() {
	}
	public Commutator(int id) {
		super(id);
	}
	public Commutator(String commutatorModel, int port, String fc, String location, String inverterId) {
		super();
		this.commutatorModel = commutatorModel;
		this.port = port;
		this.fc = fc;
		this.location = location;
		this.inverterId = inverterId;
	}
	public Commutator(int id, String commutatorModel, int port, String fc, String location, String inverterId) {
		super(id);
		this.commutatorModel = commutatorModel;
		this.port = port;
		this.fc = fc;
		this.location = location;
		this.inverterId = inverterId;
	}
	public String getCommutatorModel() {
		return commutatorModel;
	}
	public void setCommutatorModel(String commutatorModel) {
		this.commutatorModel = commutatorModel;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String isFc() {
		return fc;
	}
	public void setFc(String fc) {
		this.fc = fc;
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

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((commutatorModel == null) ? 0 : commutatorModel.hashCode());
		result = prime * result + ((fc == null) ? 0 : fc.hashCode());
		result = prime * result + ((inverterId == null) ? 0 : inverterId.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + port;
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
		Commutator other = (Commutator) obj;
		if (commutatorModel == null) {
			if (other.commutatorModel != null)
				return false;
		} else if (!commutatorModel.equals(other.commutatorModel))
			return false;
		if (fc == null) {
			if (other.fc != null)
				return false;
		} else if (!fc.equals(other.fc))
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
		if (port != other.port)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Commutator [commutatorModel=" + commutatorModel + ", port=" + port + ", fc=" + fc + ", location="
				+ location + ", inverter_id=" + inverterId + "]";
	}
	
	
	
	
	
}
