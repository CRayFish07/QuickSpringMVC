package ssm;

import org.junit.Before;
import org.junit.Test;
import com.google.gson.Gson;
import me.pwcong.ssm.entity.User;
import me.pwcong.ssm.utils.DigestCoder;
import me.pwcong.ssm.utils.HttpClientUtils;

public class TestUser {

	static Gson gson;
	static{
		gson=new Gson();
	}

	@Before
	public void testRegister(){

		User user=new User();
		user.setUid("pwcong");
		user.setPwd(DigestCoder.MD5Encode("123456"));

		String postJsonEntity = HttpClientUtils.postJsonEntity("http://localhost:8080/user/register.action", user);
		System.out.println(postJsonEntity);

	}



	@Test
	public void TestLogin(){

		User user=new User();
		user.setUid("pwcong");
		user.setPwd(DigestCoder.MD5Encode("123456"));
		String postJsonEntity = HttpClientUtils.postJsonEntity("http://localhost:8080/user/login.action", user);
		System.out.println(postJsonEntity);

	}


}
