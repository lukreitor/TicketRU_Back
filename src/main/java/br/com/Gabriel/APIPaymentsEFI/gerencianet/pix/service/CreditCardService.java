package br.com.Gabriel.APIPaymentsEFI.gerencianet.pix.service;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import br.com.Gabriel.APIPaymentsEFI.gerencianet.Credentials;
import br.com.gerencianet.gnsdk.Gerencianet;
import br.com.gerencianet.gnsdk.exceptions.GerencianetException;
import org.json.JSONObject;

@Service
public class CreditCardService {
    Credentials credentials;

    public CreditCardService() {
        try {
            credentials = new Credentials();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            // You should handle this situation properly,
            // perhaps by re-throwing it as an unchecked exception
            throw new RuntimeException(e);
        }
    }

    

    public static void main(String[] args) {
        // Initialize the CreditCardService
        CreditCardService creditCardService = new CreditCardService();

        // Set your parameters
        String value = "100"; // charge value
        String cardNumber = "4012001037141112"; // credit card number
        String cvv = "123"; // credit card cvv
        String expirationMonth = "05"; // credit card expiration month
        String expirationYear = "2028"; // credit card expiration year
        String brand = "visa"; // credit card brand
        String name = "Gorbadoc Oldbuck"; // customer's name
        String cpf = "04267484171"; // customer's cpf
        String email = "oldbuck@shire.com"; // customer's email

        try {
            // Create a charge and check its status
            // String status = creditCardService.createChargeAndCheckStatus(value,
            // cardNumber, cvv, expirationMonth, expirationYear, brand, name, cpf, email);

            // Print the status
            // System.out.println("Payment status: " + status);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
