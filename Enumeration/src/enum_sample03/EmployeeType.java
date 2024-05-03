package enum_sample03;

public enum EmployeeType {

    FULL_TİME(1), PART_TİME(2), PROJECT_BASE(3);

    private int key;

    EmployeeType(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }
}
