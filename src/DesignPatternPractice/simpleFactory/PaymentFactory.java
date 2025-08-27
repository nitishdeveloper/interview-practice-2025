package DesignPatternPractice.simpleFactory;

import java.util.HashMap;
import java.util.Map;

public class PaymentFactory {
    Map<PaymentType,Object>  paymentTypeObjectMap = new HashMap<>();
    {
        paymentTypeObjectMap.put(PaymentType.GooglePe,new GooglePe());
        paymentTypeObjectMap.put(PaymentType.PhonePe,new PhonePe());
        paymentTypeObjectMap.put(PaymentType.Paytm,new Paytm());
    }



    public Payment getPayment(PaymentType paymentType) {
//        return Optional.ofNullable(paymentTypeObjectMap.get(paymentType));
        switch (paymentType) {
            case Paytm:
                return new Paytm();
            case PhonePe:
                return new PhonePe();
            case GooglePe:
                return new GooglePe();
            default:
                throw new RuntimeException("Payment type not available :: " + paymentType);
        }
    }
}
