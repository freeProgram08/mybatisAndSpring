import com.mytest.entity.User;

import com.mytest.service.UserShow;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016/12/8.
 */
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    /*        User user = context.getBean("user", User.class);
            System.out.println(user);
            System.out.println(user.getName());*/
    UserShow userShow = context.getBean("userShow", UserShow.class);
        System.out.println(userShow);
        userShow.showUserName();
}
}
