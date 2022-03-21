package db.manage;

/*

	create table user(
	no int not null auto_increment primary key,
	id varchar(20) not null unique,
	password varchar(200) not null,
	name varchar(20) not null,
	regis_num varchar(30) not null unique,
	email varchar(100) not null
	);

 * */

public class User {
	private String id;
	private String pw;
	private String name;
	private String regis_num;
	private String email;
	
	public User(String id, String pw, String name, String regis_num, String email) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.regis_num = regis_num;
		this.email = email;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegis_num() {
		return regis_num;
	}
	public void setRegis_num(String regis_num) {
		this.regis_num = regis_num;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
