package Roman.pages;

public class PageInitializer {
    public static HomePage homePage;
    public static ToolAndVehicleRentalPage toolAndVehicleRentalPage;

    public static void initializePageObjects () {
        homePage = new HomePage();
        toolAndVehicleRentalPage = new ToolAndVehicleRentalPage();
    }
}
