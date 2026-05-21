
import java.util.Scanner;

public class CalculadoraCalificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad_examenes =8;
        char opc;
        do {
            int[] nota = new int[cantidad_examenes];
            System.out.println("\ningrese sus notas entre 0-100");
            for (int i = 0; i < cantidad_examenes; i++) {
                System.out.print("ingrese la " + (i + 1) + " nota:");
                nota[i] = sc.nextInt();

            }

            System.out.println();
            boolean notas_validas = validar_calificaciones(nota, cantidad_examenes);
            if (notas_validas) {
                System.out.println("═════════════════════════════════════════════");
                System.out.println("          REPORTE DE CALIFICACIONES          ");
                System.out.println("═════════════════════════════════════════════");
                System.out.println("Calificaciones ingresadas:");
                for(int i=0;i<cantidad_examenes;i++){
                    System.out.printf(+nota[i]+"  ");
                }
                System.out.println("\n\n─── ESTADÍSTICAS ───\n");
                System.out.printf("El promedio de las notas es: %.2f%n", promedio(nota, cantidad_examenes));
                nota_mas_alta(nota, cantidad_examenes);
                nota_mas_baja(nota, cantidad_examenes);
                System.out.println("\n─── ANÁLISIS DE RESULTADOS ───\n");
                aprobadas_o_reprobadas(nota, cantidad_examenes);
            } else {
                System.out.println("No se puede calcular el promedio porque ingreso mal los datos \n");
            }
            System.out.println("\nDesea continuar ingresando notas (S/N) \n");
            System.out.println("═════════════════════════════════════════════");
            opc=sc.next().charAt(0);
        }while(opc!='n' && opc!='N');

    }

    static boolean validar_calificaciones(int[] arr, int examenes) {
        boolean correcto =true;// nos sirve para saber si las notas fueron ingresadas de manera adecuada
        for (int i = 0; i < examenes; i++) {
            if (arr[i] < 0 || arr[i] > 100) {
                System.out.println("Problemas detectados");
                System.out.println("calificacion fuera de rango en la posicion " + (i + 1) + ": " + arr[i]);
                System.out.println("Las calificaciones deben estar entre 0-100 \n");
                correcto=false;// al entrar en este siclo nos da entender que una o varias notas entan fuera de los parametros
            }
        }
        return correcto;
    }

    static float promedio(int[] arr, int examenes) {
        int suma = 0;
        for (int i = 0; i < examenes; i++) {
            suma += arr[i];
        }
        return (float) suma / examenes;
    }
     static void nota_mas_alta(int []arr,int examenes){
        int mayor=arr[0];
        for(int i=1;i<examenes;i++){
            if (mayor<arr[i]){
                mayor=arr[i];
            }
        }
         System.out.println("La nota mayor es: "+mayor);
    }
    static void nota_mas_baja(int[] arr,int examenes){
        int menor=arr[0];
        for(int i=1;i<examenes;i++){
            if (menor>arr[i]){
                menor=arr[i];
            }
        }
        System.out.println("La nota menor es: "+menor);
    }
    static void aprobadas_o_reprobadas(int[] arr,int exam){
        int apro=0,repr=0;
        float promedio_clases_aprovadas;
        for(int i=0;i<exam;i++){
            if (arr[i] >=70) {
                apro++;
            }else
                repr++;
        }
        promedio_clases_aprovadas=((float) apro/exam)*100;
            System.out.println("Calificaiones Aprovadas: "+apro);
            System.out.println("Calificacione Reprobadas: "+repr);
            System.out.println("El promedio de sus clases aprobadas: "+promedio_clases_aprovadas+"%");

    }

}