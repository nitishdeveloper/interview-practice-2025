package DesignPatternPractice.ChianOfResponsiblity.ATM;

public interface DispenseChain {
    void setDispenseChain(DispenseChain dispenseChain);
    void dispenseAmount(Currency currency);
}
