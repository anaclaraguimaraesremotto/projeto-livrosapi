package br.com.fiap.livrosapi.model;

public record Livro(
		
		Long id,
		String titulo,
		String sinopse,
		String genero,
		String autor,
		String editora,
		String poster,
		boolean lido,
		double nota
		
) {}
