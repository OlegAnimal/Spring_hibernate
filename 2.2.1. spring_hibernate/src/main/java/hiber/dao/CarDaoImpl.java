package hiber.dao;

import hiber.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CarDaoImpl implements CarDao {

    private SessionFactory sessionFactory;

    @Autowired
    public CarDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public User getUserByCar(String model, int series) {
        return (User) sessionFactory.getCurrentSession().
                createQuery("from User u where u.car.model = :m and u.car.series = :s")
                .setParameter("m", model)
                .setParameter("s", series)
                .getSingleResult();
    }
}
