package org.example.Lab2;

class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }


    public void execute() {
        light.turnOn();
    }
}
