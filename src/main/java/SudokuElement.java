import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SudokuElement {

    private int value = -1;
    private List<Integer> possibleValues = new ArrayList<>();

    public SudokuElement() {
        for (int i =1; i<10; i++) {
            possibleValues.add(i);
        }
    }

    public List<Integer> getPossibleValues() {
        return possibleValues;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public String toString() {
        if (value == -1) {
            return " ";
        } else  {
            return String.valueOf(value);
        }
    }

    public void guessValue() { ///potestowac
        Random rand = new Random();
        int valueIndex = rand.nextInt(getPossibleValues().size());
        int newValue = possibleValues.get(valueIndex);
        setValue(newValue);
    }

    public void setLastPossibleValue() {
        setValue(possibleValues.get(0));
    }

    public boolean isEmpty() {
        if (getValue() == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void removeFromPossibleValues(int value) {
        getPossibleValues().remove(Integer.valueOf(value));
    }
}
