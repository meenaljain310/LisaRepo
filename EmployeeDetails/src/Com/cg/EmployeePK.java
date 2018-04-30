package Com.cg;

public class EmployeePK {
	int id;
	String entity;
	public EmployeePK(int id2, String entity2)
	{
			this.id=id2;
			this.entity=entity2;
		}
	public int getId()
	   {
		   return id;
	   }
	   public String getEntity()
	   {
		   return entity;
	   }
}
