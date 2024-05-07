import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        double valorParaConvertir = 0;
        String menuPrincipal = """
                    *****************************************************
                    Sea bienvenido/a al Conversor de Moneda =]
                    1) Dolar =>> Peso Argentino
                    2) Peso Argentino =>> Dolar
                    3) Dolar =>> Real brasileño
                    4) Real brasileño =>> Dolar
                    5) Dolar =>> Peso colombiano
                    6) Peso colombiano =>> Dolar
                    7) Salir
                    Elija una opcion valida:
                    *****************************************************""";
        String menuSecundario = "Ingrese el valor que deseas convertir";
        System.out.println(menuPrincipal);
        Scanner teclado = new Scanner(System.in);
        int salir = teclado.nextInt();


        switch (salir) {
            case 1:
                System.out.println(menuSecundario);
                valorParaConvertir = teclado.nextDouble();
                System.out.println(valorParaConvertir);
                break;
            case 2:
                System.out.println(menuSecundario);
                valorParaConvertir = teclado.nextDouble();
                break;
            case 3:
                System.out.println(menuSecundario);
                valorParaConvertir = teclado.nextDouble();
                break;
            case 4:
                System.out.println(menuSecundario);
                valorParaConvertir = teclado.nextDouble();
                break;
            case 5:
                System.out.println(menuSecundario);
                valorParaConvertir = teclado.nextDouble();
                break;
            case 6:
                System.out.println(menuSecundario);
                valorParaConvertir = teclado.nextDouble();
                break;

        }
    }
}