package DAO;

import java.sql.DriverManager;
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
	private String query;
	
	
public List<Address> getAllAddresses() {
		List <Address> addressList = new ArrayList();
		query = "SELECT id,streetName,houseNumber,additionalHouseNumber,postalCoge,city,customer_id,adrestype_id" 
				+ "FROM address";
		
		try {
			Connection conn = (Connection) cm.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()){
				
				Address.AddressBuilder ab = new Address.AddressBuilder().addressId(rs.getInt(1));
				
			}
			
		} catch (SQLException e) {
			logger.log(Level.WARNING," Can't connect to the database");
			
		}
		
		
		
		
		return null;
	}

	public Address getAddress(int addressId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void createAddress(Address address) {
		// TODO Auto-generated method stub
		
	}

	public void updateAddress(Address address) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAddress(Address address) {
		// TODO Auto-generated method stub
		
	}

}
