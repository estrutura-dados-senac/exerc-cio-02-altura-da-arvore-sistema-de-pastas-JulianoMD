package src;

public class Ex04BuscaEmABB {

    public static boolean buscar(NoProduto raiz, int codigo) {
    NoProduto atual = raiz;

    while (atual != null) {
        if (codigo == atual.codigo) { return true; }

        if (codigo < atual.codigo) {
            atual = atual.esquerda;
        } else {
            atual = atual.direita;
        }
    }

    return false;
    }

}
