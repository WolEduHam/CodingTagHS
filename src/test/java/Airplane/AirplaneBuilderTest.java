package Airplane;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class AirplaneBuilderTest {
    @Test
    public void createAnAirplaneWithModels() {
        AirplaneBuilder test1 = new AirplaneBuilder();
        test1.setModel("airbus");
        Airplane airbus = test1.build();

        assertThat(airbus.getModel()).isEqualTo("airbus");
    }
    @Test
    public void createAnAirplaneWithEngines() {
        AirplaneBuilder test2 = new AirplaneBuilder();
        List<String> engines = new ArrayList();
        engines.add("Turbine 1");
        engines.add("Turbine 2");
        test2.setEngines(engines);
        Airplane airbus = test2.build();

        assertThat(airbus.getEngines()).isEqualTo(engines);
    }
}