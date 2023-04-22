package Classes;

/**
 * Класс ОЗУ
 */
public class DDR {
    private final String model;
    private final Double volume;
    private final String type;

    /**
     * Конструтор
     * @param model Производитель
     * @param volume Объем памяти
     * @param type Поколение памяти
     */
    public DDR(String model, Double volume, String type) {
        this.model = model;
        this.volume = volume;
        this.type = type;
    }
    /**
     * Получить название производителя
     * @return
     */
    public String getModel() {
        return model;
    }

    /**
     * Получить объем памяти
     * @return
     */
    public Double getVolume() {
        return volume;
    }

    /**
     * Получить поколение памяти
     * @return
     */
    public String getType() {
        return type;
    }
    /**
     * Перевести в текстовый формат (Производитель, поколение памяти, объем памяти)
     * @return
     */
    @Override
    public String toString() {
        return "DDR{" +
                model +
                ", " + type +
                ", " + volume +
                "Gb}";
    }
}
