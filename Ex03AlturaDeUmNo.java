public class Ex03AlturaDeUmNo {
        public int altura(NoArvore<String> atual){
            if (atual == null){
                return -1;
            } else {
                int alturaEsquerda = altura(atual.getEsquerda());
                int alturaDireita = altura(atual.getDireita());
                return 1 + Math.max(alturaEsquerda, alturaDireita);
            }
        }
}
