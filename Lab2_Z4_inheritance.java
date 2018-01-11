package pl.patryk.jipp.lab.lab2;

public class Lab2_Z4_inheritance {
    public static void main(String[] args) {
        Album albumA = new Album();
        albumA.setBox(true);
        albumA.setCover(true);
        albumA.setDisc(true);
        albumA.setPrice(40);
        System.out.println("Your favourite band has just released their brand new album. It contains following elements: plastic box - " + albumA.isBox() + ", colorized cover - " + albumA.isCover() + ", a physic disc - "
                + albumA.isDisc() + " and it costs " + albumA.getPrice() + " PLN."
        );

        AlbumExtendedRelease albumB = new AlbumExtendedRelease();
        albumB.setBox(true);
        albumB.setCover(true);
        albumB.setDisc(true);
        albumB.setPrice(140);
        albumB.setAnniversaryBook(true);
        System.out.println("Your most favourite band has just released their brand new album. As it is their 20th anniversary it contains following elements: plastic box - " + albumB.isBox() + ", colorized cover - " + albumB.isCover() + ", a physic disc - "
                + albumB.isDisc() + " and the special band history book - " + albumB.isAnniversaryBook() + " so it costs " + albumB.getPrice() + " PLN."
        );
    }
}
