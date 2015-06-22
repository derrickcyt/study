package pojo;

import javax.persistence.*;

@Entity
@Table(name="person")
public class Person {
	
	
	@Id
	@Column(name="pid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(name="pname")
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Person(Integer id,String name){
		this.setId(id);
		this.setName(name);
	}
	
	public Person(String name){
		this.setName(name);
	}
	
	public Person(){
		
	}

	
	
}
