package MavenDemo;

import java.time.LocalDateTime;

public class Date {

	public static void main(String[] args) throws InterruptedException {
		
		Date dt = new Date();
		System.out.println(dt);
		System.out.println(dt.toString().replace(" ", "_").replace(":", "_")+".png");
		
		System.out.println("-----------");
		for(int i=1;i<=10;i++)
		{
			Thread.sleep(1000l);
			System.out.println(System.currentTimeMillis());
		}

		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt.toString());
		
	}
}
