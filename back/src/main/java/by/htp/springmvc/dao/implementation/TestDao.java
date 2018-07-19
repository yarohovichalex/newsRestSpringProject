package by.htp.springmvc.dao.implementation;

import org.hibernate.Session;

public class TestDao {
	public static void main(String[] args) {
		Session session = null;

		try {
			// NewsDaoImpl news = new NewsDaoImpl();
			// System.out.println(news.getAllNews());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}
}
