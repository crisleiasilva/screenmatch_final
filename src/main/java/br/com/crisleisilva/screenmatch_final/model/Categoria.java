package br.com.crisleisilva.screenmatch_final.model;

public enum Categoria {
    ACAO("Action"),

    ROMANCE("Romance"),

    COMEDIA("Comedy"),

    DRAMA("Drama"),

    CRIME("Crime");

    private String categoriaOmdb;

    categoria(String categoriaOmdb) {
        this.categoriaOmdb = categoriaOmdb;
    }

    public static Categoria fromString(String text) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaOmdb.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
        throw new IllegalArgumentException("Nenhuma categoria encontrada para a string fornecida: " + text);
    }

}
