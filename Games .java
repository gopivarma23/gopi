public class Games {
	public static void showGameTitle() {
		System.out.println("Welcome to Adventure Quest! ");
	}

	public static void showGameRules() {
        System.out.println("Rules:");
        System.out.println(" Collect coins");
        System.out.println(" Avoid obstacles");
        System.out.println(" Reach the goal");
	}
	
	public static void showLoadingScreen() {
        System.out.println("Loading games Please wait");
    }
	
	public static void main(String[] args) {
        showGameTitle();
        showGameRules();
        showLoadingScreen();
    }
}