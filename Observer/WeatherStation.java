package Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private List<TemperatureObserver> temperaturasObservadas = new ArrayList<>();

    void subscribe(TemperatureObserver o){
        temperaturasObservadas.add(o);
    }
    void unsubscribe(TemperatureObserver o){
        temperaturasObservadas.remove(o);
    }

    private void notifyObservers(double temp){
        for (TemperatureObserver o : temperaturasObservadas) {
            o.onTemperatureChanged(temp);
        }
    }

    public void setTemperature(double temp){
        System.out.println("Temperatura atual: " + temp);
        notifyObservers(temp);
    }

}
