class Checker implements Comparator<Player> {
	public int compare(Player a, Player b) {
		int scoreComparison = Integer.compare(b.score, a.score);
		return (scoreComparison == 0) ? a.name.compareTo(b.name) : scoreComparison;
	}
}
