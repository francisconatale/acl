public class Suma{
    public static void main(String[] args){ 
     int resultadoDeLaSuma;
     resultadoDeLaSuma = suma(1,2,3,4,5);
     System.out.println("Resultado de la suma con 5 parametros" + resultadoDeLaSuma);
      resultadoDeLaSuma = suma(1,2,3);
     System.out.println("Resultado de la suma con 3 parametros" + resultadoDeLaSuma);
    }

    private static int suma(int... numeros){
        int suma = 0;
        for(int numero : numeros){
            suma += numero;
        }
        return suma; 
    }
}