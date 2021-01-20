package com.company.StateDesignPattern.A;

public class Dashboard {
    private Alarm state;
    private Alarm disconnect = new Disconnect();
    private Alarm alert = new Alert();
    private Alarm maintenance = new Maintenance();

    public Dashboard(){
        state = disconnect;
    }

    public void setState(int options){
        switch (options){
            case 1:
                System.out.println("Has encendido la alarma.");
                state = alert;
                break;
            case 2:
                System.out.println("Has apagado la alarma.");
                state = disconnect;
                break;
            case 3:
                System.out.println("Has puesto la alarma en modo mantenimeinto.");
                state = maintenance;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + options);
        }
    }

    public void showState(){
        state.showState();
    }

    public void executeAlarm(){
        state.execute();
    }

}
