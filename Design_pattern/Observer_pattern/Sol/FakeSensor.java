package Observer_pattern.Sol;

class FakeSensor {
   private int temperature;
    C_ObservEE o;

    public int getTemperature() {
        return this.temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    FakeSensor(C_ObservEE o) {
        this.o = o;
        new Thread(() -> {
            // faking ..............constantly checking the sensor
            while (true) {
                if (this.temperature != getTemperature()) {
                    this.temperature = getTemperature();



                    // *****************************************************************
                    // here we will define setting the observee value.........
                    o.setState(temperature);
                    // What does this mean ??????we are defining for setting the variable of observee in the sensor .........
                    // If you think correctly we just decoupled it
                    // *************************************************************** */



                }
                System.out.println("now state is :" + this.temperature);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println(e);
                    break;
                }
            }
        }).start();

        // faking disturbance in sensor
        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(5000);
                    setTemperature(getTemperature() + 10);
                } catch (Exception e) {
                    System.out.println("hello" + e);
                    return;
                }

            }
        }).start();

    }

}


