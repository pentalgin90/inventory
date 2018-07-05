package by.htp.inventory.service.impl;

import java.util.List;

import by.htp.inventory.dao.EquipmentDAO;
import by.htp.inventory.dao.hbn.EquipmentDaoHibernateImpl;

import by.htp.inventory.domain.Brand;
import by.htp.inventory.domain.Commutator;
import by.htp.inventory.domain.Computer;
import by.htp.inventory.domain.Cpu;
import by.htp.inventory.domain.Diagonal;
import by.htp.inventory.domain.Gpu;
import by.htp.inventory.domain.Matherboard;
import by.htp.inventory.domain.Monitor;
import by.htp.inventory.service.EquipmentService;

public class EquipmentServiceImpl implements EquipmentService {

	private EquipmentDAO equipmentDAO;
	
	
	public EquipmentServiceImpl() {
	}

	public void setEquipmentDAO(EquipmentDAO equipmentDAO) {
		this.equipmentDAO = equipmentDAO;
	}

	@Override
	public List<Brand> brandAll() {
		EquipmentDAO equipmentDAO = new EquipmentDaoHibernateImpl();
		return equipmentDAO.brandAll();
	}

	@Override
	public List<Diagonal> diagonalAll() {
		EquipmentDAO equipmentDAO = new EquipmentDaoHibernateImpl();
		return equipmentDAO.diagonalAll();
	}

	@Override
	public void addMonitor(Monitor monitor) {
		EquipmentDAO equipmentDAO = new EquipmentDaoHibernateImpl();
		equipmentDAO.addMonitor(monitor);
		
	}

	@Override
	public List<Monitor> monitorAll() {
		EquipmentDAO equipmentDAO = new EquipmentDaoHibernateImpl();
		return equipmentDAO.monitorAll();
	}

	@Override
	public void deleteMonitor(int id) {
		EquipmentDAO equipmentDAO = new EquipmentDaoHibernateImpl();
		equipmentDAO.deleteMonitor(id);
		
	}

	@Override
	public void updateMonitor(Monitor newMonitor) {
		EquipmentDAO equipmentDAO = new EquipmentDaoHibernateImpl();
		equipmentDAO.updateMonitor(newMonitor);
	}

	@Override
	/*public Monitor getMonitor(int id) throws NullPointerException{
		Monitor monitor;
		try {
			EquipmentDAO equipmentDAO = new EquipmentDaoHibernateImpl();
			monitor = equipmentDAO.getMonitor(id);
		}catch(NullPointerException e) {
			throw new NullPointerException();
		}
		
		return monitor;
	}*/
	public Monitor getMonitor(int id) {
		EquipmentDAO equipmentDAO = new EquipmentDaoHibernateImpl();
		Monitor monitor = equipmentDAO.getMonitor(id);
		return monitor;
	}

	@Override
	public void addCommutator(Commutator commutator) {
		EquipmentDAO equipmentDAO = new EquipmentDaoHibernateImpl();
		equipmentDAO.addCommutator(commutator);
		
	}

	@Override
	public List<Commutator> commutstorAll() {
		EquipmentDAO equipmentDAO = new EquipmentDaoHibernateImpl();
		return equipmentDAO.commutstorAll();
	}

	@Override
	public void deleteCommutator(int id) {
		EquipmentDAO equipmentDAO = new EquipmentDaoHibernateImpl();
		equipmentDAO.deleteCommutator(id);
		
	}

	@Override
	public void updateCommutator(Commutator newCommutator) {
		EquipmentDAO equipmentDAO = new EquipmentDaoHibernateImpl();
		equipmentDAO.updateCommutator(newCommutator);
		
	}

	@Override
	public Commutator getCommutator(int id) {
		EquipmentDAO equipmentDAO = new EquipmentDaoHibernateImpl();
		return equipmentDAO.getCommutator(id);
	}

	@Override
	public List<Cpu> cpuAll() {
		EquipmentDAO equipmentDAO = new EquipmentDaoHibernateImpl();
		return equipmentDAO.cpuAll();
	}

	@Override
	public List<Gpu> gpuAll() {
		EquipmentDAO equipmentDAO = new EquipmentDaoHibernateImpl();
		return equipmentDAO.gpuAll();
	}

	@Override
	public List<Matherboard> matherboardAll() {
		EquipmentDAO equipmentDAO = new EquipmentDaoHibernateImpl();
		return equipmentDAO.matherboardAll();
	}

	@Override
	public void addComputer(Computer computer) {
		EquipmentDAO equipmentDAO = new EquipmentDaoHibernateImpl();
		equipmentDAO.addComputer(computer);
		
	}

	@Override
	public List<Computer> computerAll() {
		EquipmentDAO equipmentDAO = new EquipmentDaoHibernateImpl();
		return equipmentDAO.computerAll();
	}

	@Override
	public void deleteComputer(int id) {
		EquipmentDAO equipmentDAO = new EquipmentDaoHibernateImpl();
		equipmentDAO.deleteComputer(id);		
	}

	@Override
	public void updateComputer(Computer newComputer) {
		EquipmentDAO equipmentDAO = new EquipmentDaoHibernateImpl();
		equipmentDAO.updateComputer(newComputer);		
	}

	@Override
	public Computer getComputer(int id) {
		EquipmentDAO equipmentDAO = new EquipmentDaoHibernateImpl();
		return equipmentDAO.getComputer(id);
	}

	

}
