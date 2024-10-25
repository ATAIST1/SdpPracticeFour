package org.example.Lab3;

class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }


    public boolean interpret(String context) {
        return context.contains(data);
    }
}
