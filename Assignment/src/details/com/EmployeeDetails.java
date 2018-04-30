package details.com;

public class EmployeeDetails {

	public static void main(String[] args)
	{
		City  city[] = new City[5];
		Country country[] = new Country[5];
		Address address[] = new Address[5];
		Employee e[] = new Employee[5];
		String eCity[] = {"jaipur","hyd","pune","mumbai","banglore"};
		String eCountry[] = {"India","bangladesh","canada","France","Germeny"};
		String eAddress[] = {"1st lane","2nd lane","3rd lane","4th lane","5th lane"};
		String eName[] = {"meenal","Hari","Haneef","RamTeja","Vinayak"};
		
		for(int i=0;i<5;i++)
		{
			
			city[i]=new City();
			city[i].setName(eCity[i]);
			country[i]=new Country();
			country[i].setName(eCountry[i]);
			country[i].setCity(city[i]);
			address[i]=new Address();
			address[i].setLine(eAddress[i]);
			address[i].setCountry(country[i]);
			e[i]=new Employee();
			e[i].setName(eName[i]);
			e[i].setAddress(address[i]);
		}
		
		for(int j=0;j<5;j++)
		{
		System.out.println("Name="+e[j].getName());
		System.out.println("Address="+e[j].getAddress().getLine());
		System.out.println("Country="+e[j].getAddress().getCountry().getName());
		System.out.println("City="+e[j].getAddress().getCountry().getCity().getName());
		System.out.println("-----------------------------------------------------------");
		}
	}
}