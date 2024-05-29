package in.ashokit.Identifiergenerator;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;


public class OrderIdGenerator implements IdentifierGenerator {
	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) {
		String prefix ="OD";
	    String suffix="";
	  try {
		   
		  Connection con=  session.Connection();
		  Statement stmt= con.createStatement();
		  String sql="select order_id_seq.nextval from dual";
		  ResultSet rs= stmt.executeQuery(sql);
		 
		  
		  
		      if(rs.next()) {
		    	  int seqval=rs.getInt(1);
		    	  suffix=String.valueOf(seqval);
		      }
		      
	      }  catch(Exception e) {
		      e.printStackTrace();
	      }
	  
	  return prefix+suffix;
	}
	}
}
