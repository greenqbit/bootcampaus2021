package GTraining.core.demo.transporteservice;

import GTraining.core.demo.common.VehicleType;
import GTraining.core.demo.dto.Passenger;
import GTraining.core.demo.dto.TransportationRoute;

import java.util.ArrayList;
import java.util.List;

public class PassengerService { //Aman

    public String travel() {
        // Passenger?  => coming from database
        Passenger amanJi = new Passenger();
        amanJi.setName("Aman");
        amanJi.setMainStation("Auburn");
        amanJi.setDestStation("Circular Quay");
        amanJi.setOpalBalance(12);

        //route 1 : auburnToCentral
        TransportationRoute auburnToCentral = new TransportationRoute();
        auburnToCentral.setFare(4.5);
        auburnToCentral.setVechicleType(VehicleType.TRAIN);
        auburnToCentral.setNoOfPassenger(750);
        auburnToCentral.setFromStation("Auburn"); //db
        auburnToCentral.setToStation("Central"); //db

        TransportationRoute centralToCircularQuay = new TransportationRoute();
        centralToCircularQuay.setFare(3.5);
        centralToCircularQuay.setVechicleType(VehicleType.TRAIN);
        centralToCircularQuay.setNoOfPassenger(300);
        centralToCircularQuay.setFromStation("Central"); //db
        centralToCircularQuay.setToStation("Circular Quay"); //db

        /*ArrayList routesEr = new ArrayList();
        routesEr.add(true);
        routesEr.add("Circular");*/

        //parent => child ( ArrayList/LinkedList) -no relation with sibling
        List<TransportationRoute> routes = new ArrayList<>();
        routes.add(auburnToCentral);
        routes.add(centralToCircularQuay);

        amanJi.setRoutes(routes);


        SydneyTransportService sydneyTransportService = new SydneyTransportService();
        return sydneyTransportService.transport(amanJi);


        /*Passenger santoshJi = new Passenger();
        santoshJi.setName("Santosh");
        santoshJi.setMainStation("Auburn");
        santoshJi.setDestStation("North Sydney");*/

    }


}
