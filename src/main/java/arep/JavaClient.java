package arep;
import arep.Connection.HttpConnectServices;

import java.util.Scanner;

public class JavaClient {


    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter number:");
        String number = myObj.nextLine();
        System.out.println("Enter operation:");
        String operation = myObj.nextLine();
        HttpConnectServices httpConnectServices = new HttpConnectServices();
        String data = httpConnectServices.getData(number,operation);
        System.out.println("Respuesta: "+data);
    }
}
