public class Ex01AlturaDaArvore {
    public int altura(No raiz) {
    if (raiz == null) { return 0; }

    int alturaEsquerda = altura(raiz.esquerda);

    int alturaDireita = altura(raiz.direita);

    int maiorAltura = Math.max(alturaEsquerda, alturaDireita);

    return 1 + maiorAltura;
}
}
