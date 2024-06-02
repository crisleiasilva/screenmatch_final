package br.com.crisleisilva.screenmatch_final.service;

public interface IConverteDados {
    <T> T  obterDados(String json, Class<T> classe);
}
