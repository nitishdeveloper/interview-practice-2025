package DesignPatternPractice.Builder;

public class Address {
    private final String address;

    public Address(Builder builder) {
        this.address = builder.address;
    }

    public static class Builder {
        private String address;

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Address build() {
            return new Address(this);
        }
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}

class MyClass {
    public static void main(String[] args) {
        Address address = new Address.Builder().address("Test").build();
        System.out.println("address :: " + address);
    }
}
