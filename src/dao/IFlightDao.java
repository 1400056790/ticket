package dao;

import bean.Flight;

import java.sql.SQLException;
import java.util.Set;
public interface IFlightDao {

    void insertFlight(Flight flight) throws SQLException;
    Set<Flight> getAllFlights();
    Flight getFlightByDepartureAirPort(String departureAirPort);
    Flight getFlightByDestinationAirPort(String destinationAirPort);
    Flight getFlightByDepartureData(String departureData);
    void updateFlight(Flight flight);

}
