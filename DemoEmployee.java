package employeeData;

public class DemoEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  EmpPersonalInfo epr = new EmpPersonalInfo();
		  

epr.setEname("faijan");
epr.setEmailId("scds@sdfds.com");
epr.setResaddr("palanpur");
epr.setMobileno(123456);


System.out.println(epr);  //  epr.toString() 


//System.out.println(epr.getEname() + " " + epr.getEmailId() + " " + epr.getMobileno());
	
	
EmpPersonalInfo epr1 = new EmpPersonalInfo();
	epr1.setEname("mango");
	epr1.setResaddr("On the tree");
	
	
	System.out.println(epr1);  //epr1.toString()
	
	
	}

}
