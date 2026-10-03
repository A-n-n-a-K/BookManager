
public class Book {
	private String title;
    private String author;
    private String genre;
    private int rating; 
    private boolean isRead;
                                                                
    public Book(String title, String author, String genre, int rating) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.rating = rating;
        this.isRead = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    
    public String getGenre() { //new
    	return genre;
    }
    
    public int getRating() { //new
    	return rating;
    }
    
    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        this.isRead = read;
    }

    //when you add author, book, and year info it'll display it
    @Override
    public String toString() {
        return title + " by " + author 
        		+ ". Genre: " + genre + ", Rating: " + rating + "+"; //new
    }
}
