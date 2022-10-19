package restapi.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.io.Serializable;

@JacksonXmlRootElement(localName = "Student")
public class Student implements Serializable {

	private static final long serialVersionUID = 21L;

	@JacksonXmlProperty(isAttribute = true)
	private Long id;

	@JacksonXmlProperty
	private String name;

	@JacksonXmlProperty
	private int facNumber;

	public Student() {
	}

	public Student(Long id, String name, int facNumber) {
        this.id = id;
        this.name = name;
        this.facNumber = facNumber;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getFacNumber() {
		return facNumber;
	}

	public void setFacNumber(int facNumber) {
		this.facNumber = facNumber;
	}
}