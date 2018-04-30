
public class Person implements Comparable
{
	private String userName;
	  Person(String userName)
{
	this.userName = userName;
}
public boolean equals(Object obj)
{
	if(!(obj instanceof Person))
		return false;
	return this.userName.equals(((Person)obj).userName);
	
}

}
