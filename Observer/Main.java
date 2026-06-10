package Observer;
public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        ConsoleDisplay consoleDisplay = new ConsoleDisplay();
        FanController fanController = new FanController();

        station.subscribe(consoleDisplay);
        station.subscribe(fanController);

        station.setTemperature(26);
        station.setTemperature(30);

        station.unsubscribe(consoleDisplay);

        station.setTemperature(27);
    }
}
