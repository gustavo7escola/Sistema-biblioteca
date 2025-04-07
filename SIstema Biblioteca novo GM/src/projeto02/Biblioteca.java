package projeto02; //Declara o pacote onde o código está

import java.util.Scanner;

public class Biblioteca {

    // Método onde o programa começa a execução
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n🏛️  B I B L I O T E C A  📚  \n\n");
                   
        while (true) {
            // Solicita as informações do livro ao usuário
            System.out.println("Digite o título do livro:");
            String titulo = scanner.nextLine();
            
            System.out.println("Digite o nome do autor:");
            String autor = scanner.nextLine();
            
            System.out.println("Digite o usuário:");
            String usuario = scanner.nextLine();
            
            System.out.println("Digite o nome:");
            String nome = scanner.nextLine();
            
            System.out.println("Digite a sua matricula:");
            int matricula = scanner.nextInt();
            
            System.out.println("Digite o ano de publicação:");
            int anoPublicacao = scanner.nextInt();
            scanner.nextLine();
            
            System.out.println("Digite a data de devolução do livro:");
            String dataDevolucao = scanner.nextLine();
            
            scanner.nextLine();  // Limpar o buffer

         // Cria um objeto livro com as informações fornecidas
            Livro livro = new Livro(titulo, autor, anoPublicacao, usuario, matricula, dataDevolucao, nome);
           
            // Chama o método exibirDetalhes para imprimir as informações do livro
            livro.exibirDetalhes();

            // Pergunta ao usuário se deseja cadastrar um novo livro ou finalizar
            System.out.println("\nDeseja cadastrar outro livro? (S/N)");
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("N")) {
                System.out.println("Programa finalizado. Até logo!");
                break;  // Finaliza o loop e o programa
            }
        }
        scanner.close();
    }
}

// A classe Livro, onde você define os detalhes do livro
class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int matricula;
    private String usuario;
    private String dataDevolucao;
    private String nome;
   
    // Construtor da classe Livro
    public Livro(String titulo, String autor,int anoPublicacao, String usuario, int matricula, String dataDevolucao, String nome){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.usuario = usuario;
        this.matricula = matricula;
        this.dataDevolucao = dataDevolucao;
        this.nome = nome;
    }
    // Método para exibir os detalhes do livro
    public void exibirDetalhes() {
    	
    	System.out.println("  📖Livro");
    	System.out.println("─────────────┴──────────────────────┐");
    	System.out.println("📌Titulo..............: " + this.titulo);
    	System.out.println("✍️Autor...............: " + this.autor);
    	System.out.println("📅Ano de Publicação...: " + this.anoPublicacao);
    	System.out.println("────────────────────────────────────┘");

    	System.out.println("─────────────┴──────────────────────┐");
		System.out.println("🔹Nome................: " + this.nome);
		System.out.println("🔹Matrícula...........: " + this.matricula);
		System.out.println("🔹Usuário.............: " + this.usuario);
		System.out.println("────────────────────────────────────┘");

    	System.out.println("\n 📚Emprestimo");
		System.out.println("─────────────┴──────────────────────┐");
		System.out.println("📖Livro...............: " + this.titulo );
		System.out.println("👤Usuário.............: " + this.usuario);
		System.out.println("📆Data Devolução......: " + this.dataDevolucao);
		System.out.println("────────────────────────────────────┘");
    }

    // Métodos getters
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public String getUsuario() {
        return usuario;
    }
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public String getNome() {
        return nome;
    }
    public int getMatricula() {
         return matricula;
    }
    public String getDataDevolucao() {
        return dataDevolucao;
    }
}
