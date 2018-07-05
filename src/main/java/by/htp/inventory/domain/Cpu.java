package by.htp.inventory.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table(name="cpu")

public class Cpu extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6750122072367190893L;
	@Column(name="cpu")
	private String cpu;
	public Cpu() {
	}
	public Cpu(int id) {
		super(id);
	}
	public Cpu(String model) {
		super();
		this.cpu = model;
	}
	public Cpu(int id, String model) {
		super(id);
		this.cpu = model;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((cpu == null) ? 0 : cpu.hashCode());
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
		Cpu other = (Cpu) obj;
		if (cpu == null) {
			if (other.cpu != null)
				return false;
		} else if (!cpu.equals(other.cpu))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Cpu [cpu=" + cpu + "]";
	}
	
	

}
