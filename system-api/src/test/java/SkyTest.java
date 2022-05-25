import com.swing.sky.system.Sky;
import com.swing.sky.system.module.dao.SysRoleDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Sky.class)
public class SkyTest {

    @Resource
    private SysRoleDAO sysRoleDAO;

    @Test
    public void test() {
        System.out.println("Test Successful");
    }

    @Test
    public void test1() {
        sysRoleDAO.listAll().forEach(System.out::println);
    }

}
