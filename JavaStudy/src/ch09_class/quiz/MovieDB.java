package ch09_class.quiz;

import java.util.ArrayList;

public class MovieDB {
	
	private ArrayList<Movie> movieList = new ArrayList<>();
	
	// 싱글톤 패턴
	//1
	private MovieDB() {
		movieList.add(new Movie("신세계", "거 죽기 딱 좋은 날씨네", "이정재, 황정민, 박성웅", "ㅅㅅㄱ"));
		movieList.add(new Movie("범죄와의전쟁", "느그 서장 남천동 살제?", "최민식, 하정우", "ㅂㅈㅇㅇㅈㅈ"));
		movieList.add(new Movie("범죄도시", "진실의 방으로", "마동석, 윤계상", "ㅂㅈㄷㅅ"));
		movieList.add(new Movie("명량", "신에게는 아직 12척의 배가 남아있습니다", "최민식, 류승룡", "ㅁㄹ"));
		movieList.add(new Movie("부당거래", "너 오늘부터 범인해라", "류승범, 황정민", "ㅂㄷㄱㄹ"));
		movieList.add(new Movie("추격자", "4885 너지?", "하정우, 김윤석", "ㅊㄱㅈ"));
		movieList.add(new Movie("기생충", "너는 다 계획이 있구나?", "송강호, 최우식, 박소담 ", "ㄱㅅㅊ"));
		movieList.add(new Movie("내부자들", "모히또 가서 몰디브 한 잔", "조승우, 이병헌", "ㄴㅂㅈㄷ"));
		movieList.add(new Movie("아저씨", "오지마 피 묻어", "원빈, 김새론", "ㅇㅈㅆ"));
		movieList.add(new Movie("베테랑", "어이가 없네", "황정민, 유아인", "ㅂㅌㄹ"));
	}
	//2 객체 생성 3. static 4. private
	private static MovieDB instance = new MovieDB();
	
	//5 getter
	public static MovieDB getInstance() {
		return instance;
	}
	
	public ArrayList<Movie> getMovieList() {
		return movieList;
	}
	
	
	
	
	
	
	
}
