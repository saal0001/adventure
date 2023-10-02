package adventurepack;

import java.time.LocalDate;

public class Food extends Item {
LocalDate expTime;
    public Food(String name, String description,LocalDate expTime) {
        super(name, description);
        this.expTime=expTime;
    }


    @Override
    public String toString() {
        return "Food{" + "name"+ getName()
                + "description"+getDescription()+
                "expTime=" + expTime +
                '}';
    }
}
