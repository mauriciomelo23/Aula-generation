
public class AnimalCavalo  extends Animal{
	
private String correr;
	
	public AnimalCavalo()
	{
		
	}
	
	public AnimalCavalo(String nome, int idade, String som)
	{
		super(nome,idade,som);
		
	}
	
	public AnimalCavalo(String correr)
	{
		this.correr = correr;
	}
	
	@Override
	public void fazerSom()
	{
		System.out.println("pocotopocotopocoto");
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
}
