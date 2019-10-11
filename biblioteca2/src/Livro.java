import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Livro implements Identificavel {
	@Id
	private Long id;
	private Long isbn;
	private String nome;
	private Integer ano;

	public void adicionarLivro(Long isbn, String nome,Integer ano) {
		
	}
	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(Long id) {
		// TODO Auto-generated method stub
		
	}
}
