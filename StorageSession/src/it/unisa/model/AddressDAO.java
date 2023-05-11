package it.unisa.model;

import java.sql.SQLException;

public interface AddressDAO {
	
	public int saveAddress(AddressBean address) throws SQLException; // salva indirizzo
	
	public int deleteAddress(AddressBean address) throws SQLException; // delete indirizzo
	
	public AddressBean findByCred(String cap, String via, String numCivico) throws SQLException; // ricerca utente per indirizzo (no id)
	
}
