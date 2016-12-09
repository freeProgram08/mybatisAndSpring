import com.mytest.dao.IUserDao;
import com.mytest.entity.User;
import com.mytest.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Administrator on 2016/12/8.
 */
public class DaoTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("spring.xml");
        /*UserService userService = context.getBean("userService", UserService.class);*/

        IUserDao iUserDao = context.getBean("IUserDao", IUserDao.class);

    }
}
