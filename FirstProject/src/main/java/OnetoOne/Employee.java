
package OnetoOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="empl")
public class Employee {
@Id
@GeneratedValue
@Column(name=""empno)
private int employeeNumber;
@Column(name="emp_name", length=20)
private String employeeName;
@Column(name="emp_BasicSal", length=20)
private double EmployeeSalary;
@OneToOne
private Passport Passport;
public Passport getPassport() {
	return Passport;
}
public void setPassport(Passport passport) {
	Passport = passport;
}


}
