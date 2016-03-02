package WeatherGUI;

/**
 * @author Zhengyang Zhao
 * This class will take a city name as String
 * Use Switch-Case find the correspond WOEID code
 */
public class FindWoeid {
    private String cityName;

    public FindWoeid(String cityName) {
        this.cityName = cityName;
    }

    public String getWoeidCode() {
        String cityCode;
        switch (cityName) {
            case "Winnipeg":
                cityCode = "2972";
                break;
            case "Vancouver":
                cityCode = "9807";
                break;
            case "Calgary":
                cityCode = "8775";
                break;
            case "Toronto":
                cityCode = "4118";
                break;
            default:
                cityCode = null;
        }

        return cityCode;
    }





}
