public class PasarPorReferencia {

    public static void main(String[] args) {
        int[] edad = {10, 11, 12};
        System.out.println("iniciamos el metodo main");
        for(int i = 0; i < edad.length; i++){
            System.out.println("edad[i] = " + edad[i]);
        }
        System.out.println("Antes de llamar al método test");
        test(edad);
        System.out.println("Despues de llamar al método test");
        for(int i = 0; i < edad.length; i++){
            System.out.println("edad[i] = " + edad[i]);
        }
        System.out.println("finaliza el metodo main con los datos del arreglo modificados");
    }

    public static void test(int[] edadArreglo){
        System.out.println("iniciamos el metodo test");
        for(int i = 0; i < edadArreglo.length; i++){
          edadArreglo[i] = edadArreglo[i] + 20;
        }

        System.out.println("finaliza el metodo test");
    }
}
