package in.ashokit.generator;

import java.io.Serializable;

import org.hibernate.id.IdentifierGenerator;


public class AshokitGenarator {
	public class AshokitGenerator implements IdentifierGenerator{
		
		@Override
		   public Serializable generate(SharedSessionContractImplementor session ,Object)
		     String Preffix ="AIT1";
		     String Suffix="";
		   try {
			  Connection con= session.connection();
			  Statement stmt= con.createStatement();
			  String sql="select order_id_seq.nextval from dual";
			  ResultSet rs=stmt.executeQuary(sql);
			      if(rs.next()) {
			    	  int seqval=rs.getInt(1);
			    	  suffix=String.valueOf(sequal);
			      }
			      
		       }catch(Exception e) {
			   e.printStackTrace();
		       }
		   
		   return prefix+suffix;
		}
		}
}
