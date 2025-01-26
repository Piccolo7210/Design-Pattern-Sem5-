package Composite_Pattern;

public class File implements FileSystem{
    private String name;
    private String content;
    public File(String name, String content){
        this.name=name;
        this.content=content;
    }
    @Override
    public boolean search(String keyword) {
        if(this.content.contains(keyword)){
            System.out.println(this.name+" file has this content -''"+this.content+"''");
            return true;
        }
        return false;
    }
}
