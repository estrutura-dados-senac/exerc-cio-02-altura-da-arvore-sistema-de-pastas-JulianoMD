package src;

public class Ex05PreOrdem {
        public void preOrdem(NoArvore<String> atual){
            if (atual != null){
                System.out.println(atual.getValor());
                preOrdem(atual.getEsquerda());
                preOrdem(atual.getDireita());
            }
        }

}