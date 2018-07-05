package by.htp.inventory.dao.hbn;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import by.htp.inventory.dao.EquipmentDAO;
import by.htp.inventory.domain.Brand;
import by.htp.inventory.domain.Commutator;
import by.htp.inventory.domain.Computer;
import by.htp.inventory.domain.Cpu;
import by.htp.inventory.domain.Diagonal;
import by.htp.inventory.domain.Gpu;
import by.htp.inventory.domain.Matherboard;
import by.htp.inventory.domain.Monitor;
import by.htp.inventory.domain.User;

public class EquipmentDaoHibernateImpl implements EquipmentDAO{

	@Override
	public void addMonitor(Monitor monitor) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.getTransaction().begin();
		session.save(monitor);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public List<Monitor> monitorAll() {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		
		Criteria criteria = session.createCriteria(Monitor.class);
		
		return criteria.list();
	}

	@Override
	public void deleteMonitor(int id) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.getTransaction().begin();
		Monitor monitor = (Monitor) session.get(Monitor.class, id);
		session.delete(monitor);
		session.getTransaction().commit();
		session.close();
		
	}

	@Override
	public void updateMonitor(Monitor newMonitor) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		Monitor monitor = (Monitor) session.get(Monitor.class, newMonitor.getId());
		session.getTransaction().begin();
		monitor.setBrand(newMonitor.getBrand());
		monitor.setDiagonal(newMonitor.getDiagonal());
		monitor.setInverterId(newMonitor.getInverterId());
		monitor.setMonitorModel(newMonitor.getMonitorModel());
		monitor.setLocation(newMonitor.getLocation());
		session.update(monitor);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public Monitor getMonitor(int id) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		Monitor monitor = (Monitor) session.get(Monitor.class, id);
		session.close();
		return monitor;
	}

	@Override
	public List<Brand> brandAll() {
		Session session = SessionFactoryManager.getSessionFactory().openSession();

		Criteria criteria = session.createCriteria(Brand.class);

		return criteria.list();
	}

	@Override
	public List<Diagonal> diagonalAll() {
		Session session = SessionFactoryManager.getSessionFactory().openSession();

		Criteria criteria = session.createCriteria(Diagonal.class);

		return criteria.list();
	}

	@Override
	public void addCommutator(Commutator commutator) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.getTransaction().begin();
		session.save(commutator);
		session.getTransaction().commit();
		session.close();		
	}

	@Override
	public List<Commutator> commutstorAll() {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		
		Criteria criteria = session.createCriteria(Commutator.class);
		
		return criteria.list();
	}

	@Override
	public void deleteCommutator(int id) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.getTransaction().begin();
		Commutator commutator = (Commutator) session.get(Commutator.class, id);
		session.delete(commutator);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void updateCommutator(Commutator newCommutator) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		Commutator commutator = (Commutator) session.get(Commutator.class, newCommutator.getId());
		session.getTransaction().begin();
		commutator.setCommutatorModel(newCommutator.getCommutatorModel());
		commutator.setInverterId(newCommutator.getInverterId());
		commutator.setFc(newCommutator.isFc());
		commutator.setLocation(newCommutator.getLocation());
		commutator.setPort(newCommutator.getPort());
		session.update(commutator);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public Commutator getCommutator(int id) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		Commutator commutator = (Commutator) session.get(Commutator.class, id);
		session.close();
		return commutator;
	}

	@Override
	public List<Cpu> cpuAll() {
		Session session = SessionFactoryManager.getSessionFactory().openSession();

		Criteria criteria = session.createCriteria(Cpu.class);

		return criteria.list();
	}

	@Override
	public List<Gpu> gpuAll() {
		Session session = SessionFactoryManager.getSessionFactory().openSession();

		Criteria criteria = session.createCriteria(Gpu.class);

		return criteria.list();
	}

	@Override
	public void addComputer(Computer computer) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.getTransaction().begin();
		session.save(computer);
		session.getTransaction().commit();
		session.close();
		
	}

	@Override
	public List<Computer> computerAll() {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		Criteria criteria = session.createCriteria(Computer.class);
		return criteria.list();
	}

	@Override
	public void deleteComputer(int id) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.getTransaction().begin();
		Computer computer = (Computer) session.get(Computer.class, id);
		session.delete(computer);
		session.getTransaction().commit();
		session.close();
		
		
	}

	@Override
	public void updateComputer(Computer newComputer) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		Computer computer = (Computer) session.get(Computer.class, newComputer.getId());
		session.getTransaction().begin();
		computer.setRam(newComputer.getRam());
		computer.setCpu(newComputer.getCpu());
		computer.setGpu(newComputer.getGpu());
		computer.setLocation(newComputer.getLocation());
		computer.setHdd(newComputer.getHdd());
		computer.setMatherboard(newComputer.getMatherboard());
		computer.setSsd(newComputer.getSsd());
		computer.setInventar_id(newComputer.getInventar_id());
		session.update(computer);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public Computer getComputer(int id) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		Computer computer = (Computer) session.get(Computer.class, id);
		session.close();
		return computer;
	}

	@Override
	public List<Matherboard> matherboardAll() {
		Session session = SessionFactoryManager.getSessionFactory().openSession();

		Criteria criteria = session.createCriteria(Matherboard.class);
		criteria.toString();
		return criteria.list();
	}

}
