package collection;

import java.util.*;

public class TheaterMovieMain {
	void setData(ArrayList<Theater> theater) {
		ArrayList<Movie1> movie1 = new ArrayList<Movie1>();
		Movie1 m1 = new Movie1();
		m1.setId(22);
		m1.setName("Ved");
		m1.setNoOfShows(5);

		Movie1 m2 = new Movie1();
		m2.setId(44);
		m2.setName("RRR");
		m2.setNoOfShows(2);

		Movie1 m3 = new Movie1();
		m3.setId(102);
		m3.setName("Avtaar");
		m3.setNoOfShows(4);
		movie1.add(m1);
		movie1.add(m2);
		movie1.add(m3);

		ArrayList<Movie1> movie2 = new ArrayList<Movie1>();
		movie2.add(new Movie1(76, "Bramhastra", 2));
		movie2.add(new Movie1(256, "KGF2", 5));
		movie2.add(new Movie1(706, "Kedarnath", 4));

		ArrayList<Movie1> movie3 = new ArrayList<Movie1>();
		movie3.add(new Movie1(802, "Pathan", 1));
		movie3.add(new Movie1(888, "Atarangi Re", 5));
		movie3.add(new Movie1(406, "The Little Mermaid", 3));

		Theater t = new Theater();
		t.setId(1231);
		t.setName("INOX");
		t.setMovie(movie1);

		Theater t2 = new Theater(1002, "Cinepolis", movie2);
		Theater t3 = new Theater(322, "Rajhans", movie3);

		theater.add(t);
		theater.add(t2);
		theater.add(t3);

	}

	void deleteShow(ArrayList<Theater> theatre) {
		Iterator<Theater> titr = theatre.iterator();
		while (titr.hasNext()) {
			Theater tt = titr.next();
			Iterator<Movie1> mitr = tt.getMovie().iterator();
			while (mitr.hasNext()) {
				if (mitr.next().noOfShows <= 2) {
					mitr.remove();
				}
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Theater> theatre = new ArrayList<>();
		TheaterMovieMain tm = new TheaterMovieMain();
		tm.setData(theatre);
		System.out.println(theatre);
		tm.deleteShow(theatre);
		System.out.println(theatre);

	}

}
