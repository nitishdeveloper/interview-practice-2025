package LowLevelDesign.ParkingLot.gates;

import LowLevelDesign.ParkingLot.parking.ParkingSlipGenerator;
import LowLevelDesign.ParkingLot.parking.ParkingTicket;
import LowLevelDesign.ParkingLot.payment.*;

// ExitGate.java
public class ExitGate extends Gate {
    private final PaymentProcessor paymentProcessor;
    private final ParkingSlipGenerator slipGenerator;

    public ExitGate(String gateId, PaymentProcessor paymentProcessor) {
        super(gateId, GateType.EXIT);
        this.paymentProcessor = paymentProcessor;
        this.slipGenerator = new ParkingSlipGenerator();
    }

    public PaymentResult processPayment(ParkingTicket ticket, PaymentMethodType paymentMethod) {
        // Validate ticket
        if (ticket == null) {
            return new PaymentResult(false, "Invalid ticket", null, 0);
        }

        // Create payment request
        PaymentRequest request = new PaymentRequest(
                ticket.getAmount(),
                paymentMethod,
                ticket.getTicketNumber()
        );
        PaymentResult result = paymentProcessor.processPayment(request);
        if (result.isSuccess()) {
            generateParkingSlip(ticket, result);
        }

        return result;
    }

    private void generateParkingSlip(ParkingTicket ticket, PaymentResult paymentResult) {
        slipGenerator.generateSlip(
                ticket.getTicketNumber(),
                ticket.getVehicle().getLicensePlate(),
                ticket.getEntryTime(),
                ticket.getExitTime(),
                paymentResult.getAmount(),
                paymentResult.getTransactionId()
        );
    }
}