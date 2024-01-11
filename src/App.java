public class App {
    public static void main(String[] args) throws Exception {
        int[] listaNumeros = new int[] { 100, 110, 50, 80, 10, 11, 15, 8, 9 };

        selectionSort(listaNumeros);

        for (int i = 0; i < listaNumeros.length; i++)
            System.out.println(listaNumeros[i]);
    }

    private static void selectionSort(int v[]) {

        for (int i = 0; i < v.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[min]) {
                    min = j;
                }
            }

            if (min != i) {
                int aux = v[i];
                v[i] = v[min];
                v[min] = aux;
            }
        }
    }

}