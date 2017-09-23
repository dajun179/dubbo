package Test;

import com.lb.utils.HttpTool;

public class Test {
	
	public static void main(String[] args) {

		HttpTool t = new HttpTool();
		
//		String condition = "{\"loginName\":\"55555555\",\"loginPassword\":\"55555555\",\"name\":\"155\",\"phone\":\"15165\"}";
//		String str = "condition="+condition;
//		
//		System.out.println(t.request("http://www.fightinlife.top:8080/dubbo-controller/user/addSysUser.do", str, "POST"));
	
		//String condition = "{\"loginName\":\"55555555\",\"loginPassword\":\"55555555\"}";
		String str = "loginName=adfs&loginPassword=000";
		
//		System.out.println(t.request("http://www.fightinlife.top:8080/dubbo-controller/user/login.do", str, "POST"));
		System.out.println(t.request("http://127.0.0.1:8080/dubbo-controller/user/addSysUser.do", str, "POST"));
		
	}
	
}
