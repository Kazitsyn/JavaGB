package Classes;

/**
 * Клас ПЗУ
 */
public class ROM {
    private final String model;
    private final Double volume;
    private final String type;

    /**
     * Конструктор
     * @param model Производитель
     * @param volume Объем памяти
     * @param type Тип ПЗУ
     */
    public ROM(String model, Double volume, String type) {
        this.model = model;
        this.volume = volume;
        this.type = type;
    }
    /**
     * Перевести в текстовый формат (Производитель, Объем памяти, Тип ПЗУ)
     * @return
     */
    @Override
    public String toString() {
        return "ROM{" +
                model +
                ", " + type +
                ", " + volume +
                "Gb}";
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
     * Получить тип памяти
     * @return
     */
    public String getType() {
        return type;
    }
}
