import java.util.List;

public abstract class Book{
    private String title,author;

    public Book(String Title,String Author){
        this.title = Title;
        this.author = Author;
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }

    public void setTitle(String Title){
        this.title = Title;
    }
    public void setAuthor(String Author){
        this.author = Author;
    }

    public abstract void RemoveBook();
    public abstract void AddBook();
}