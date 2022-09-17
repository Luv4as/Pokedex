package com.pokedex.pokedex.data;

import com.pokedex.pokedex.exceptions.ElementoJaExisteException;
import com.pokedex.pokedex.exceptions.ElementoNaoExisteException;

import java.util.List;

public interface IRepositorioGenerico<T> {

    void inserir(T obj) throws ElementoJaExisteException;

    List<T> listar();

    void remover(T obj) throws ElementoNaoExisteException;

    void atualizar(T newObj) throws ElementoNaoExisteException;

}
