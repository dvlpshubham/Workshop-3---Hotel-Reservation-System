package hotelreservation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @Purpose :To check whether hotel added or not
 * @Param :using assert for true or false
 * @Function :test function to check one feature
 * @Return :boolean o/p true/false
 */
public class HotelReservationTest {
    @Test
    public void givenHotelDetails_WhenValuesEnteredAreCorrect_ShouldReturnTrue() {

        HotelReservationSystem hotelReservationService = new HotelReservationSystem();
        Hotel isValidHotel1 = hotelReservationService.addHotel("Lakewood", 5000);
        Hotel hotelLakewood = new Hotel("Lakewood", 5000);
        Assertions.assertEquals(hotelLakewood.getHotelName(), isValidHotel1.getHotelName());

    }

    @Test
    public void givenHotelDetails_WhenValuesEnteredAreCorrect_ShouldReturnFalse() {

        HotelReservationSystem hotelReservationService = new HotelReservationSystem();
        Hotel isValidHotel1 = hotelReservationService.addHotel("Lakewood", 5000);
        Hotel hotelLakewood = new Hotel("Landmark", 5000);
        Assertions.assertNotEquals(hotelLakewood.getHotelName(), isValidHotel1.getHotelName());

    }
}


