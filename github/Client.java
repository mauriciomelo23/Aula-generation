import java.text.NumberFormat;

public class Client {
	
	private String nome;
	private String cpf;
	private String genero;
	private String email;
	private int produto=0;
 
	public Client(String nome, String cpf, String genero, String email)
	{
		this.nome = nome;
		this.cpf = cpf;
		this.genero = genero;
		this.email = email;
	}
	
	public void produto()
	{
		this.produto++;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getProduto() {
		return produto;
	}

	public void setProduto(int produto) {
		this.produto = produto;
	}

	public void devolverProduto()
	{
		if(produto>0)
		{
			this.produto--;
		}
	}
	
	public void printInfo()
	{
		System.out.println("info Cliente\nNome: "+nome+"\nCPF "+cpf+"\ngenero"+genero+"\nemail"+email+"produto comprado"+produto);
	}
			
}
