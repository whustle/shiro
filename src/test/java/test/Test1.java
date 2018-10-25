package test;

import com.lz.service.PermissionService;
import com.lz.service.UserService;
import com.lz.service.impl.PermissionServiceImpl;
import com.lz.service.impl.UserServiceImpl;
import org.junit.Test;

/**
 * Test1 class
 *
 * @author wjh
 * @date 2018/10/23
 */

public class Test1 {
	@Test
	public void test(){
		PermissionService p=new PermissionServiceImpl();
		System.out.println(p.getClass());
		String name = p.getClass().getName();
	}
}
