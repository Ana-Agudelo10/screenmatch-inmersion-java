import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Pelicula Matrix");
        //Declaración de variables:
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matriz";
        String sinopsis = """
                La mejor pelicula del fin del milenio
                """;

        double mediaEvaluacionesUsuario = 0;

        System.out.println("Pelicula: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Evaluación: " + evaluacion);
        System.out.println("Incluido en el plan basico: " + incluidoEnElPlanBasico);
        System.out.println("Sinopsis: " + sinopsis);

        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println("Media de la evaluación de Matrix: " + mediaEvaluacion);

        if (fechaDeLanzamiento < 2023){
            System.out.println("Pelicula Popular en el momento");
        } else {
            System.out.println("Pelicula Retro que vale la pena ver");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la evaluación que le darias a Matrix: ");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionesUsuario = mediaEvaluacionesUsuario + notaMatrix;
        }
        System.out.println("La media de la pelicula Matrix calculada por el usuario es: " + mediaEvaluacionesUsuario/3);
    }
}
