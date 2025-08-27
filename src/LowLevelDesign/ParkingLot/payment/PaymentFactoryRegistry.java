package LowLevelDesign.ParkingLot.payment;

import java.util.EnumMap;
import java.util.Map;

public class PaymentFactoryRegistry {
    private final Map<PaymentMethodType, PaymentFactory> factories = new EnumMap<>(PaymentMethodType.class);

    public void registerFactory(PaymentMethodType type, PaymentFactory factory) {
        factories.put(type, factory);
    }

    public PaymentFactory getFactory(PaymentMethodType type) {
        return factories.get(type);
    }

    public boolean supports(PaymentMethodType type) {
        return factories.containsKey(type);
    }
}