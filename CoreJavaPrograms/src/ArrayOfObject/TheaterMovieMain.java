package ArrayOfObject;

import java.util.Arrays;
import java.util.Scanner;

public class TheaterMovieMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Theater theater[] = new Theater[1];
		for (int i = 0; i < theater.length; i++) {
			Movie movie[] = new Movie[2];

			System.out.println("Enter Theater Id, Name");
			int tid = sc.nextInt();
			String tname = sc.next();

			for (int j = 0; j < movie.length; j++) {
				System.out.println("Enter Movie Id,Name,Release Year");
				int mid = sc.nextInt();
				String mname = sc.next();
				int mreleaseYear = sc.nextInt();
				Movie m = new Movie();
				m.setId(mid);
				m.setName(mname);
				m.setReleaseYear(mreleaseYear);
				movie[j] = m;

			}
			Theater t = new Theater();
			t.setId(tid);
			t.setName(tname);
			t.setMovie(movie);

			theater[i] = t;

		}

		for (Theater t : theater) {
			System.out.println(t.getId() + " " + t.getName() + " " + Arrays.toString(t.getMovie()));
			System.out.println(t);
		}
		
		
//		Theater theater[] = new Theater[1];
//		for (int i = 0; i < theater.length; i++) {
//			Movie movie[] = new Movie[2];
//
//			System.out.println("Enter Theater Id, Name");
//			int tid = sc.nextInt();
//			String tname = sc.next();
//
//			for (int j = 0; j < movie.length; j++) {
//				System.out.println("Enter Movie Id,Name,Release Year");
//				int mid = sc.nextInt();
//				String mname = sc.next();
//				int mreleaseYear = sc.nextInt();
//			
//				movie[j] = new Movie(mid, mname, mreleaseYear);
//
//			}
//			
//			
//
//			theater[i] = new Theater(tid, tname, movie);
//		}
//		
//		
//		for(Theater t:theater) {
//			System.out.println(t);
//		}
		
		

	}

}
