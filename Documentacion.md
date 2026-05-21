
   static boolean validar_calificaciones(int[] arr, int examenes) {lo declare de tipo boolean porque asi es mas fácil saber si cumplio los parámetros porque en caso de que se pase del rango para este ejemplo como tal no se si se podía incluir mejor una condición en la cual el usuario no pudiera pasar a la siguiente nota mientras no ingresese los datos correctamente

        boolean correcto =true;// nos sirve para saber si las notas fueron ingresadas de manera adecuada

        for (int i = 0; i < examenes; i++) {

            if (arr[i] < 0 || arr[i] > 100) {
                System.out.println("Problemas detectados");
                System.out.println("calificacion fuera de rango en la posicion " + (i + 1) + ": " + arr[i]);para que sepa en que nota va
                System.out.println("Las calificaciones deben estar entre 0-100 \n");

                correcto=false;// al entrar en este siclo nos da entender que una o varias notas entan fuera de los parametros
            }
        }
        return correcto;
    }


static float promedio(int[] arr, int examenes) {

Esta función no sirve nada más Para saber cuál es el promedio Cuando ya se validó la función anterior Siempre como parámetro vamos a recibir Un arreglo que sería las notas que ingresaron y la cantidad de exámenes de esta manera se hace un cambio en el código no se va a tener que modificar la cantidad de exámenes porque para eso está la variable
        
int suma = 0;
        for (int i = 0; i < examenes; i++) {
            suma += arr[i];
        }
        return (float) suma / examenes; Para que el promedio salga con los decimales 
    }


static void nota_mas_alta(int []arr,int examenes){
En esta función declaramos que el mayor o la nota más alta sería el primer dato ingresado y después iría comparando
       
        int mayor=arr[0];
        for(int i=1;i<examenes;i++){
            if (mayor<arr[i]){
                mayor=arr[i];
            }
        }
         System.out.println("La nota mayor es: "+mayor);
    }




    static void nota_mas_baja(int[] arr,int examenes){Esta es la misma función solo Para encontrar menos 
        int menor=arr[0];
        for(int i=1;i<examenes;i++){
            if (menor>arr[i]){
                menor=arr[i];
            }
        }
        System.out.println("La nota menor es: "+menor);
    }


static void aprobadas_o_reprobadas(int[] arr,int exam){

        int apro=0,repr=0; Aquí solamente Hacemos nuestra variable contadoras

        float promedio_clases_aprovadas;
        for(int i=0;i<exam;i++){
            if (arr[i] >=70) {Recorremos el arreglo segun el resultado la variable contadora ira en aumento 
                apro++;
            }else
                repr++;
        }

        promedio_clases_aprovadas=((float) apro/exam)*100;   Aquí solamente se evalúa la cantidad de notas Aprobadas entre la cantidad de notas totales y se multiplica por 100 Para saber el porcentaje 

            System.out.println("Calificaiones Aprovadas: "+apro);
            System.out.println("Calificacione Reprobadas: "+repr);
            System.out.println("El promedio de sus clases aprobadas: "+promedio_clases_aprovadas+"%");

    }

}


