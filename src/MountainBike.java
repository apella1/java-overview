public class MountainBike extends Bicycle {
    public int seatHeight;

    public MountainBike(int startHeight, int startCadence, int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }

    public void setSeatHeight(int newValue) {
        seatHeight = newValue;
    }

    public int getSeatHeight() {
        return  seatHeight;
    }

}
