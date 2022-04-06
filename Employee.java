public class employeee{
	int Rid;
	String Name;
   	long Phone;
	String Des;
	String Dep;
	
	public employeee(int r_id,String N_ame, long Pno, String desi, String dept){
		Rid=r_id;
		Name=N_ame;
		Phone=Pno;
		Des=desi;
		Dep=dept;
	}
	void Dis(){
		System.out.println("\nRecord id : "+Rid);
   		System.out.println("Name : "+Name);
		System.out.println("Phone Number : "+Phone);
		System.out.println("Designation : "+Des);
		System.out.println("Department: "+Dep);
	}

	public static void main(String [] args){
	employeee e1= new employeee(111,"Anisree  ",96338843344,"HR","marketing");
	e1.Dis();
	}
}
