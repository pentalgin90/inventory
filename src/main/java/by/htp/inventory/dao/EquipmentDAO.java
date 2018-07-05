package by.htp.inventory.dao;

import java.util.List;

import by.htp.inventory.domain.Brand;
import by.htp.inventory.domain.Commutator;
import by.htp.inventory.domain.Computer;
import by.htp.inventory.domain.Cpu;
import by.htp.inventory.domain.Diagonal;
import by.htp.inventory.domain.Gpu;
import by.htp.inventory.domain.Matherboard;
import by.htp.inventory.domain.Monitor;


public interface EquipmentDAO {
	
	List<Brand> brandAll();
	List<Diagonal> diagonalAll();
	List<Cpu> cpuAll();
	List<Gpu> gpuAll();
	List<Matherboard> matherboardAll();
	
	void addMonitor(Monitor monitor);
	List<Monitor> monitorAll();
	void deleteMonitor(int id);
	void updateMonitor(Monitor newMonitor);
	Monitor getMonitor(int id);
	
	void addCommutator(Commutator commutator);
	List<Commutator> commutstorAll();
	void deleteCommutator(int id);
	void updateCommutator(Commutator newCommutator);
	Commutator getCommutator(int id);
	
	void addComputer(Computer computer);
	List<Computer> computerAll();
	void deleteComputer(int id);
	void updateComputer(Computer newComputer);
	Computer getComputer(int id);
	
}
