package saini.com.sll;

import javax.persistence.*;  
import org.hibernate.annotations.Cache;  
import org.hibernate.annotations.CacheConcurrencyStrategy;  
@Entity   
@Cacheable  
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)  
public class alien{
	
	@Id
	private int id;
	private  String name;
	private String color;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Alien [id=" + id + ", name=" + name + ", color=" + color + "]";
	}
	
	
	

	
	
}
