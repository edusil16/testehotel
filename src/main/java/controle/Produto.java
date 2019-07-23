package controle;

public enum Produto {
    AGUA(3), REFRIGERANTE(4), CERVEJA(5);

    private Integer valor;

    Produto(Integer valor) {
        this.valor = valor;
    }
}
