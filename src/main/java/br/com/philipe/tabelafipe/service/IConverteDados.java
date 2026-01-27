package br.com.philipe.tabelafipe.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
