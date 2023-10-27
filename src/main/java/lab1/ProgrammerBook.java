package lab1;

public class ProgrammerBook extends Book{
    private String language;
    private int level;

    public ProgrammerBook () {
    }
    public ProgrammerBook(String title, String author, int price, int isbn, int edition, String language, int level) {
        super(title, author, price ,isbn, edition);
        this.language = language;
        this.level = level;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(int newLanguage) {
        level = newLanguage;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int newLevel) {
        level = newLevel;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass() != getClass()) {
            return false;
        }
        ProgrammerBook book = (ProgrammerBook) object;
        if (language != book.language  ||
                level != book.level) {
            return false;
        }
        return true;
    }
    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash += (language != null ? language.hashCode() : 0);
        hash *= (level != 0 ? level : 1);
        return hash;
    }
    @Override
    public String toString() {
        StringBuilder stringFormer = new StringBuilder();
        stringFormer.append(getClass() + "(")
                .append("title: " + super.getTitle() + "; ")
                .append("author: " + super.getAuthor() + "; ")
                .append("price: " + super.getPrice() + "; ")
                .append("isbn: " + super.getIsbn() + "; ")
                .append("edition: " + Book.getEdition() + "; ")
                .append("language: " + language + "; ")
                .append("level: " + level + ")");
        return stringFormer.toString();
    }

}
