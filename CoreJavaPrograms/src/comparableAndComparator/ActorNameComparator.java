package comparableAndComparator;

import java.util.Comparator;

public class ActorNameComparator implements Comparator<Actor> {
public int compare(Actor a1,Actor a2) {
	return a1.name.compareTo(a2.name);
}
}
