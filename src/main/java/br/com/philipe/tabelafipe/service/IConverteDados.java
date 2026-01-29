package br.com.philipe.tabelafipe.service;

import java.util.List;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);

    <T>List obterLista(String json, Class<T> classe);
}
