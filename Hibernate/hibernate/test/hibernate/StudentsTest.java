package hibernate;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StudentsTest {
	
	
	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;

	@Before
	public void init() {
		//�������ö���
		Configuration config = new Configuration().configure();
		//��������ע�����
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		//�����Ự��������
		sessionFactory = config.buildSessionFactory(serviceRegistry);
		//�Ự����
		session = sessionFactory.openSession();
		//��������
		transaction = session.beginTransaction();
	}
	
	@After
	public void destory(){
		transaction.commit();//�ύ����
		session.close();//�رջỰ
		sessionFactory.close();//�رջỰ����
	}
	
	@Test
	public void testSaveStudents()
	{
		//����ѧ������
		Students s = new Students(1,"������","��",new Date(),"�䵱ɽ");
		//�������������ݿ�
		session.save(s);
	}
}