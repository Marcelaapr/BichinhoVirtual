package exAnimal;

//Classe onde teremos todos os métodos e ações que o bichinho virtual possui.
public class Animais {
	private String nome; 
	private String classe;
	private String familia;
	private int idade;
	private boolean estado;
	private int caloria;
	private int forca;
	
	public Animais(String nome, String classe, String familia, int idade, boolean estado, int caloria, int força) {
		this.nome = nome;
		this.classe = classe;
		this.familia = familia;
		this.idade = idade;
		this.estado = estado;
		this.caloria = caloria;
		this.forca = força;
	}
	
	//O animal já vai começar com força e caloria igual a 10, idade 0 e estado true (vivo).
	public Animais(String nome, String classe, String familia) {
		this.nome = nome;
		this.classe = classe;
		this.familia = familia;
		this.idade = 0;
		this.estado = true;
		this.caloria = 10;
		this.forca = 10;	
		
	}
	//Agora, vamos criar os Getters para podermos acessar os atributos do animal.

	public String getNome() {
		return nome;
	}

	public String getClasse() {
		return classe;
	}

	public String getFamilia() {
		return familia;
	}

	public int getIdade() {
		return idade;
	}

	public boolean getEstado() {
		return estado;
	}

	public int getCaloria() {
		return caloria;
	}

	public int getForca() {
		return forca;
	}
	
	//Agora, vamos começar a criar nossos métodos que são pedidos: morrer, comer, correr e dormir.
	//Também vou adicionar um método chamado nasceu, para retornar uma String com os dados do animalzinho que foi criado.
	//Todos os métodos vão retornar uma String, mostrando o que aconteceu com o animalzinho.
	
	public String nasceu() {
		return "O animal se chama " + nome + " é da classe " + classe + " da familia " + 
		familia + ". O animal possui força de " + forca + ", caloria de " + caloria + " e idade de " +
		idade;
	}
	
	public String morrer() {
		this.forca = 0;
		this.estado = false;
		
		return "O animal morreu!";
	}
	
	public String comer() {
		this.caloria += 10;
		this.forca -= 2;
		
		return "O animal comeu e agora sua força é de " + forca + 
				" e suas calorias valem " + caloria;
	}
	
	public String correr() {
		this.forca -= 5;
		this.caloria -= 5;
		
		return "O animal está correndo!! Agora sua força é de " +
		forca + " e suas calorias valem " + caloria;
	}
	
	public String dormir() {
		this.forca += 10;
		this.caloria -= 2;
		
		return "O animal está dormindo agora! Sua força aumentou para "
				+ forca + " e suas calorias aumentaram para " + caloria;
	}
}
