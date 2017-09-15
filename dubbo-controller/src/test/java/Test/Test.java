package Test;

import com.lb.utils.HttpTool;

public class Test {
	
	public static void main(String[] args) {

		HttpTool t = new HttpTool();
		
		String condition = "{\"loginName\":\"222222222\",\"loginPassword\":\"25151\",\"name\":\"155\",\"phone\":\"15165\"}";
		String str = "condition="+condition;
		
		System.out.println(t.request("http://localhost:8080/dubbo-controller/user/addSysUser.do", str, "POST"));

	}
	
}
