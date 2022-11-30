package in.ashokit.entity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="STUDENT_DTLS")
public class StudentEntity 
{
	@Id
	@Column(name="STUDENT_ID")
	private Integer studentId;
	@Column(name="STUDENT_NAME")
	private String studentName;
	@Column(name="STUDENT_EMAIL")
	private String studentEmail;
	@Column(name="STUDENT_RANK")
	private Integer studentRank;

}
