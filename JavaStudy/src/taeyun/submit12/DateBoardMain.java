package taeyun.submit12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;

public class DateBoardMain {

	public static void main(String[] args) throws ParseException {
			// dbList에 랜덤 날짜를 가지는 DateBoard 객체 100개 삽입
		ArrayList<DateBoard> dbList = new ArrayList<DateBoard>();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		for(int i = 0; i < 100; i++) {
			int randDay = (int)(Math.random() * 365) + 1;  // 1~365
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.DATE, randDay * -1);
			
			String strDate = sdf.format(cal.getTime());
			dbList.add(new DateBoard((i+1) + "번째 생성된 글", strDate));
		}
		
//		for(int i = 0; i < dbList.size(); i++) {
//			System.out.println(dbList.get(i));
//		}
		
		
		// 날짜순으로 정렬
		System.out.println("\n==============================최신순======================================\n");
		for(int i = 0; i < dbList.size()-1; i++) {
			for(int k = 0; k < dbList.size()-1; k++) {
				long date1 = sdf.parse(dbList.get(k).getDate()).getTime();
				long date2 = sdf.parse(dbList.get(k+1).getDate()).getTime();
				
				if(date1 < date2) {
					DateBoard temp = dbList.get(k);
					dbList.set(k, dbList.get(k+1));
					dbList.set(k+1, temp);
				}
			}
		}
		
		for(int i = 0; i < dbList.size(); i++) {
			System.out.println(dbList.get(i));
		}
		
		System.out.println("\n==============================오래된 순======================================\n");
		for(int i = 0; i < dbList.size()-1; i++) {
			for(int k = 0; k < dbList.size()-1; k++) {
				long date1 = sdf.parse(dbList.get(k).getDate()).getTime();
				long date2 = sdf.parse(dbList.get(k+1).getDate()).getTime();
				
				if(date1 > date2) {
					DateBoard temp = dbList.get(k);
					dbList.set(k, dbList.get(k+1));
					dbList.set(k+1, temp);
				}
			}
		}
		
		for(int i = 0; i < dbList.size(); i++) {
			System.out.println(dbList.get(i));
		}
		
		System.out.println("\n==============================한달 이내======================================\n");
		
		Calendar month = Calendar.getInstance();
		month.add(Calendar.MONTH,-1);
		for(int i = 0; i < dbList.size(); i++) {
			if(sdf.parse(dbList.get(i).getDate()).getTime() > month.getTimeInMillis()) {
				System.out.println(dbList.get(i));
			}
		}
		
		System.out.println("\n==============================이번달에 작성된 글만 ======================================\n");
		
		
		
		
	}
}
