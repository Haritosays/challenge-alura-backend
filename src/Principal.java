import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        double valorParaConvertir = 0;
        double valorConvertido = 0;
        int salir = 0;
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
        String resultadoMenuConvertor = """
                El valor %s [%s] correspende al valor final de =>> %s [%s]""";
        Scanner teclado = new Scanner(System.in);

        while (salir != 7){
            System.out.println(menuPrincipal);
            salir = teclado.nextInt();
            switch (salir) {
                case 1:
                    System.out.println(menuSecundario);
                    TipoDeCambio tipoCambio1     = TipoDeCambio.obtenerTipoCambio("USD", "ARS");
                    valorParaConvertir = teclado.nextDouble();
                    valorConvertido = valorParaConvertir*tipoCambio1.getTasaCambio();
                    System.out.println(String.format(resultadoMenuConvertor,valorParaConvertir,"USD",valorConvertido,"ARS"));
                    break;
                case 2:
                    System.out.println(menuSecundario);
                    TipoDeCambio tipoCambio2     = TipoDeCambio.obtenerTipoCambio("ARS", "USD");
                    valorParaConvertir = teclado.nextDouble();
                    valorConvertido = valorParaConvertir*tipoCambio2.getTasaCambio();
                    System.out.println(String.format(resultadoMenuConvertor,valorParaConvertir,"ARS",valorConvertido,"USD"));
                    break;
                case 3:
                    System.out.println(menuSecundario);
                    TipoDeCambio tipoCambio3     = TipoDeCambio.obtenerTipoCambio("USD", "BRL");
                    valorParaConvertir = teclado.nextDouble();
                    valorConvertido = valorParaConvertir*tipoCambio3.getTasaCambio();
                    System.out.println(String.format(resultadoMenuConvertor,valorParaConvertir,"USD",valorConvertido,"BRL"));
                    break;
                case 4:
                    System.out.println(menuSecundario);
                    TipoDeCambio tipoCambio4     = TipoDeCambio.obtenerTipoCambio("BRL", "USD");
                    valorParaConvertir = teclado.nextDouble();
                    valorConvertido = valorParaConvertir*tipoCambio4.getTasaCambio();
                    System.out.println(String.format(resultadoMenuConvertor,valorParaConvertir,"BRL",valorConvertido,"USD"));
                    break;
                case 5:
                    System.out.println(menuSecundario);
                    TipoDeCambio tipoCambio5     = TipoDeCambio.obtenerTipoCambio("USD", "COP");
                    valorParaConvertir = teclado.nextDouble();
                    valorConvertido = valorParaConvertir*tipoCambio5.getTasaCambio();
                    System.out.println(String.format(resultadoMenuConvertor,valorParaConvertir,"USD",valorConvertido,"COP"));
                    break;
                case 6:
                    System.out.println(menuSecundario);
                    TipoDeCambio tipoCambio6     = TipoDeCambio.obtenerTipoCambio("COP", "USD");
                    valorParaConvertir = teclado.nextDouble();
                    valorConvertido = valorParaConvertir*tipoCambio6.getTasaCambio();
                    System.out.println(String.format(resultadoMenuConvertor,valorParaConvertir,"COP",valorConvertido,"USD"));
                    break;
        }
        }
    }
}