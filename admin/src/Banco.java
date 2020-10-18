import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Livro> listaLivro = new ArrayList<>();
	private static Integer codigo = 1;
	
	public void salvaLivro(Livro obj) {
		if(obj.getId() > 0)
			atualizaCliente(obj);
		else {
			obj.setId(getProximoCodigo());
			listaLivro.add(obj);
		}
	}

	private void atualizaCliente(Livro obj) {

		for (int i = 0; i < Banco.listaLivro.size(); i++) {
			if (Banco.listaLivro.get(i).getId() == obj.getId()) {
				Banco.listaLivro.set(i, obj);
			}
		}
	}

	private Integer getProximoCodigo() {
		return codigo++;
	}

	public List<Livro> getListaCliente() {
		return Banco.listaLivro;
	}

	public Integer getTamanhoListaCliente() {
		return Banco.listaLivro.size();
	}
	public Livro getLivrobyId(Integer id) {
		Livro localiza = new Livro();
		for(Livro livro : Banco.listaLivro) {
			if(livro.getId() == id)
				localiza = livro;
		}
		return localiza;
	}

	public void deletaLivro(Integer id) {
		
		for(int i = 0; i < Banco.listaLivro.size(); i++) {
			if(Banco.listaLivro.get(i).getId() == id) {
				Banco.listaLivro.remove(i);
			}
		}
		
	}

}
