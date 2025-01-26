package Proxy;

public class ProxyImage implements Image{
    private HighResolutionImage highResolutionImage;
    private String imageFilePath;

    public ProxyImage(String imageFilePath) {
        this.imageFilePath = imageFilePath;
    }

    public void display() {
        if (highResolutionImage == null) {
            highResolutionImage = new HighResolutionImage(imageFilePath);
        }
        highResolutionImage.display();
    }
    public String toString(){
        return imageFilePath;

    }
}
