package Transport;
import java.util.Objects;
public abstract class Transport {
    private final String brand;
    private final String model;
    private final float engineVolume;
       public Transport(
            String brand,
            String model,
            float engineVolume
    ) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
    }
  public abstract void startMovement();
    public abstract void stopMovement();
        public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public float getEngineVolume() {
        return engineVolume;
    }
    public abstract void printType();
    public abstract void repair();
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }
 @Override
    public int hashCode() {
        return Objects.hash(brand, model);
    }
}