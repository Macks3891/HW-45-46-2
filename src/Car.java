/**
 * Класс, представляющий автомобиль с полями model, year и color.
 * Реализует интерфейс Comparable для сравнения объектов Car.
 */
public class Car implements Comparable<Car> {
    private String model;
    private int year;
    private String color;

    /**
     * Конструктор для создания объекта Car.
     *
     * @param model Модель автомобиля.
     * @param year  Год выпуска автомобиля.
     * @param color Цвет автомобиля.
     */
    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    /**
     * Возвращает модель автомобиля.
     *
     * @return Модель автомобиля.
     */
    public String getModel() {
        return model;
    }

    /**
     * Возвращает год выпуска автомобиля.
     *
     * @return Год выпуска автомобиля.
     */
    public int getYear() {
        return year;
    }

    /**
     * Возвращает цвет автомобиля.
     *
     * @return Цвет автомобиля.
     */
    public String getColor() {
        return color;
    }

    /**
     * Сравнивает текущий объект Car с другим объектом Car.
     * Сначала сравнивается модель, затем год по убыванию, и наконец цвет.
     *
     * @param other Другой объект Car для сравнения.
     * @return Результат сравнения: отрицательное число, если текущий объект меньше,
     *         положительное число, если текущий объект больше,
     *         ноль, если объекты равны.
     */
    @Override
    public int compareTo(Car other) {
        int modelComparison = this.model.compareTo(other.model);
        if (modelComparison != 0) {
            return modelComparison;
        }

        int yearComparison = Integer.compare(other.year, this.year);
        if (yearComparison != 0) {
            return yearComparison;
        }

        return this.color.compareTo(other.color);
    }

    /**
     * Возвращает строковое представление объекта Car.
     *
     * @return Строковое представление объекта Car.
     */
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}