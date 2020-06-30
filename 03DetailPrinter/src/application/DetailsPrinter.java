/*
 * Created By Fajrina Aflaha.
 */
package application;

import java.util.List;

/**
 *
 * @author Fajrina Aflaha
 */
public class DetailsPrinter {
    private List<Employee> employees;
    
    public DetailsPrinter(List<Employee> employees){
        this.employees = employees;
    }
    
    public void printDetails(){
        for(Employee employee : employees)
            System.out.println(employee);
    }
}
