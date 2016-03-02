package WeatherGUI;


import com.teknikindustries.yahooweather.WeatherDoc;

/**
 * @author Zhengyang Zhao
 * This class extends from WeatherLibrary.WeatherDisplay class
 * After setting woeid in the constructor, the getter and setter in the
 * WeatherDisplay class can also be used.
 */
public class WeatherData extends com.teknikindustries.yahooweather.WeatherDisplay{

    private String woeid;

    public WeatherData(String woeid) {
        this.woeid = woeid;
        WeatherDoc weatherDoc = new WeatherDoc(woeid, "c");
    }
}
