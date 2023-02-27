public class Main{
	public static void main(String[] args){
		User user = new User("Bob");
		Persister unit = new Persister(user);
		unit.save();
		unit.report();


	}
}