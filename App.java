import java.util.Random;

public class App {

    public static Integer[] aleatorizarVetor(Integer[] v1, Integer[] v2) throws Exception {
        Integer v3[] = new Integer[v1.length];
        int posV1 = 0, posV2 = 0;

        for (int i = 0; i < v3.length; i++) {
            Integer numeroAleatorio = new Random().nextInt(100);

            switch (numeroAleatorio % 2) {
                case 0:
                    v3[i] = v1[posV1];
                    ++posV1;
                    break;

                case 1:
                    v3[i] = v2[posV2];
                    ++posV2;
                    break;
                default:
                    throw new Exception("Exceção ao realizar o módulo do número aleatório.");

            }
        }

        return v3;
    }

    public static void main(String[] args) throws Exception {
        Integer v1[] = { 1, 3, 5, 7, 9 };
        Integer v2[] = { 2, 4, 6, 8, 10 };
        Integer v3[] = aleatorizarVetor(v1, v2);
        System.out
                .println(
                        "\nElementos do vetor V3 de mesmo tamanho que os vetores V1 e V2, preenchido conforme especificações: \n");

        for (int i = 0; i < v3.length; i++) {
            System.out.print(v3[i] + " ");
        }

    }
}
