package by.htp.inventory.domain;

import java.io.Serializable;

import javax.persistence.*;


@MappedSuperclass
public class BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4626887507591626195L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
	private int id;
	public BaseEntity() {
	}
	public BaseEntity(int id) {
		super();
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		BaseEntity other = (BaseEntity) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Entity [id=" + id + "]";
	}
	
	
}
