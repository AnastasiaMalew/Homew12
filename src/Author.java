public class Author {
    private String nameAuthor;
    private String famousAuthor;

    public Author(String name, String famous) {
        this.nameAuthor = name;
        this.famousAuthor = famous;
    }
    public String getNameAuthor () {
        return this.nameAuthor;
    }
    public String getFamousAuthor () {
        return this.famousAuthor;
    }
}
