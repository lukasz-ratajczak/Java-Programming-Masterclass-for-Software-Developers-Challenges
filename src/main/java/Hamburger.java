import java.util.Scanner;

public class Hamburger {
    private int roll, meat, guacamole, lettuce, tomato, bacon, fries, soda, bbqSouce, ketchup;
    private double price;
    private String type;
    private int maxValue = 4;


    public void getAdditions() {
        chooseAdditions(maxValue);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice() {
        this.price = this.roll * 1.25 + this.meat * 2 + this.guacamole * 0.5 + this.lettuce * 0.2 + this.tomato * 0.3 + this.bacon * 0.5 + this.fries + this.soda + this.bbqSouce * 0.25 + this.ketchup * 0.15;
    }

    public String getType() {
        return type;
    }

    public void setType() {
        this.type = getClass().getSimpleName();
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll() {
        this.roll += 1;
    }

    public int getMeat() {
        return meat;
    }

    public void setMeat() {
        this.meat += 1;
    }

    public int getGuacamole() {
        return guacamole;
    }

    public void setGuacamole() {
        this.guacamole += 1;
    }

    public int getLettuce() {
        return lettuce;
    }

    public void setLettuce() {
        this.lettuce += 1;
    }

    public int getTomato() {
        return tomato;
    }

    public void setTomato() {
        this.tomato += 1;
    }

    public int getBacon() {
        return bacon;
    }

    public void setBacon() {
        this.bacon += 1;
    }

    public int getFries() {
        return fries;
    }

    public void setFries() {
        this.fries += 1;
    }

    public int getSoda() {
        return soda;
    }

    public void setSoda() {
        this.soda += 1;
    }

    public int getBbqSouce() {
        return bbqSouce;
    }

    public void setBbqSouce() {
        this.bbqSouce += 1;
    }

    public int getKetchup() {
        return ketchup;
    }

    public void setKetchup() {
        this.ketchup += 1;
    }

    public void chooseAdditions(int maxValue) {
        int total = 0;
        Scanner scanner = new Scanner(System.in);
        while (total < maxValue) {
            System.out.println("Choose additions:");
            System.out.println("1) Extra meat");
            System.out.println("2) Extra guacamole");
            System.out.println("3) Extra lettuce");
            System.out.println("4) Extra tomato");
            System.out.println("5) Extra bacon");
            System.out.println("6) Extra fries");
            System.out.println("7) Extra soda");
            System.out.println("8) Extra bbq souce");
            System.out.println("9) Extra ketchup");



            int selector = scanner.nextInt();

            switch (selector) {
                case 1:
                    setMeat();
                    total++;
                    break;
                case 2:
                    setGuacamole();
                    total++;
                    break;
                case 3:
                    setLettuce();
                    total++;
                    break;
                case 4:
                    setTomato();
                    total++;
                    break;
                case 5:
                    setBacon();
                    total++;
                    break;
                case 6:
                    setFries();
                    total++;
                    break;
                case 7:
                    setSoda();
                    total++;
                    break;
                case 8:
                    setBbqSouce();
                    total++;
                    break;
                case 9:
                    setKetchup();
                    total++;
                    break;
                default:
                    break;
            }
        }
        setPrice();
    }
}
