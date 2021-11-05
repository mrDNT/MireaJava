package Author;

public class TestAuthor {
    public static void main(String[] args){
        Author author = new Author("John Smith","JohnSmith@somemail.com",'M');
        System.out.println(author);
        author.setEmail("NewJohnSmith@someothermail.com");
        System.out.println(author);
    }
}
