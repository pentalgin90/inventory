package by.htp.inventory.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;

import com.mysql.cj.api.jdbc.Statement;
import by.htp.inventory.dao.EquipmentDAO;
import by.htp.inventory.dao.hbn.SessionFactoryManager;
import by.htp.inventory.domain.Brand;
import by.htp.inventory.domain.Commutator;
import by.htp.inventory.domain.Computer;
import by.htp.inventory.domain.Cpu;
import by.htp.inventory.domain.Diagonal;
import by.htp.inventory.domain.Gpu;
import by.htp.inventory.domain.Matherboard;
import by.htp.inventory.domain.Monitor;
import by.htp.inventory.domain.User;

public class EquipmentDAOImpl implements EquipmentDAO {

	static final Logger logger = Logger.getLogger(EquipmentDAOImpl.class);
	static final String SELECT_ALL_BRAND = "SELECT brand FROM brand;";
	static final String SELECT_ALL_DIAGONAL = "SELECT diagonals FROM diagonal;";
	DaoConnectionHelper conn = new DaoConnectionHelper();
	Connection connection = null;



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
	public void addMonitor(Monitor monitor) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Monitor> monitorAll() {
		Session session = SessionFactoryManager.getSessionFactory().openSession();

		Criteria criteria = session.createCriteria(Monitor.class);

		return criteria.list();
	}

	@Override
	public void deleteMonitor(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateMonitor(Monitor newMonitor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Monitor getMonitor(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addCommutator(Commutator commutator) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Commutator> commutstorAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCommutator(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCommutator(Commutator newCommutator) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Commutator getCommutator(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cpu> cpuAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Gpu> gpuAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addComputer(Computer computer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Computer> computerAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteComputer(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateComputer(Computer newComputer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Computer getComputer(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Matherboard> matherboardAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
