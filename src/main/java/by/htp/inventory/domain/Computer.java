package by.htp.inventory.domain;



import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="computer")
public class Computer extends BaseEntity{

	
	private static final long serialVersionUID = -7517177420826207900L;
	@Column(name="ram")
	private int ram;
	@Column(name="hdd")
	private int hdd;
	@ManyToOne
	@JoinColumn(name="cpu")
	private Cpu cpu;
	@ManyToOne
	@JoinColumn(name="gpu")
	private Gpu gpu;
	//@ElementCollection(fetch=FetchType.LAZY)
	@ManyToOne
	@JoinColumn(name="matherboard")
	private Matherboard matherboard;
	@Column(name="ssd")
	private int ssd;
	@Column(name="location")
	private String location;
	@Column(name="inventar_id")
	private String inventar_id;
	public Computer() {
	}
	public Computer(int id) {
		super(id);
	}
	public Computer(int ram, int hdd, Cpu cpu, Gpu gpu, Matherboard matherboard, int ssd, String location,
			String inventar_id) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
		this.gpu = gpu;
		this.matherboard = matherboard;
		this.ssd = ssd;
		this.location = location;
		this.inventar_id = inventar_id;
	}
	public Computer(int id, int ram, int hdd, Cpu cpu, Gpu gpu, Matherboard matherboard, int ssd, String location,
			String inventar_id) {
		super(id);
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
		this.gpu = gpu;
		this.matherboard = matherboard;
		this.ssd = ssd;
		this.location = location;
		this.inventar_id = inventar_id;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getHdd() {
		return hdd;
	}
	public void setHdd(int hdd) {
		this.hdd = hdd;
	}
	public Cpu getCpu() {
		return cpu;
	}
	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}
	public Gpu getGpu() {
		return gpu;
	}
	public void setGpu(Gpu gpu) {
		this.gpu = gpu;
	}
	public Matherboard getMatherboard() {
		return matherboard;
	}
	public void setMatherboard(Matherboard matherboard) {
		this.matherboard = matherboard;
	}
	public int getSsd() {
		return ssd;
	}
	public void setSsd(int ssd) {
		this.ssd = ssd;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getInventar_id() {
		return inventar_id;
	}
	public void setInventar_id(String inventar_id) {
		this.inventar_id = inventar_id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((cpu == null) ? 0 : cpu.hashCode());
		result = prime * result + ((gpu == null) ? 0 : gpu.hashCode());
		result = prime * result + hdd;
		result = prime * result + ((inventar_id == null) ? 0 : inventar_id.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((matherboard == null) ? 0 : matherboard.hashCode());
		result = prime * result + ram;
		result = prime * result + ssd;
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
		Computer other = (Computer) obj;
		if (cpu == null) {
			if (other.cpu != null)
				return false;
		} else if (!cpu.equals(other.cpu))
			return false;
		if (gpu == null) {
			if (other.gpu != null)
				return false;
		} else if (!gpu.equals(other.gpu))
			return false;
		if (hdd != other.hdd)
			return false;
		if (inventar_id == null) {
			if (other.inventar_id != null)
				return false;
		} else if (!inventar_id.equals(other.inventar_id))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (matherboard == null) {
			if (other.matherboard != null)
				return false;
		} else if (!matherboard.equals(other.matherboard))
			return false;
		if (ram != other.ram)
			return false;
		if (ssd != other.ssd)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Computer [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + ", gpu=" + gpu + ", matherboard="
				+ matherboard + ", ssd=" + ssd + ", location=" + location + ", inventar_id=" + inventar_id + "]";
	}
	
	
	
	

	
}
