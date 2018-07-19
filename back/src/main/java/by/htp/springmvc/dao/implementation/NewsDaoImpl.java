// package by.htp.springmvc.dao.implementation;
//
// import java.sql.SQLException;
// import java.util.ArrayList;
// import java.util.Collection;
// import java.util.List;
//
// import javax.persistence.EntityManager;
// import javax.persistence.EntityTransaction;
// import javax.persistence.PersistenceUnit;
//
// import org.hibernate.Session;
// import org.springframework.stereotype.Repository;
// import org.springframework.transaction.annotation.Transactional;
//
// import by.htp.springmvc.component.News;
//
// @Repository
// public class NewsDaoImpl implements by.htp.springmvc.dao.interfaces.NewsDao {
//
// @PersistenceUnit
// private EntityManager entityManager;
// private Session session;
//
// @Transactional
// @Override
// public void addNews(News news) throws SQLException, Exception {
// EntityTransaction transaction = entityManager.getTransaction();
// transaction.begin();
// entityManager.persist(news);
// transaction.commit();
// entityManager.close();
// }
//
// @Transactional
// @Override
// public void updateNews(News news) throws SQLException, Exception {
// session.beginTransaction();
// session.update(news);
// session.getTransaction().commit();
//
// }
//
// @Override
// public News getNewsById(Long id) throws SQLException, Exception {
// News news = null;
// news = (News) session.load(News.class, id);
// return news;
// }
//
// @SuppressWarnings("unchecked")
// @Override
// public Collection<News> getAllNews() throws SQLException, Exception {
// List<News> news = new ArrayList<News>();
// news = session.createCriteria(News.class).list();
// return news;
// }
//
// @Override
// public void deleteNews(News news) throws SQLException, Exception {
// session.beginTransaction();
// session.delete(news);
// session.getTransaction().commit();
// }
// }
