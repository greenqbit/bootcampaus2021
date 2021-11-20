package GTraining.core.demo;

import GTraining.core.demo.transporteservice.PassengerService;

public class TransportApp {

    public static void main(String[] args) {

        PassengerService passengerService = new PassengerService();
        String message = passengerService.travel();

        System.out.println(message);

    }
}
