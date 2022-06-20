package OnetoOne;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Entity
@Table(name="passport")
public class Passport {
	@Id
	@GeneratedValue
	@Column(name="passport_number")
	private int passportNumber;
	@Column(name="issuedby")
	private int issued_by;
	@Column(name="passportexpiry")
	private Date passport_ExpiryDate;
	@Column(name="passportIssue")
	private Date passport_issueDate;
	@OnetoOne
	private Employee employee;
	

}
