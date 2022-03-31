package JFS.JFS_Hibernate_XmlConfig;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Person {
	@Id
	private int pid;
	private String pname;
//	@OneToOne
//	private Laptop laptop;

	@OneToMany
	private List<Laptop> laptop=new ArrayList<Laptop>();

	public Person() {
		super();
		this.pid = pid;
		this.pname = pname;
		this.laptop = laptop;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public List<Laptop> getLaptop() {
		return laptop;
	}

	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", laptop=" + laptop + "]";
	}
	

	
}
