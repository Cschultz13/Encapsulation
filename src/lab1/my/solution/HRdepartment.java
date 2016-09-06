/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.my.solution;

/**
 *
 * @author cschultz57
 */
public class HRdepartment {
    private final Employee employee = new Employee();

    public void hireEmployee(String firstName, String lastName, String ssn, String cubeId){
        employee.setFirstName(firstName);
        employee.setLastName(lastName); 
        employee.setSsn(ssn);
        employee.setCubeId(cubeId);
        employee.beginNewEmployeeOrientation(employee.getCubeId());
               
    }
    
    public String getEmployeeStatus() {
      return employee.getStatus();
    }
    
}
