package by.htp.inventory.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="diagonal")
public class Diagonal extends BaseEntity{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3727888134224389482L;
	@Column(name="diagonals")
	private String diagonal;
	public Diagonal() {
	}
	public Diagonal(int id) {
		super(id);
	}
	public Diagonal(String diagonal) {
		super();
		this.diagonal = diagonal;
	}
	public String getDiagonal() {
		return diagonal;
	}
	public void setDiagonal(String diagonal) {
		this.diagonal = diagonal;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((diagonal == null) ? 0 : diagonal.hashCode());
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
		Diagonal other = (Diagonal) obj;
		if (diagonal == null) {
			if (other.diagonal != null)
				return false;
		} else if (!diagonal.equals(other.diagonal))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Diagonal [diagonal=" + diagonal + "]";
	}
	
	
	
}
