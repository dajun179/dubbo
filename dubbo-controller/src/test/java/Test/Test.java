package Test;

import com.lb.utils.HttpTool;

public class Test {
	
	public static void main(String[] args) {

		HttpTool t = new HttpTool();
		
		String condition = "{\"loginName\":\"55555555\",\"loginPassword\":\"55555555\",\"name\":\"155\",\"phone\":\"15165\"}";
		String str = "condition="+condition;
		
		System.out.println(t.request("http://localhost:8080/dubbo-controller/user/addSysUser.do", str, "POST"));

	}
	
}
