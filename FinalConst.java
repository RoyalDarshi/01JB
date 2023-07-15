class FinalConst 
{
	FinalConst(){
		System.out.println("We can not use final keyword to constructor");
		System.out.println("Because it is imlicitely declared as a final");
		System.out.println("So no need to use final keyword again");
		System.out.println("If we place final keyword explicitely then");
		System.out.println("Complier gives error that");
		System.out.println("final keyword not allowed here");
	}
	public static void main(String[] args) 
	{
		FinalConst fc=new FinalConst();
	}
}
