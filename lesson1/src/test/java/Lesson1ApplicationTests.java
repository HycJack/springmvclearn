import com.HycJack.user.dao.RoleDao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class Lesson1ApplicationTests extends BaseTestService {
	private Log log = LogFactory.getLog(Lesson1ApplicationTests.class);
	@Autowired
	private RoleDao roleDao;
	@Test
	public void test() {
		log.info(roleDao.list());
	}

}
