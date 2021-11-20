package GTraining.core.demo.transporteservice;

import GTraining.core.demo.dto.Passenger;
import GTraining.core.demo.dto.TransportationRoute;

import java.util.Arrays;
import java.util.List;

public class SydneyTransportService implements TransportService {

    //Tram,
    //ElectricTrain
    //Bus
    //succes/fail/thank you message : output , passenger: input
    @Override
    public String transport(Passenger passenger) {//signature

        String name = passenger.getName();
        List<TransportationRoute> routes = passenger.getRoutes();

        System.out.println(name + ": from station: " + passenger.getMainStation() +
                ", To Station: " + passenger.getDestStation());

        System.out.println("---All the routes---: " + Arrays.toString(routes.toArray()));


        //data: +> database => save
        // pay record?
        // login ?

        //validation?
        double totalFair = 0.0;
        for(TransportationRoute r : routes) { //foreach
            totalFair = totalFair + r.getFare();
        }
        System.out.println("Total Fair: " + totalFair);

        //fail for less balance
        if (totalFair > passenger.getOpalBalance()) {
            return "FAILED: Insufficient Balance!";
        }

        return "SUCCESS: Thanks for travelling!";
    }




}
