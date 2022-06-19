package org.adactin;

public class Adactin extends LibGlobal {
	public static void main(String[] args) {
		browserConfigChrome();
		openUrl("https://adactinhotelapp.com/");
		Login l = new Login();
		type(l.getTxtemail(), "SweetHoney");
		type(l.getTxtpass(), "Urmila@123");
		click(l.getBtnlogin());
	}
}
