package Classes;

/**
 * Класс видекарт
 */
public class VideoCard {
    private final String model;
    private final Double volume;
    private final String type;

    /**
     * Конструктор
     * @param model Производитель
     * @param volume Видеопамять
     * @param type Модель
     */
    public VideoCard(String model, Double volume, String type) {
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
     * Получить значение видеопамяти
     * @return
     */
    public Double getVolume() {
        return volume;
    }
    /**
     * Получить модель видеокарты
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     * Перевести в текстовый формат (Производитель, модель видеокарты, видеопамять)
     * @return
     */
    @Override
    public String toString() {
        return "VideoCard{" +
                model +
                ", " + type +
                ", " + volume +
                "Gb}";
    }
}
