package hotelreservation;

import java.util.ArrayList;

public class HotelReservationSystem {
    ArrayList<Hotel> hotelList = new ArrayList<Hotel>();

    Hotel hotel;

    /**
     * @Purpose :To add hotel name & hotel rates
     * @Param :setters to initiate values
     * @Function :setter and getters
     * @Return :giving hotel info
     */

    public Hotel addHotel(String hotelName, int hotelrate) {

        hotel = new Hotel();
        hotel.setHotelName(hotelName);
        hotel.setHotelRate(hotelrate);
        hotelList.add(hotel);
        return hotel;
    }
}

