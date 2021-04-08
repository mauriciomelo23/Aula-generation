
public class AnimalCao  extends Animal{
	
	private String corre;
	
	public AnimalCao()
	{
		
	}
	
	public AnimalCao(String nome, int idade, String som)
	{
		super(nome, idade, som);
		
	}
	
	public AnimalCao(String corre)
	{
		this.corre = corre;
	}

	public String getCorre() {
		return corre;
	}

	public void setCorre(String corre) {
		this.corre = corre;
	}
	
	
}
