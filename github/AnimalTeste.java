
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
		
		ani2.setNome("Pé de pano");
		ani2.setIdade(12);
		ani2.setSom("Iuhuhuh");
		ani2.setCorrer("60KMh");
		
		ani3.setNome("Sleep");
		ani3.setIdade(20);
		ani3.setSom("ZzZzZz");
		ani3.setAnda("1KMh");
		
		System.out.println("\nVelocidade Cão: "+ ani1.getCorre());
		System.out.println("\nVelocidade Cavalo: "+ ani2.getCorrer());
		System.out.println("\nVelocidade Preguiça: "+ ani3.getAnda());
		
		
	}

}
