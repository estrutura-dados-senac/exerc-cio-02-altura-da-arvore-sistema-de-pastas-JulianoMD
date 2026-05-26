public class Ex02ProfundidadeDoNo {

        public int profundidade(NoColaborador raiz, int alvo) {
            return profundidadeAuxiliar(raiz, alvo, 0);
        }

        private int profundidadeAuxiliar(NoColaborador atual, int alvo, int nivel) {
            if (atual == null) { return -1; }

            if (atual.id == alvo) { return nivel; }

            int resultadoEsquerda = profundidadeAuxiliar(atual.esquerda, alvo, nivel + 1);

            if (resultadoEsquerda != -1) { return resultadoEsquerda; }

            return profundidadeAuxiliar(atual.direita, alvo, nivel + 1);
        }
    }
