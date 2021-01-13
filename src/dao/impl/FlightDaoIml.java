package dao.impl;

import bean.Flight;
import dao.IFlightDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Set;

public class FlightDaoIml implements IFlightDao {

    @Override
    public void insertFlight(Flight flight) throws SQLException {
        System.out.println(flight);
        String url="jdbc:oracle:thin:@localhost:1521:orcl";
        String username="pp";
        String password="pp12345";
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection conn= DriverManager.getConnection(url,username,password);
       String sql="INSERT INTO flight VALUES(?,?,?,?,?,?,?)";

        PreparedStatement pstmt= conn.prepareStatement(sql);
        pstmt.setString(1,flight.getId());
        pstmt.setString(2,flight.getFlightId());
        pstmt.setString(3,flight.getPlaneType());
        pstmt.setInt(4,flight.getCurrentSeatsNum());
        pstmt.setString(5,flight.getDepartureAirPort());
        pstmt.setString(6,flight.getDestinationAirPort());
        pstmt.setString(7,flight.getDepartureData());

        pstmt.executeUpdate();
    }

    @Override
    public Set<Flight> getAllFlights() {
        return null;
    }

    @Override
    public Flight getFlightByDepartureAirPort(String departureAirPort) {
        return null;
    }

    @Override
    public Flight getFlightByDestinationAirPort(String destinationAirPort) {
        return null;
    }

    @Override
    public Flight getFlightByDepartureData(String departureData) {
        return null;
    }

    @Override
    public void updateFlight(Flight flight) {

    }
}
