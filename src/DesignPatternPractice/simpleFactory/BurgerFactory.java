package DesignPatternPractice.simpleFactory;

import java.util.EnumMap;
import java.util.Map;
import java.util.Optional;

public class BurgerFactory {
    private static final Map<BurgerType, Burger> burgerMap = new EnumMap<>(BurgerType.class);

    static {
        burgerMap.put(BurgerType.SMALL, new SmallBurger());
        burgerMap.put(BurgerType.MEDIUM, new MediumBurger());
        burgerMap.put(BurgerType.LARGE, new LargeBurger());
    }

    public static Burger getBurger(BurgerType burgerType) {
        return Optional.ofNullable(burgerMap.get(burgerType))
                .orElseThrow(() -> new IllegalArgumentException("Invalid burger type: " + burgerType));
    }

    public void registerBurger(BurgerType burgerType, Burger burger) {
        burgerMap.put(burgerType, burger);
    }
    
}

class BurgerStore {
    public static void main(String[] args) {
        Burger burger = BurgerFactory.getBurger(BurgerType.MEDIUM);
        burger.prepareBurger();
    }
}
