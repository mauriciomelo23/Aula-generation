
public class AnimalTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnimalCao ani1 = new AnimalCao();
		AnimalCavalo ani2 = new AnimalCavalo();
		AnimalPreguica ani3 = new AnimalPreguica();
		
		ani1.setNome("Brutos");
		ani1.setIdade(8);
		ani1.setSom("Au-Au");
		ani1.setCorre("30KMh");
		System.out.println("\nVelocidade Cão: "+ ani1.getCorre()+"\nNome: "+ani1.getNome()+"\nIdade: "+ani1.getIdade()+"\n");

		ani1.fazerSom();
		
		
		ani2.setNome("Pé de pano");
		ani2.setIdade(12);
		ani2.setSom("Iuhuhuh");
		ani2.setCorrer("60KMh");
		System.out.println("\nVelocidade Cavalo: "+ ani2.getCorrer()+"\nNome: "+ani2.getNome()+"\nIdade: "+ani2.getIdade()+"\n");

		ani2.fazerSom();
		
		
		ani3.setNome("Sleep");
		ani3.setIdade(20);
		ani3.setSom("ZzZzZz");
		ani3.setAnda("1KMh");
		System.out.println("\nVelocidade Preguiça: "+ ani3.getAnda()+"\nNome: "+ani3.getNome()+"\nIdade: "+ani3.getIdade()+"\n");

		ani3.fazerSom();
		
		
		
		
		
	}

}
