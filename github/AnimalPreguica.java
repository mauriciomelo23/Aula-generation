
public class AnimalPreguica extends Animal {
	
private String anda;
	
	public AnimalPreguica()
	{
		
	}
	
	public AnimalPreguica(String nome, int idade, String som)
	{
		super(nome,idade,som);
		
	}
	
	public AnimalPreguica(String anda)
	{
		this.anda = anda;
	}
	
	@Override
	public void fazerSom()
	{
		System.out.println("quero dormir p***a");
	}

	public String getAnda() {
		return anda;
	}

	public void setAnda(String anda) {
		this.anda = anda;
	}
	
}
