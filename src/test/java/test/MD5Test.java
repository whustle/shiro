package test;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.junit.Test;

/**
 * MD5Test class
 *
 * @author wjh
 * @date 2018/10/25
 */

public class MD5Test {
	@Test
	public void md5(){
		Md5Hash hash=new Md5Hash("wang","wang",3);
		System.out.println(hash);
	}
}
