package DAO;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.mysql.jdbc.Connection;

import Rsvier.evvo.medel.Address;
import Utility.ConnectionManager;

public class AddressDAOImp implements AddressDAO {

	private Logger logger = Logger.getLogger(AddressDAOImp.class.getName());
	private ConnectionManager cm = new ConnectionManager();
	private Connection conn;
	private PreparedStatement ps;
	private String query;
	
	// Get a list of all addresses

	public List<Address> getAllAddresses() {

		List<Address> addressList = new ArrayList();
		
		
		query = "SELECT id,streetName,houseNumber,additionalHouseNumber,postalCode,city,country" + "FROM address";

			// Connect to the database
			
			try {
				conn = (Connection) cm.getConnection();
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery(query);
				
// Get id,streetName,houseNumber,additionalHouseNumber,postalCode,city,country of each Address from the database
				while (rs.next()) {

					Address.AddressBuilder ab = new Address.AddressBuilder();
					ab.addressId(rs.getInt(1));
					ab.streetName(rs.getString(2));
					ab.houseNumber(rs.getInt(3));
					ab.additionalHousenumber(rs.getInt(4));
					ab.postalCode(rs.getString(5));
					ab.city(rs.getString(6));
					ab.country(rs.getString(7));
					Address address = ab.build();
					
			// Add Address to a list		
					addressList.add(address);
				}
			} catch (ClassNotFoundException e) {
				logger.log(Level.INFO, " Can't load the Driver");
			} catch (SQLException e) {
				logger.log(Level.INFO, " Can't connect to the database");
				
			}
			
		
			 

		return addressList;
	}

	public Address getAddress(int addressId) {
		
		Address.AddressBuilder ab = new Address.AddressBuilder();
		Address address = null;
		
		query = "select * from address where id = ? ";
		
		
		try {
			conn = (Connection) cm.getConnection();
			ps = conn.prepareStatement(query);
			ps.setInt(1, addressId);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				
				ab.addressId(rs.getInt(1));
				ab.streetName(rs.getString(2));
				ab.houseNumber(rs.getInt(3));
				ab.additionalHousenumber(rs.getInt(4));
				ab.postalCode(rs.getString(5));
				ab.city(rs.getString(6));
				ab.country(rs.getString(7));	
				
			}
			
			address = ab.build();
			
			
		} catch (ClassNotFoundException e) {
			logger.log(Level.INFO, " Can't load the Driver");
		} catch (SQLException e) {
			logger.log(Level.INFO, " Can't connect to the database");
		}
	
		
		return address;
		
	}
	
	


	public void createAddress(Address address) {
		
	}

	public void updateAddress(Address address) {
		// TODO Auto-generated method stub

	}

	public void deleteAddress(Address address) {
		// TODO Auto-generated method stub

	}

}
