package assign1;

public class EncapTest {
	   private String name;
	   private String idNum;
	   private int age;

	   public int getAge(){
	      return age;
	   }

	   public String getName(){
	      return name;
	   }

	   public String getIdNum(){
	      return idNum;
	   }

	   public void setAge( int newAge){
		   if(newAge>0)
	      age = newAge;
		   else
			   System.out.println("Enter a positive value");
	   }

	   public void setName(String newName){
	      name = newName;
	   }

	   public void setIdNum( String newId){
	      idNum = newId;
	   }
}
