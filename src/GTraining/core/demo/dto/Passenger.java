package GTraining.core.demo.dto;

import java.util.ArrayList;
import java.util.List;

public class Passenger { //Aman

    private String name;
    private double opalBalance;
    private String mainStation = null; //paramatta
    private String destStation = null; //circular quay
    //array of TransportationRoute[]
    // paramatta = > central
    //cental => circular quay
    private List<TransportationRoute> routes = new ArrayList<>(); //0 size arraylist, 2 train + 1 bus

    public Passenger() {
    }

    public String getName() {
        return this.name;
    }

    public double getOpalBalance() {
        return opalBalance;
    }

    public void setOpalBalance(double opalBalance) {
        this.opalBalance = opalBalance;
    }

    public String getMainStation() {
        return this.mainStation;
    }

    public String getDestStation() {
        return this.destStation;
    }

    public List<TransportationRoute> getRoutes() {
        return this.routes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMainStation(String mainStation) {
        this.mainStation = mainStation;
    }

    public void setDestStation(String destStation) {
        this.destStation = destStation;
    }

    public void setRoutes(List<TransportationRoute> routes) {
        this.routes = routes;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Passenger)) return false;
        final Passenger other = (Passenger) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$mainStation = this.getMainStation();
        final Object other$mainStation = other.getMainStation();
        if (this$mainStation == null ? other$mainStation != null : !this$mainStation.equals(other$mainStation))
            return false;
        final Object this$destStation = this.getDestStation();
        final Object other$destStation = other.getDestStation();
        if (this$destStation == null ? other$destStation != null : !this$destStation.equals(other$destStation))
            return false;
        final Object this$routes = this.getRoutes();
        final Object other$routes = other.getRoutes();
        if (this$routes == null ? other$routes != null : !this$routes.equals(other$routes)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Passenger;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $mainStation = this.getMainStation();
        result = result * PRIME + ($mainStation == null ? 43 : $mainStation.hashCode());
        final Object $destStation = this.getDestStation();
        result = result * PRIME + ($destStation == null ? 43 : $destStation.hashCode());
        final Object $routes = this.getRoutes();
        result = result * PRIME + ($routes == null ? 43 : $routes.hashCode());
        return result;
    }

    public String toString() {
        return "Passenger(name=" + this.getName() + ", mainStation=" + this.getMainStation() + ", destStation=" + this.getDestStation() + ", routes=" + this.getRoutes() + ")";
    }
}
