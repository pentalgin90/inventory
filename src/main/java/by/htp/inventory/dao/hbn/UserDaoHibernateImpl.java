package by.htp.inventory.dao.hbn;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import by.htp.inventory.dao.UserDAO;
import by.htp.inventory.domain.User;

public class UserDaoHibernateImpl implements UserDAO {

	@Override
	public List<User> userAll() {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		
		Criteria criteria = session.createCriteria(User.class);
		
		return criteria.list();
	}

}
