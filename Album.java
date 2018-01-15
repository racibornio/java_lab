package pl.patryk.jipp.lab.lab2;

public class Album {
    private boolean disc;
    private boolean box;
    private boolean cover;
    private int price;

    public boolean isDisc() {
        return disc;
    }

    public void setDisc(boolean disc) {
        this.disc = disc;
    }

    public boolean isBox() {
        return box;
    }

    public void setBox(boolean box) {
        this.box = box;
    }

    public boolean isCover() {
        return cover;
    }

    public void setCover(boolean cover) {
        this.cover = cover;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
