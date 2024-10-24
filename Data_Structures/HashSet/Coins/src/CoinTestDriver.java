import java.util.HashSet;

public class CoinTestDriver {

	public static void main(String[] args) {
		HashSet<Coin> bagofCoins = new HashSet<>();

		Coin coin1 = new Coin(1);
		Coin coin2 = new Coin(2);
		Coin coin5 = new Coin(5);
		Coin coin10 = new Coin(10);
		Coin coin20 = new Coin(20);
		Coin coin50 = new Coin(50);
		Coin coin100 = new Coin(100);

		bagofCoins.add(coin1);
		bagofCoins.add(coin2);
		bagofCoins.add(coin5);
		bagofCoins.add(coin10);
		bagofCoins.add(coin20);
		bagofCoins.add(coin50);
		bagofCoins.add(coin10);

		findCoin(bagofCoins, coin10);
		findCoin(bagofCoins, coin100);

		displayBagContents(bagofCoins);
		displayBagDetails(bagofCoins);

		findCoin(bagofCoins, coin10);
		findCoin(bagofCoins, coin100);
		displayBagContents(bagofCoins);
		displayBagDetails(bagofCoins);
		bagofCoins.clear();
		displayBagDetails(bagofCoins);

	}

	static void findCoin(HashSet<Coin> bagOfCoins, Coin coin) {
		if (bagOfCoins.contains(coin))
			System.out.println("There is a coin" + coin.getDenomination() + " in the bag");
		else
			System.out.println("There is no coin" + coin.getDenomination() + " in the bag");
	}

	static void displayBagContents(HashSet<Coin> bagOfCoins) {
		for (Coin coin : bagOfCoins)
			System.out.println(coin.getDenomination());
	}

	static void displayBagDetails(HashSet<Coin> bagOfCoins) {
		if (bagOfCoins.isEmpty())
			System.out.println("There are no coins in the bag");
		else
			System.out.println("There are " + bagOfCoins.size() + "coins in the bag");
	}

}
