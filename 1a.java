public class 1a {

    ListaSimples e4 = new ListaSimples();
    public void inverterLista () {
        e4.insere(10);
        e4.insere(99);
        e4.insere(101);
        e4.insere(666);
        int nElementos = 4;
        int n;
        int k = nElementos;

        for (int i=0; i<nElementos; i++) {
            n = 1;
            No p = e4.cabeca;
            No q = e4.cabeca;

            // nessa parte faz com que ele chegue ate o numero e na
            // proxima vez, ate um numero menor e assim vai
            while (n<k) {
                q = p;
                p = p.prox;
                n++;
            }
            p.prox = q;
            k--;
        }

        for (int m=0; m<nElementos; m++){
            No imprimir = e4.cabeca;
            System.out.print(imprimir.letra+" ");
            imprimir = imprimir.prox;
        }

    }

    public static void main(String[] args) {
        E4 e4 = new E4 ();
        e4.inverterLista();
    }
