public class Column {

    private int rowsCounter = 0;
    private final String identifier;

    public Column(String identifier) {
        this.identifier = identifier;
    }

    public String nextCellValue() {
        return (rowsCounter++) + ", id: " + identifier;
    }
}