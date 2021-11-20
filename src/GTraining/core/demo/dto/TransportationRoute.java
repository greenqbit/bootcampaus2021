package GTraining.core.demo.dto;

import GTraining.core.demo.common.VehicleType;

public class TransportationRoute { //1 object: paramatta = > central

    private double fare; //$4
    private VehicleType vechicleType; //Train
    private String fromStation; //auburn
    private String toStation; //central
    private int noOfPassenger; //750

    public TransportationRoute() {
    }


    public double getFare() {
        return this.fare;
    }

    public VehicleType getVechicleType() {
        return this.vechicleType;
    }

    public String getFromStation() {
        return this.fromStation;
    }

    public String getToStation() {
        return this.toStation;
    }

    public int getNoOfPassenger() {
        return this.noOfPassenger;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public void setVechicleType(VehicleType vechicleType) {
        this.vechicleType = vechicleType;
    }

    public void setFromStation(String fromStation) {
        this.fromStation = fromStation;
    }

    public void setToStation(String toStation) {
        this.toStation = toStation;
    }

    public void setNoOfPassenger(int noOfPassenger) {
        this.noOfPassenger = noOfPassenger;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof TransportationRoute)) return false;
        final TransportationRoute other = (TransportationRoute) o;
        if (!other.canEqual((Object) this)) return false;
        if (Double.compare(this.getFare(), other.getFare()) != 0) return false;
        final Object this$vechicleType = this.getVechicleType();
        final Object other$vechicleType = other.getVechicleType();
        if (this$vechicleType == null ? other$vechicleType != null : !this$vechicleType.equals(other$vechicleType))
            return false;
        final Object this$fromStation = this.getFromStation();
        final Object other$fromStation = other.getFromStation();
        if (this$fromStation == null ? other$fromStation != null : !this$fromStation.equals(other$fromStation))
            return false;
        final Object this$toStation = this.getToStation();
        final Object other$toStation = other.getToStation();
        if (this$toStation == null ? other$toStation != null : !this$toStation.equals(other$toStation)) return false;
        if (this.getNoOfPassenger() != other.getNoOfPassenger()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof TransportationRoute;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final long $fare = Double.doubleToLongBits(this.getFare());
        result = result * PRIME + (int) ($fare >>> 32 ^ $fare);
        final Object $vechicleType = this.getVechicleType();
        result = result * PRIME + ($vechicleType == null ? 43 : $vechicleType.hashCode());
        final Object $fromStation = this.getFromStation();
        result = result * PRIME + ($fromStation == null ? 43 : $fromStation.hashCode());
        final Object $toStation = this.getToStation();
        result = result * PRIME + ($toStation == null ? 43 : $toStation.hashCode());
        result = result * PRIME + this.getNoOfPassenger();
        return result;
    }

    public String toString() {
        return "TransportationRoute(fare=" + this.getFare() + ", vechicleType=" + this.getVechicleType() + ", fromStation=" + this.getFromStation() + ", toStation=" + this.getToStation() + ", noOfPassenger=" + this.getNoOfPassenger() + ")";
    }
}



