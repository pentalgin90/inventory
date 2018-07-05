package by.htp.inventory.domain;

import java.io.Serializable;

public class Server implements Serializable{

	private static final long serialVersionUID = 8399024132154999327L;
	
	private String idServer;
	private int ram;
	private String serverCpu;
	private String serverModel;
	private String serverBrand;
	private int allCpu;
	private String location;
	private int hdd;
	private int ssd;
	private String raid;
	private String inverter_id;
	
	public Server() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Server(String idServer, int ram, String serverCpu, String serverModel, String serverBrand, int allCpu,
			String location, int hdd, int ssd, String raid, String inverter_id) {
		super();
		this.idServer = idServer;
		this.ram = ram;
		this.serverCpu = serverCpu;
		this.serverModel = serverModel;
		this.serverBrand = serverBrand;
		this.allCpu = allCpu;
		this.location = location;
		this.hdd = hdd;
		this.ssd = ssd;
		this.raid = raid;
		this.inverter_id = inverter_id;
	}

	public String getIdServer() {
		return idServer;
	}

	public void setIdServer(String idServer) {
		this.idServer = idServer;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getServerCpu() {
		return serverCpu;
	}

	public void setServerCpu(String serverCpu) {
		this.serverCpu = serverCpu;
	}

	public String getServerModel() {
		return serverModel;
	}

	public void setServerModel(String serverModel) {
		this.serverModel = serverModel;
	}

	public String getServerBrand() {
		return serverBrand;
	}

	public void setServerBrand(String serverBrand) {
		this.serverBrand = serverBrand;
	}

	public int getAllCpu() {
		return allCpu;
	}

	public void setAllCpu(int allCpu) {
		this.allCpu = allCpu;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getHdd() {
		return hdd;
	}

	public void setHdd(int hdd) {
		this.hdd = hdd;
	}

	public int getSsd() {
		return ssd;
	}

	public void setSsd(int ssd) {
		this.ssd = ssd;
	}

	public String getRaid() {
		return raid;
	}

	public void setRaid(String raid) {
		this.raid = raid;
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
		result = prime * result + allCpu;
		result = prime * result + hdd;
		result = prime * result + ((idServer == null) ? 0 : idServer.hashCode());
		result = prime * result + ((inverter_id == null) ? 0 : inverter_id.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((raid == null) ? 0 : raid.hashCode());
		result = prime * result + ram;
		result = prime * result + ((serverBrand == null) ? 0 : serverBrand.hashCode());
		result = prime * result + ((serverCpu == null) ? 0 : serverCpu.hashCode());
		result = prime * result + ((serverModel == null) ? 0 : serverModel.hashCode());
		result = prime * result + ssd;
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
		Server other = (Server) obj;
		if (allCpu != other.allCpu)
			return false;
		if (hdd != other.hdd)
			return false;
		if (idServer == null) {
			if (other.idServer != null)
				return false;
		} else if (!idServer.equals(other.idServer))
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
		if (raid == null) {
			if (other.raid != null)
				return false;
		} else if (!raid.equals(other.raid))
			return false;
		if (ram != other.ram)
			return false;
		if (serverBrand == null) {
			if (other.serverBrand != null)
				return false;
		} else if (!serverBrand.equals(other.serverBrand))
			return false;
		if (serverCpu == null) {
			if (other.serverCpu != null)
				return false;
		} else if (!serverCpu.equals(other.serverCpu))
			return false;
		if (serverModel == null) {
			if (other.serverModel != null)
				return false;
		} else if (!serverModel.equals(other.serverModel))
			return false;
		if (ssd != other.ssd)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Server [idServer=" + idServer + ", ram=" + ram + ", serverCpu=" + serverCpu + ", serverModel="
				+ serverModel + ", serverBrand=" + serverBrand + ", allCpu=" + allCpu + ", location=" + location
				+ ", hdd=" + hdd + ", ssd=" + ssd + ", raid=" + raid + ", inverter_id=" + inverter_id + "]";
	}


	
	

}
