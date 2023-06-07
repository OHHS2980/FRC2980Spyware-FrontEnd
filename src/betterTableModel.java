
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class betterTableModel extends DefaultTableModel{

    public final List<Column> columns = new ArrayList<>();
    public TableColumn addEPA() {
        String identifier = "EPA";
        columns.add(new Column("EPA"));
        addColumn(identifier);
        TableColumn tc = new TableColumn();
        tc.setIdentifier("EPA");
        tc.setHeaderValue("EPA");
        tc.setModelIndex(columns.size() - 1);
        return tc;
    }

    public void addRow() {

        Object[] row = columns.stream().map(Column::nextCellValue).toArray();
        insertRow(0, row);
    }
}