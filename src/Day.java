public enum Day {
    MONDAY("Дуйшомбу куну жава окуйм"),
    TUESDAY(" Шейшемби жава боюнча практика"),
    WEDNESDAY("Шаршемби теория "),
    THURSDAY("  Бейшемби куну soft skill сабагы"),
    FRIDAY(" Жума практика"),
    SATUDAY(" Ишемби онлайн окуу"),
    SUNDAY("Жекшемби куну дем-алыш");

    private String day;

    Day(String day) {

        this.day = day;
    }


    @Override
    public String toString() {
        return day;
    }
}
