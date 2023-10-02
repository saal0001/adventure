package adventurepack;

import java.time.LocalDate;

public class Food extends Item {
private LocalDate expTime;
private int healthPoints;

    public Food(String name, String description,int healthPoints) {
        super(name, description);
        this.healthPoints=healthPoints;
    }

    public String getName(){
        return super.getName();
    }

    public String getDescription(){
        return super.getDescription();
    }

    public LocalDate getExpTime(){
        return expTime;
    }
    public int getHealthPoints(){
        return healthPoints;
    }

        @Override
        public String toString() {
            return "Food{" +
                    "name='" + getName() + '\'' +
                    ", description='" + getDescription() + '\'' +
                    '}';
        }
    }

