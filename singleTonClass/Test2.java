package singleTonClass;

public class Test2 {
	private static Test2 ob=null;//(i)private static reference variable
	private Test2() {}//(ii)private Constructor
	static//(a)Early Instantiation process
	
	{
		ob = new Test2();

	}
//	if(ob==null)//(b)Late Instantiation process
//	{
//	ob = new Test3();
//	}
	public static Test2 getRef()//(iii)static method
	{
		return ob;
	}
	public void dis(int k)
	{
		System.out.println("====dis(k)===");
		System.out.println("The value k:"+k);
	}

}
