package hotelreservation;

public class Hotel {
    String hotelName;
    int hotelRate;

    // default constructor
    public Hotel() {

    }

    /**
     * @return the hotelName
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * @param hotelName the hotelName to set
     */
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getHotelRate() {
        return hotelRate;
    }

    public void setHotelRate(int hotelRate) {
        this.hotelRate = hotelRate;
    }

    /**
     * @Purpose :To add hotel name & hotel rates
     * @Param :parameterized constructor to assigning values to data members
     * @Function :constructor
     * @Return :giving hotel info
     */
    public Hotel(String hotelName, int hotelRate) {
        super();
        this.hotelName = hotelName;
        this.hotelRate = hotelRate;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", hotelRate=" + hotelRate +
                '}';
    }

}

