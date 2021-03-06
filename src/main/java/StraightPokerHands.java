import java.util.List;


public class StraightPokerHands extends AbstractPokerHands {

	public StraightPokerHands(String cards, AbstractPokerHands next) {
		super(cards, PokerHandsType.STRAIGHT, next);
	}

	@Override
	protected boolean isMatched() {
		return isStraight();
	}

	@Override
	protected int compare(List<Integer> cardRanks, List<Integer> anotherCardRanks) {
		return compareHighCard(cardRanks, anotherCardRanks);
	}

}
