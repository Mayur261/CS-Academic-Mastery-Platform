package mode;

public class user {

	private int id;
	private String  fname;
	private String lname;
	private String email;
	private String username;
	private String password;
	
	private String name;
	private String number;
	private String saddress;
	private String caddress;
	private String college;
	private String course;
	private String total_sem;
	private String remaining_sem;
	
	private String aduser;
	private String adpass;
	
	
	public String getAduser() {
		return aduser;
	}
	public void setAduser(String aduser) {
		this.aduser = aduser;
	}
	public String getAdpass() {
		return adpass;
	}
	public void setAdpass(String adpass) {
		this.adpass = adpass;
	}
	public user(String aduser, String adpass) {
		super();
		this.aduser = aduser;
		this.adpass = adpass;
	}
	public user(String fname, String lname, String email, String username, String password) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.username = username;
		this.password = password;
	}
	public user(int id, String fname, String lname, String email, String username, String password) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.username = username;
		this.password = password;
	}
	public user(int id, String name, String number, String saddress, String caddress, String college, String course,
			String total_sem, String remaining_sem) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.saddress = saddress;
		this.caddress = caddress;
		this.college = college;
		this.course = course;
		this.total_sem = total_sem;
		this.remaining_sem = remaining_sem;
	}
	public user(String name, String number, String saddress, String caddress, String college, String course,
			String total_sem, String remaining_sem) {
		super();
		this.name = name;
		this.number = number;
		this.saddress = saddress;
		this.caddress = caddress;
		this.college = college;
		this.course = course;
		this.total_sem = total_sem;
		this.remaining_sem = remaining_sem;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getTotal_sem() {
		return total_sem;
	}
	public void setTotal_sem(String total_sem) {
		this.total_sem = total_sem;
	}
	public String getRemaining_sem() {
		return remaining_sem;
	}
	public void setRemaining_sem(String remaining_sem) {
		this.remaining_sem = remaining_sem;
	}
	public user(int id, String fname, String lname, String email, String username, String password, String name,
			String number, String saddress, String caddress, String college, String course, String total_sem,
			String remaining_sem) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.username = username;
		this.password = password;
		this.name = name;
		this.number = number;
		this.saddress = saddress;
		this.caddress = caddress;
		this.college = college;
		this.course = course;
		this.total_sem = total_sem;
		this.remaining_sem = remaining_sem;
	}
	public user(String fname, String lname, String email, String username, String password, String name, String number,
			String saddress, String caddress, String college, String course, String total_sem, String remaining_sem) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.username = username;
		this.password = password;
		this.name = name;
		this.number = number;
		this.saddress = saddress;
		this.caddress = caddress;
		this.college = college;
		this.course = course;
		this.total_sem = total_sem;
		this.remaining_sem = remaining_sem;
	}
	@Override
	public String toString() {
		return "user [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", username="
				+ username + ", password=" + password + ", name=" + name + ", number=" + number + ", saddress="
				+ saddress + ", caddress=" + caddress + ", college=" + college + ", course=" + course + ", total_sem="
				+ total_sem + ", remaining_sem=" + remaining_sem + ", aduser=" + aduser + ", adpass=" + adpass + "]";
	}
	
	
	
	
}
