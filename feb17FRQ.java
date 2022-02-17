public class feb17FRQ {
    // part 2
    // for loop doesn't work because it was decreasing i.
    public int getValueat(int row, int col) {
        for (SparseArrayEntry e: entries) {
            if (e.getRow() == row && e.getCol() == col) {
                return e.getValue();
            }
        }
        return 0;
    }

    public void removeColumn(int col) {
        int i = 0;
        while (i < entries.size()) {
            SparseArrayEntry temp= entries.get(i);
            if (temp.getCol = col) {
                entries.remove(i);
            }
            else if (temp.getCol > col) {
                entries.set(i, new SparseArrayEntry(temp.getRow(), tempgetCol()-1), temp.getValue());
                i++;
            }
            else {
                i++;
            }

        }
        numCols--;
    }
}
