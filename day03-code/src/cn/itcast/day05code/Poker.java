package cn.itcast.day05code;

public class Poker implements Comparable<Poker>{
    private static int count=1;
    private String color;
    private String number;

    private int id;

    public Poker() {
    }

    public Poker(String color, String number) {
        this.color = color;
        this.number = number;
        this.id = count++;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return this.color+this.number+" ";
    }

    @Override
    public int compareTo(Poker o) {

        return this.id-o.id;
    }
}
