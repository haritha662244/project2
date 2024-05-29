package in.ashokit.util;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

import in.ashokit.bean.Employee;

public class JsonUtil {
	  public static void main(String[] a)  
      {  
          // Creating object of Product  
          Employee emp = new Employee();  
          // Inserting the data into the object  
          emp = getObjectData(emp);  
          // Creating Object of ObjectMapper define in Jackson API  
          ObjectMapper Obj = new ObjectMapper();  
          try {  
              // Converting the Java object into a JSON string  
              String jsonStr = Obj.writeValueAsString(emp);  
              // Displaying Java object into a JSON string  
              System.out.println(jsonStr);  
          }  
          catch (IOException e) {  
              e.printStackTrace();  
          }  
      }  
      // Getting data that we want to insert into an object  
      public static Employee getObjectData(Employee employee)  
      {  
          // Insert the data  
    	  employee.setEmpNo(101);  
    	  employee.setName("Spark 131");  
    	  employee.setSalary(10000);  
          // Returning the product object  
          return employee;  
      }  
}  
