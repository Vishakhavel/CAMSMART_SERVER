package admin_server;
//
//public class Users {
//	
//
//}




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name = "users2")
@Table(name = "tarp")
public class Users {

    @Id
    @GeneratedValue     // trying to increment ID automatically.
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "date")
    private String date;
    public String getDate() { 	
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Column(name = "time_stamp")
    private String time_stamp;
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

	

	public String getAlert_type() {
		return alert_type;
	}

	public String getTime_stamp() {
		return time_stamp;
	}

	public void setTime_stamp(String time_stamp) {
		this.time_stamp = time_stamp;
	}

	public void setAlert_type(String alert_type) {
		this.alert_type = alert_type;
	}

//	public String getImage() {
//		return image;
//	}
//
//	public void setImage(String image) {
//		this.image = image;
//	}

	@Column(name = "alert_type")
    private String alert_type;
//    @Column(name = "image")
//    private String image;

    public Users() {
    }

   
}

