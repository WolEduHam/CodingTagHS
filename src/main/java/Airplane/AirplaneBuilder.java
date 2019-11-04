package Airplane;

import java.util.List;

public class AirplaneBuilder {
    private String model;
    private List<String> engines;

    public Airplane build() {
        return new Airplane(model, engines);
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setEngines(List<String> engines){
        this.engines = engines;
    }
}
