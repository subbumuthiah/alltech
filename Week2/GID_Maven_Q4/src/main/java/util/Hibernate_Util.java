package util;

import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;

public class Hibernate_Util {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	public static SessionFactory buildSessionFactory() {
		try {
			StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
					.configure("domain/hibernate.cfg.xml").build();
			Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();
			return metadata.getSessionFactoryBuilder().build();
		} catch (Throwable e) {
			System.err.println(e);
			throw new ExceptionInInitializerError(e);
		}
	}

}
