package db.main;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

import db.encryption.Encryption;
import db.manage.User;
import db.manage.UserDAO;

public class Main {
	static Encryption encrypt = new Encryption("adminpassword128");
	static Scanner sc = new Scanner(System.in);
	public static void ShowMenu() {
		System.out.println("--------------------M E N U--------------------");
		System.out.println("1. Register");
		System.out.println("2. Show User List");
		System.out.println("3. Exit");
		System.out.println("-----------------------------------------------");
	}
	
	public static String SelectMail(String mail_id) {
		System.out.println("Select Web Page");
		System.out.println("\r1. google.com");
		System.out.println("\r2. naver.com");
		System.out.println("\r3. hanmail.net");
		System.out.println("\r4. yahoo.co.jp");
		System.out.println("\r0. etc...");
		int mail_choose = sc.nextInt();
		String page = "";
		switch(mail_choose) {
		case 1 :
			page = "google.com";
			break;
		case 2 :
			page = "naver.com";
			break;
		case 3 :
			page = "hanmail.net";
			break;
		case 4 : 
			page = "yahoo.co.jp";
			break;
		case 0 :
			page = Regex_MailPage();
			break;
		}
		return mail_id + "@" + page;
	}
	
	public static String Regex_MailPage() {
		String mail_page = "";
		boolean check;
		while(true) {
			System.out.println("Write Web Page");
			mail_page = sc.next();
			check = Pattern.matches("\\w+\\.\\w+(\\.\\w+)?", mail_page);
			if(check) {
				return mail_page;
			}else {
				System.out.println("That's wrong Expression..");
				System.out.println("Please Rewrite");
			}
		}
	}
	
	public static String Regex_RegisNum() {
		String regis_num = "";
		boolean check;
		while(true) {
			System.out.print("Resident Registration Number : ");
			regis_num = sc.next();
			check = Pattern.matches("^\\d{6}-\\d{7}$", regis_num);
			if(check) {
				return regis_num;
			}else {
				System.out.println("That's wrong Expression..");
				System.out.println("Please Rewrite");
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		UserDAO dao = new UserDAO();
		boolean flag = true;
		dao.Join();
		
		do {
			ShowMenu();
			int choice = sc.nextInt();
			switch(choice) {
			case 1 :
				System.out.print("ID : ");
				String id = sc.next();
				System.out.print("PASSWORD : ");
				String pw = null;
				try {
					pw = encrypt.Enc(sc.next());
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.print("NAME : ");
				String name = sc.next();
				String regis_num = Regex_RegisNum();
				System.out.print("E-Mail_ID : ");
				String mail_id = sc.next();
				String email = SelectMail(mail_id);
				User user = new User(id, pw, name, regis_num, email);
				dao.Register(user);
				break;
			case 2 :
				ArrayList<User> list = dao.ShowUserList();
				System.out.println("NO\t\tid\t\tpassword\tname\tregisnum\temail");
				for(int i = 0; i < list.size(); i++) {
					User getlist = list.get(i);
					String user_id = getlist.getId();
					String user_pw = encrypt.Dec(getlist.getPw());
					String user_name = getlist.getName();
					String user_regisnum = getlist.getRegis_num();
					String user_email = getlist.getEmail();
					System.out.println((i + 1)+ "\t\t" + user_id + "\t\t" + user_pw + "\t" + user_name + "\t" + user_regisnum + "\t" + user_email);
				}
				break;
			case 3 :
				flag = false;
				System.out.println("Exit Register...");
				break;
			}
		}while(flag);
		sc.close();
	}
}
