package Proxy;

public class HighResolutionImage implements Image{
    private final String filepath;
    public HighResolutionImage(String filepath) {
        this.filepath = filepath;
        loadImage();
    }

    private void loadImage() {
        System.out.println("Loading image from file path: " + filepath);
    }

    public void display() {
        System.out.println("Displaying high-resolution image");
    }
}

