package br.com.fiap.livrosapi.data;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.livrosapi.model.Livro;

public class LivroDao {
	
	List<Livro> lista = new ArrayList<>();
	
	public LivroDao() {
		lista.addAll(List.of(
				new Livro( 1L, "Teto Para Dois", "Três meses após o término do seu relacionamento, Tiffy...", 
						"Comédia romântica", "Beth O'Leary", "Intrínseca", "http...", true, 5),
				new Livro( 2L, " O Senhor dos Anéis: A Sociedade do Anel (Volume 1)", 
						"O Senhor dos Anéis conta a história de um jovem hobbit chamado Frodo Bolseiro...", "Literatura fantástica", 
						"J. R. R. Tolkien", "Martind Fontes", "http...", false, 0),
				new Livro( 3L, "A Seleção", "Para trinta e cinco garotas, a “Seleção” é a chance de uma vida...", 
						"ficção científica ", "Kiera Cass", "Seguinte", "http...", true, 5)
		));
	}
	
	public List<Livro> findAll(){
		return lista;
	}
}
