package com.kys.study01.Car_Tire_Motocycle;

public class Motocycle {
    public void run(Tire tire) {
        System.out.print("Motocytle ");
        tire.roll();
    }

    public void check(Object object) {
        System.out.print("Motocytle ");
        if ( object instanceof Tire ) {
            System.out.print("Instance OK : " );
            ((Tire)object).roll();
        }
    }
}