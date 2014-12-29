package assign1;

//The variables of the EncapTest class can be access as below::
public class RunEncapTest {
	 public static void main(String args[]){
	      EncapTest encap = new EncapTest(); 
	      encap.setName("James");
	      encap.setAge(-20);
	      encap.setIdNum("12343ms");

	      System.out.print("Name : " + encap.getName()+ 
	                             " Age : "+ encap.getAge());        
	//	 encap.name="Geetha";
		 
	/*	 PrivateTest ob=new PrivateTest();
		 ob.a=10;
		System.out.println(ob.a);               */
	      
	/*	 PrivateTest ob=new PrivateTest();  
	 	 ob.a=10;
		System.out.println(ob.a);            
		
		 ob.a=-10;
		System.out.println(ob.a);         */   
			
	 
	  }

		
	}

















//This would produce the following result:

//Name : James Age : 20