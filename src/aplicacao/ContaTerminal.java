package aplicacao;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import modelo.Conta;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Integer numero;
        String agencia, nome, resposta;
        Double saldo;
        Conta conta;

        try{
            
            System.out.println("*** Bem vindo(a) à DIO Cash! ***");

            System.out.print("Por favor, informe o seu nome: ");
            nome = scanner.nextLine();

            System.out.print("Informe a sua agência: ");
            agencia = scanner.nextLine();

            System.out.print("Agora digite o número da sua conta (somente números): ");
            numero = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Será feito um depósito inicial (S/N)? ");
            resposta = scanner.nextLine();

            if(resposta.trim().equalsIgnoreCase("s")){
                System.out.print("Informe o valor do depósito (utilize o ponto como separador de decimal): ");
                saldo = scanner.nextDouble();

                conta = new Conta(numero, agencia, nome, saldo);
                System.out.println(conta.boasVindasComDeposito());
            }
            else{
                conta = new Conta(numero, agencia, nome);
                System.out.println(conta.boasVindasSemDeposito());       
            }

        }
        catch(InputMismatchException | IllegalArgumentException ex){
            System.out.println("Por favor verifique os dados inseridos e tente novamente");
        }
        finally{
            scanner.close();
        }
    }
}
