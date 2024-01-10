public class Wall {
    double width;
    double height;


    public Wall(double genislik, double uzunluk) {
        this.height = uzunluk;
        this.width = genislik;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double genislik) {
        if (genislik < 0) {
            this.width = 0;
        } else {
            this.width = genislik;
        }

    }

    public void setHeight(double uzunluk) {
        if (uzunluk < 0) {
            this.height = 0;
        } else {
            this.height = uzunluk;
        }
    }

    public double getArea() {
        return width * height;
    }
}