package bank.access;

import java.rmi.RemoteException;
import java.sql.*;

import bank.Account;
import bank.BankCard;
import bank.Client;

public class DataAccessImpl implements DataAccess {
	private static DataAccess singleton;
	private Connection conn = null;
		
	private DataAccessImpl () {
		//Setup DB configuration
		String userName = "jmtuser";
		String password = "sa";
		String url = "jdbc:mysql://localhost/jmtbank";
		
		try {
			Class.forName ("com.mysql.jdbc.Driver").newInstance ();
		} catch (Exception e) {
			System.out.println("Can't find MySQL class: " + e.getMessage());
		}				
		 
		//Establish DB connection
		try {
			 conn = DriverManager.getConnection (url, userName, password);
			 System.out.println ("Database connection established");
			 
			 conn.setAutoCommit(false);
		 } catch (SQLException e) {
		     System.err.println ("Cannot connect to database server: " + e.getMessage());
		     e.printStackTrace();
		 }
	}
	
	public static DataAccess getInstance() {
		if(singleton == null) singleton = new DataAccessImpl();
		return singleton;
	}

	@Override
	public Account getAccount(String accountId) throws RemoteException,
			DataAccessException {
		Account ret = null;

		try {
			// fetch account record from DB
			PreparedStatement s = conn.prepareStatement ("SELECT * FROM account WHERE accountId = ?");
			s.setString(1, accountId);   
			 
			// execute query and handle result
			ResultSet rs = s.executeQuery();  
			if (rs.next()) {
				ret = new Account();
				ret.setAccountId(rs.getString("accountId"));
				ret.setBalance(rs.getFloat("balance"));
				
				// fetch username
				s = conn.prepareStatement("SELECT * FROM client WHERE accountId = ?");
				s.setString(1, accountId); 
				
				ResultSet rsClient = s.executeQuery();
				if (rsClient.next()) {
					ret.setUserName(rsClient.getString("username"));
				}
			}
		} catch (Exception e) {
			throw new DataAccessException("Database failure");
		}
		return ret;
	}

	@Override
	public Client getClient(String username) throws RemoteException,
			DataAccessException {
		Client retClient = null;
				
		try {
			// fetch account record from DB
			PreparedStatement s = conn.prepareStatement ("SELECT * FROM client WHERE username = ?");
			s.setString(1, username);   
			 
			// execute query and handle result
			ResultSet rs = s.executeQuery();  
			if (rs.next()) {
				retClient = new Client();
				
				retClient.setAccountId(rs.getString("accountId"));
				retClient.setFirstName(rs.getString("firstname"));
				retClient.setLastName(rs.getString("lastname"));
				retClient.setUserName(rs.getString("username"));
				retClient.setPassword(rs.getString("password"));				
			}
		} catch (Exception e) {
			throw new DataAccessException("Database failure");
		}
		
		return retClient;
	}

	@Override
	public BankCard getBankCard(String cardId) throws RemoteException,
			DataAccessException {
		BankCard ret = null;
		
		try {
			// fetch account record from DB
			PreparedStatement s = conn.prepareStatement ("SELECT * FROM bankcard WHERE cardId = ?");
			s.setString(1, cardId);   
			 
			// execute query and handle result
			ResultSet rs = s.executeQuery();  
			if (rs.next()) {
				ret = new BankCard();
				
				ret.setAccountId(rs.getString("accountId"));
				ret.setCardId(cardId);
				ret.setPIN(rs.getString("pin"));				
			}
		} catch (Exception e) {
			throw new DataAccessException("Database failure");
		}
		
		return ret;
	}

	@Override
	public void debitAccount(String accountId, float amount)
			throws RemoteException, DataAccessException {
		// update balance
		this.updateBalance(accountId,  -1 * amount);
	}

	@Override
	public void creditAccount(String accountId, float amount)
			throws RemoteException, DataAccessException {
		// update balance
		this.updateBalance(accountId,  amount);
	}

	@Override
	public void beginTransaction() throws RemoteException, DataAccessException {
		// not necessary (auto commit = off)
	}

	@Override
	public void commitTransaction() throws RemoteException, DataAccessException {
		try {
			conn.commit();
		} catch (SQLException e) {
			throw new DataAccessException("Database failure");
		}
	}

	@Override
	public void rollbackTransaction() throws RemoteException,
			DataAccessException {
		try {
			conn.rollback();
		} catch (SQLException e) {
			throw new DataAccessException("Database failure");
		}
	}
	
	private void updateBalance(String accountId, float amount) throws DataAccessException, RemoteException {
		Account account = this.getAccount(accountId);
		
		if (account == null) {
			throw new DataAccessException("Unknown debit account");
		}
		
		try {
			// fetch account record from DB
			PreparedStatement s = conn.prepareStatement ("UPDATE account " +
					"SET balance = ? WHERE accountId = ?");
			s.setFloat(1, account.getBalance() + amount);   
			s.setString(2, accountId);
			 
			// execute query
			s.executeUpdate();
		} catch (Exception e) {
			throw new DataAccessException("Database failure");
		}
	}

}
